package org.hh.users.dao.impl;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.hh.users.dao.UserExistsException;
import org.hh.users.dao.UserManagementDao;
import org.hh.users.dao.UserNotFoundException;
import org.hh.users.dto.Role;
import org.hh.users.dto.User;
import org.springframework.jdbc.core.JdbcTemplate;

public class UserManagementDaoJdbcImpl extends JdbcTemplate implements UserManagementDao {

    private Logger log = Logger.getLogger(getClass());

    @Override
    public User getUserByEmail(String email) throws UserNotFoundException {
        Connection conn = null;
        try {
            conn = getDataSource().getConnection();
            String createSql = "select id, name, create_date, email, password_hash, status from users where email=?";
            PreparedStatement ps = conn.prepareStatement(createSql);
            ps.setString(1, email);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                User user = new User();
                user.setId(rs.getInt(1));
                user.setName(rs.getString(2));
                user.setCreationDate(new java.util.Date(rs.getDate(3).getTime()));
                user.setEmail(rs.getString(4));
                user.setPasswordHash(rs.getString(5));
                user.setStatus(rs.getInt("status"));
                user.setRoles(getUserRoles(user.getId()));
                return user;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                conn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        throw new UserNotFoundException(new Exception("А нет!"));
    }

    @Override
    public User createUser(User user) throws UserExistsException {
        Connection conn = null;
        try {
            conn = getDataSource().getConnection();
            String createSql = "insert into users (name, create_date, email, password_hash, status) values (?, ?, ?, ?, ?)";
            conn.setAutoCommit(false);
            PreparedStatement ps = conn.prepareStatement(createSql, Statement.RETURN_GENERATED_KEYS);

            ps.setString(1, user.getName());
            ps.setDate(2, new Date(System.currentTimeMillis()));
            ps.setString(3, user.getEmail());
            ps.setString(4, user.getPasswordHash());
            ps.setInt(5, user.getStatus());

            ps.execute();

            ResultSet genKeys = ps.getGeneratedKeys();
            //TODO get generated user ID
            genKeys.next();
            user.setId(genKeys.getInt(1));
         

            String createSql2 = "insert into user_roles (user_id, role_id) values (?, ?)";
            PreparedStatement ps2 = conn.prepareStatement(createSql2);
            for (Role role : user.getRoles()) {
                ps2.setInt(1, user.getId());
                ps2.setInt(2, role.getId());
                ps2.execute();
            }

            conn.commit();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                conn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return user;
    }

    @Override
    public List<User> getAllUsers() throws UserNotFoundException {
        Connection conn = null;
        List<User> allUsers = new ArrayList<User>();
        try {

            conn = getDataSource().getConnection();
            String sql = "select id, name, create_date, email,  status from users ";
            PreparedStatement state = conn.prepareStatement(sql);
            ResultSet rs = state.executeQuery();

            while (rs.next()) {
                User user = new User();
                user.setId(rs.getInt(1));
                user.setName(rs.getString(2));
                java.util.Date newDate = new Date(rs.getDate(3).getTime());
                user.setCreationDate(newDate);
                user.setEmail(rs.getString(4));
                user.setStatus(rs.getInt(5));
                user.setRoles(getUserRoles(user.getId()));
                allUsers.add(user);
            }

            return allUsers;

        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException();
        }  finally {
	            try {
	                conn.close();
	            } catch (Exception e) {
	                e.printStackTrace();
	            }
            }
    }

    @Override
    public void deleteAllUsers() {
        // TODO Auto-generated method stub

    }

    @Override
    public void deleteUserByEmail(String email) throws UserNotFoundException {
        Connection conn = null;
        try {
            conn = getDataSource().getConnection();
            String sqlreq = "delete from users where email = ?";
            PreparedStatement state = conn.prepareStatement(sqlreq);
            state.setString(1, email);
            state.execute();
        } catch (SQLException e) {
            throw new UserNotFoundException(e);
        } finally {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }

    @Override
    public User changePassword(String email, String passwordHash) {
        Connection conn = null;
        try {
            conn = getDataSource().getConnection();
            String sqlreq = "update users set password_hash=? where email=?";
            PreparedStatement ps = conn.prepareStatement(sqlreq);
            ps.setString(1, passwordHash);
            ps.setString(2, email);
            ps.addBatch();
            ps.execute();

            log.info("User with email " + email + "change password");

            User user = getUserByEmail(email);
            return user;

        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException();
        } finally {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public List<Role> getUserRoles(int userId) {
        Connection conn = null;
        try {
            conn = getDataSource().getConnection();
            String sql = "select role_id from user_roles where user_id=?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, userId);

            List<Integer> userRoleIds = new ArrayList<Integer>();
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                int roleId = rs.getInt(1);
                userRoleIds.add(roleId);
            }
            log.info("Loaded roles for user ID: " + userId);
            return getRoles(userRoleIds);
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException();
        } finally {
            try {
                conn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            }
    }

    public List<Role> getRoles(List<Integer> roleIds) {
        List<Role> roles = new ArrayList<Role>();
        Connection conn = null;
        try {
            conn = getDataSource().getConnection();
            String sql = "select id, name from roles where id=?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            for (Integer id : roleIds) {
                stmt.setInt(1, id);
                ResultSet rs = stmt.executeQuery();

                while (rs.next()) {
                    int roleId = rs.getInt(1);
                    String name = rs.getString(2);
                    Role role = new Role(roleId, name);
                    roles.add(role);
                }
            }
            return roles;

        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException();
        } finally {
            try {
                conn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

	@Override
	public User changeStatusToBlocked(String email, boolean blocked) {
		 Connection conn = null;
		  
		  int status;
		  if(!blocked){
			  status = 0;
		  }else{
			  status = 1;
		  }
	        try {
	        		conn = getDataSource().getConnection();
		            String sqlreq = "update users set status=? where email=?";
		            PreparedStatement ps = conn.prepareStatement(sqlreq);
		            ps.setInt(1, status);
		            ps.setString(2, email);
		            ps.addBatch();
		            ps.execute();
		           
	            if(blocked){
	            	log.info("Account with email " + email + " blocked");
	            } else{
	            	log.info("Account with email " + email + " activate");
	            }
	            
	            return getUserByEmail(email);
	        	
	        } catch (Exception e) { 
	            e.printStackTrace();
	            throw new RuntimeException();
	        } 
	        
	       
	}

	@Override
	public User overwriteUser (User user) {
		 Connection conn = null;
		  
		
		 try {
				conn = getDataSource().getConnection();
		            String createSql = "update users set name = ?, password_hash = ?, status = ? where email=?;";
		            conn.setAutoCommit(false);
		            PreparedStatement ps = conn.prepareStatement(createSql);

		            ps.setString(1, user.getName());
		            ps.setString(2, user.getPasswordHash());
		            ps.setInt(3, user.getStatus());
		            ps.setString(4, user.getEmail());
		            ps.execute();
		            
		            String deleteOldRoles = "delete from user_roles where user_id = ?";
		            PreparedStatement ps2 = conn.prepareStatement(deleteOldRoles);
		            ps2.setInt(1, user.getId());
		            ps2.execute();

		            String createSql3 = "insert into user_roles (user_id, role_id) values (?, ?)";
		            PreparedStatement ps3 = conn.prepareStatement(createSql3);
		           
		            for (Role role : user.getRoles()) {
		                ps3.setInt(1, user.getId());
		                ps3.setInt(2, role.getId());
		                ps3.execute();
		            } 

		            conn.commit();
		           

	        } catch (Exception e) {
	            e.printStackTrace();
	            throw new RuntimeException();
	        } finally {
	            try {
	                conn.close();
	            } catch (SQLException e) {
	                e.printStackTrace();
	            }
	        }
		 return user;
	}
	 
}
