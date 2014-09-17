package org.hh.users.dao.impl;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.hh.users.dao.UserExistsException;
import org.hh.users.dao.UserManagementDao;
import org.hh.users.dao.UserNotFoundException;
import org.hh.users.dto.Role;
import org.hh.users.dto.User;

public class UserManagementDaoXmlImpl implements UserManagementDao {

    private Logger logger = Logger.getLogger(getClass());;
    private final String USER_FILE_EXTENSION = ".xml";
    private String pathToFiles;

    public void setPathToFiles(String pathToFiles) {
        this.pathToFiles = pathToFiles;
    }

    //  <KulakovIvanHomeWork>

    private static String isPathOk(String path) {
        if (path.charAt(path.length() - 1) == '/') {
            return path;
        } else {
            return path + "/";
        }
    }

    private String fileNameByEmail(String email) {
        String path = "user" + email.hashCode() + USER_FILE_EXTENSION;
        return path;
    }

    @Override
    public User getUserByEmail(String email) throws UserNotFoundException {
        try {
            logger.debug("Trying load user with e-mail \"" + email + "\"");
            String pathToFilesCorrect = isPathOk(pathToFiles);
            FileInputStream fis = new FileInputStream(pathToFilesCorrect + fileNameByEmail(email));
            XMLDecoder decoder = new XMLDecoder(fis);
            User user = (User) decoder.readObject();
            decoder.close();
            logger.debug("User with e-mail \"" + email + "\" successfully decoded");
            return user;

        } catch (FileNotFoundException e) {
            logger.debug("File " + fileNameByEmail(email) + " not found");
            throw new UserNotFoundException(e);
        }
    }

    @Override
    public User createUser(User user) throws UserExistsException {
        logger.debug("Trying create new user with e-mail \"" + user.getEmail() + "\"");
        File directoryFile = new File(pathToFiles);

        if (!directoryFile.exists()) {
            directoryFile.mkdirs();
            logger.info("Creating new directory " + pathToFiles);
        }

        String pathToFilesCorrect = isPathOk(pathToFiles);
        String fileName = fileNameByEmail(user.getEmail());
        String finalPath = pathToFilesCorrect + fileName;

        if (new File(finalPath).exists()) {
            logger.debug("User already exists!");
            throw new UserExistsException();
        } else {
            try {
                FileOutputStream fos = new FileOutputStream(finalPath);
                XMLEncoder encoder = new XMLEncoder(fos);
                encoder.writeObject(user);
                encoder.flush();
                encoder.close();
                logger.info("New user with e-mail \"" + user.getEmail() + "\" successfully saved.");
                return user;

            } catch (Exception e) {
                logger.error("An error has occurred", e);
                throw new RuntimeException(e);
            }
        }
    }

    @Override
    public void deleteAllUsers() {
        File directory = new File(isPathOk(pathToFiles));

        if (!directory.exists()) {
            return; // Такой папки не существует, удалять нечего
        }

        for (File f : directory.listFiles()) {
            f.delete();
        }

        directory.delete(); // Удаляет за собой пустую папку. 
        logger.info("All users deleted!");
    }

    @Override
    public void deleteUserByEmail(String email) throws UserNotFoundException {
        try {
            File user = new File(isPathOk(pathToFiles) + fileNameByEmail(email));
            FileInputStream fis = new FileInputStream(user);
            fis.close();
            user.delete();
            logger.info("User with e-mail \"" + email + "\" deleted.");

        } catch (FileNotFoundException e) {
            logger.debug("User with e-mail \"" + email + "\" not found.");
            throw new UserNotFoundException(e);
        } catch (IOException e) {
            logger.error("An error has occurred", e);
        }

    }

    // </KulakovIvanHomeWork>

    @Override
    public List<User> getAllUsers() throws UserNotFoundException {
        List<User> allUsers = new ArrayList<User>();
        File userFilesDirectory = new File(pathToFiles);

        FilenameFilter fnf = new FileListFilter();
        File[] userFilesList = userFilesDirectory.listFiles(fnf);

        if (userFilesList != null) {
            for (File userFile : userFilesList) {
                try {
                    FileInputStream fis = new FileInputStream(userFile);
                    XMLDecoder decoder = new XMLDecoder(fis);
                    User user = (User) decoder.readObject();
                    allUsers.add(user);

                } catch (FileNotFoundException e) {
                    throw new UserNotFoundException(e);
                }
            }
        } else {
            System.out.println(userFilesDirectory.getName() + " is not a file directory!");
        }
        return allUsers;
    }

    class FileListFilter implements FilenameFilter {

        @Override
        public boolean accept(File dir, String name) {

            boolean isOk = true;
            isOk &= name.endsWith(USER_FILE_EXTENSION);
            return isOk;

        }

    }

	@Override
	public User changePassword(String email, String passwordHash)  {
		try {
			User user = getUserByEmail(email);
			user.setPasswordHash(passwordHash);
			user = overwriteUser(user);
			logger.debug("User with e-mail " + email + " change password");
			return user;
		} catch (UserNotFoundException e) {
			throw new RuntimeException();
		}
		
	}
	
	@Override
	public User overwriteUser(User user)  {
		    logger.debug("Trying overwrite user with e-mail \"" + user.getEmail() + "\"");
	        String pathToFilesCorrect = isPathOk(pathToFiles);
	        String fileName = fileNameByEmail(user.getEmail());
	        String finalPath = pathToFilesCorrect + fileName;

	        if (!new File(finalPath).exists()) {
	            return user;
	        } else {
	            try {
	                FileOutputStream fos = new FileOutputStream(finalPath);
	                XMLEncoder encoder = new XMLEncoder(fos);
	                encoder.writeObject(user);
	                encoder.flush();
	                encoder.close();
	                logger.info("User with e-mail \"" + user.getEmail() + "\" successfully overwrited..");
	                return user;

	            } catch (Exception e) {
	                logger.error("An error has occurred", e);
	                throw new RuntimeException(e);
	            }
	        }
		
	}

	@Override
	public List<Role> getUserRoles(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User changeStatusToBlocked(String email, boolean blocked) {
		// TODO Auto-generated method stub
		return null;
	}

}
