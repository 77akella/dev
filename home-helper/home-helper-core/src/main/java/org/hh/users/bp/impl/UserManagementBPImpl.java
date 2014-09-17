package org.hh.users.bp.impl;

import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.hh.email.bp.EmailSenderBP;
import org.hh.users.bp.InvalidLoginOrPasswordException;
import org.hh.users.bp.LinkGeneratorBP;
import org.hh.users.bp.PasswordGeneratorBP;
import org.hh.users.bp.UserManagementBP;
import org.hh.users.dao.UserExistsException;
import org.hh.users.dao.UserManagementDao;
import org.hh.users.dao.UserNotFoundException;
import org.hh.users.dto.Role;
import org.hh.users.dto.User;

public class UserManagementBPImpl implements UserManagementBP {

    private Logger log = Logger.getLogger(getClass());
    private UserManagementDao userManagementDao;
    private PasswordGeneratorBP passwordGeneratorBP;
    private String defaultAdminEmail;
    private String defaultAdminPassword;
    private EmailSenderBP emailSenderBP;
    private int activationLinkLifetimeInDays = 3;
    private LinkGeneratorBP linkGeneratorBP;

    public void setLinkGeneratorBP(LinkGeneratorBP linkGeneratorBP) {
        this.linkGeneratorBP = linkGeneratorBP;
    }

    public void setActivationLinkLifetimeInDays(int activationLinkLifetimeInDays) {
        this.activationLinkLifetimeInDays = activationLinkLifetimeInDays;
    }

    public void setEmailSenderBP(EmailSenderBP emailSenderBP) {
        this.emailSenderBP = emailSenderBP;
    }

    public void setDefaultAdminEmail(String defaultAdminEmail) {
        this.defaultAdminEmail = defaultAdminEmail;
    }

    public void setDefaultAdminPassword(String defaultAdminPassword) {
        this.defaultAdminPassword = defaultAdminPassword;
    }

    public void setPasswordGeneratorBP(PasswordGeneratorBP passwordGeneratorBP) {
        this.passwordGeneratorBP = passwordGeneratorBP;
    }

    public void setUserManagementDao(UserManagementDao userManagementDao) {
        this.userManagementDao = userManagementDao;
    }

    @Override
    public User getUserByEmail(String email) throws UserNotFoundException {
        return userManagementDao.getUserByEmail(email);
    }

    @Override
    public User login(String email, String password) throws InvalidLoginOrPasswordException {
        try {
            User user = userManagementDao.getUserByEmail(email);
            if (!passwordGeneratorBP.isValidPassword(password, user.getPasswordHash())) {
                throw new InvalidLoginOrPasswordException();
            }
            return user;
        } catch (UserNotFoundException e) {
            throw new InvalidLoginOrPasswordException();
        }
    }

    @Override
    public User createUser(String email, String name, boolean craftsman) throws UserExistsException {
        try {
            User u = getUserByEmail(email);
            throw new UserExistsException();
        } catch (UserNotFoundException e) {
            User user = new User();
            String password = passwordGeneratorBP.generatePassword();
            user.setEmail(email);
            user.setPasswordHash(passwordGeneratorBP.calculateHash(password));
            user.setName(name);
            user.getRoles().add(Role.CONSUMER);
            
            if(craftsman == true) {
            	user.getRoles().add(Role.CRAFTSMAN);
            }
            

            Calendar cal = Calendar.getInstance();
            cal.add(Calendar.DAY_OF_YEAR, activationLinkLifetimeInDays);

            Map<String, String> params = new HashMap<String, String>();
            params.put("user_email", email);
            params.put("user_password", password);

            emailSenderBP.sendEmailToUser(email, "[HomeHelper] Регистрация", "welcome.txt", params);
            return userManagementDao.createUser(user);
        }
    }

    public void initDefaultUser() {
        log.info("Checking inital users setup");
        try {
            userManagementDao.getUserByEmail(defaultAdminEmail);
        } catch (UserNotFoundException ex) {
            log.info("Creating default admin user");
            User user = new User();
            user.setEmail(defaultAdminEmail);
            Role role = Role.ADMIN;
            user.setName("admin");
            user.getRoles().add(role);
            user.setPasswordHash(passwordGeneratorBP.calculateHash(defaultAdminPassword));
            try {
                userManagementDao.createUser(user);
            } catch (UserExistsException e) {
                // не должно происходить, потому что сверху только что проверили, что его нет
                log.fatal("Should not happen", e);
            }
        }
    }

    @Override
    public List<User> getAllUsers() throws UserNotFoundException {
        return userManagementDao.getAllUsers();
    }

    @Override
    public User changePassword(String email, String password) {
        return userManagementDao.changePassword(email, passwordGeneratorBP.calculateHash(password));
    }

	
	@Override
	public User changeStatusToBlocked(String email, boolean blocked) {
		return userManagementDao.changeStatusToBlocked(email, blocked);
	}

	@Override
	public User overwriteUser(User user) {
		return userManagementDao.overwriteUser(user);
	}
}
