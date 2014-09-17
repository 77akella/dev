package org.hh.users.dao;

import java.util.Date;
import java.util.List;

import junit.framework.TestCase;

import org.apache.log4j.Logger;
import org.hh.users.dao.impl.UserManagementDaoXmlImpl;
import org.hh.users.dto.Role;
import org.hh.users.dto.User;

public class UserManagementDaoXmlImplTest extends TestCase {

    UserManagementDaoXmlImpl dao;
    private final String TEST_EMAIL = "test@test.com";
    private Logger logger = Logger.getLogger(getClass());;

    protected void setUp() throws Exception {
        super.setUp();
        dao = new UserManagementDaoXmlImpl();
        dao.setPathToFiles("temp_dir");
        logger.debug("Test setUp");
    }

    protected void tearDown() throws Exception {
        super.tearDown();
        dao.deleteAllUsers(); // Удаляет всех пользователей (даже не тестовых!)
        logger.debug("End of test, all users are removed");
        /*
        
        try{
        dao.deleteUserByEmail(TEST_EMAIL);  
        } catch(Exception e) {
        }
        
        *******************************************************************
         * Удаляет только тестового пользователя с e-mailом test@test.com
         * Не подходит для теста "testGetAllUsers()", так как он создает много пользователей с e-mailами в милисекундах
         * Думаю чистить за собой директорию нужно внутри этого теста, пока оставляю все как есть (не буду менять чужой метод)
        */

    }

    public void testCreateLoadUser() {
        logger.debug("Starting testCreateLoadUser");
        User user = createTestUser(TEST_EMAIL);
        logger.debug("Initialization test-user");

        try {
            dao.createUser(user);
            logger.debug("Create and save test-user");
        } catch (UserExistsException e) {
            assertFalse("Мы не должны получать ошибку при создании первого пользователя", true);
            logger.error("Error creating the first user", e);
        }

        try {
            logger.debug("Trying to load the just created user");
            User user1 = dao.getUserByEmail(TEST_EMAIL);
            assertNotNull("User не должен быть null", user1);
        } catch (UserNotFoundException e) {
            assertFalse("Мы не должны получать ошибку при загрузке первого пользователя", true);
            logger.error("Error loading user", e);
            e.printStackTrace();
        }
    }

    public void testCreateAndDeleteUserByEmail() {
        logger.debug("Starting testCreateAndDeleteUserByEmail");
        User user = createTestUser(TEST_EMAIL);
        logger.debug("Initialization test-user");
        try {
            dao.createUser(user);
        } catch (UserExistsException e1) {
            assertFalse("Мы не должны получать ошибку при создании первого пользователя", true);
            logger.error("Error creating the first user", e1);
        }

        try {
            logger.debug("Trying delete test-user");
            dao.deleteUserByEmail(TEST_EMAIL);
        } catch (UserNotFoundException e1) {
            assertFalse("Пользователь должен быть, мы его только что создали", true);
            logger.error("The user must exist!", e1);
        }

        try {
            logger.debug("Trying load a deleted user ");
            User user1 = dao.getUserByEmail(TEST_EMAIL);
            assertNull("Пользователь не должен загрузится", user1);
        } catch (UserNotFoundException e) {
            assertTrue("Пользователя быть не должно, его только что удалили", true);
            logger.error("User was deleted, test is ok.");
        }

    }

    public void testCreateUserWithSameName() {
        logger.debug("Starting testCreateUserWithSameName");

        try {
            dao.createUser(createTestUser(TEST_EMAIL));
            logger.debug("Initialization and save test-user");
        } catch (UserExistsException e) {
            assertFalse("Мы не должны получать ошибку при создании первого пользователя", true);
            logger.error("Error creating the first user", e);
        }
        boolean exceptioHappened = false;
        try {
            logger.debug("Trying create user with same name");
            dao.createUser(createTestUser(TEST_EMAIL));
        } catch (UserExistsException e) {
            exceptioHappened = true;
            assertTrue("Должен быть exception при создании пользователя с таким же email'ом", exceptioHappened);
            logger.debug("We get the expected UserExistsException");
        }

    }

    public void testGetAllUsers() {
        User user;
        for (int i = 0; i < 10; i++) {
            String str = System.currentTimeMillis() + "@test.com";
            user = createTestUser(str);

            try {
                dao.createUser(user);
            } catch (UserExistsException ex) {
                assertFalse("Мы не должны получить ошибку при создании пользователя", true);
            }

        }

        List<User> listus = null;
        try {
            listus = dao.getAllUsers();

        } catch (UserNotFoundException e) {
            assertFalse("Мы не должны получать ошибку при загрузке первого пользователя", true);
            e.printStackTrace();
        }

        assertTrue("Папка не должна быть пустой!", listus.size() > 0);

        for (User us : listus) {
            assertFalse("Поле \"e-mail\" не должно быть пустым", us.getEmail().isEmpty());
            assertFalse("Поле \"пароль\" не должно быть пустым", us.getPasswordHash().isEmpty());
            assertFalse("Поле \"роль\" не должно быть пустым", us.getRoles().isEmpty());
        }

    }

    private User createTestUser(String email) {
        Role role = Role.ADMIN;
        role.setName("TestRole");

        User user = new User();
        user.setCreationDate(new Date());
        user.setEmail(email);
        user.setPasswordHash("1234");
        user.getRoles().add(role);

        return user;
    }

}
