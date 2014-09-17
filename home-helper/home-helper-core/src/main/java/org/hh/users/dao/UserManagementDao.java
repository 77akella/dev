package org.hh.users.dao;

import java.util.List;

import org.hh.users.dto.Role;
import org.hh.users.dto.User;

public interface UserManagementDao {

    public User getUserByEmail(String email) throws UserNotFoundException;

    public User createUser(User user) throws UserExistsException;

    public List<User> getAllUsers() throws UserNotFoundException;

    public void deleteAllUsers();
    
    public void deleteUserByEmail (String email) throws UserNotFoundException;
    
    public User changePassword(String email, String passwordHash);
    
    public List<Role> getUserRoles(int userId);
    
    public User changeStatusToBlocked(String email, boolean blocked);
    
    public User overwriteUser(User user);
    
    

}
