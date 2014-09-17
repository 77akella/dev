package org.hh.users.bp;

import junit.framework.TestCase;

import org.apache.log4j.Logger;
import org.hh.users.dao.UserExistsException;
import org.hh.users.dao.UserNotFoundException;
import org.hh.users.dto.Role;
import org.hh.users.dto.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserManagementTest extends TestCase {

    private Logger log = Logger.getLogger(getClass());

    private static final String[] configLocations = new String[] {
            "classpath:/org/hh/users/ctx/users-ctx.xml",
            "classpath:/org/hh/email/ctx/email-ctx.xml",
            "classpath:/org/hh/email/ctx/email-test-ctx.xml"
    };

    private ClassPathXmlApplicationContext ctx;

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        ctx = new ClassPathXmlApplicationContext(configLocations);
        log.debug("Context initialized for test");
    }

    @Override
    protected void tearDown() throws Exception {
        ctx.destroy();
        super.tearDown();
        log.debug("Test tear down ok");
    }

    public void testContextIsCorrectlySetup() {
        UserManagementBP userManagementBP = (UserManagementBP) ctx.getBean("userManagementBP");
        assertNotNull("Наш бин должен быть не null", userManagementBP);
        log.info("Context setup is ok");
    }

    public void testCreationOfDefaultUser() {
        UserManagementBP userManagementBP = (UserManagementBP) ctx.getBean("userManagementBP");
        try {
            User admin = userManagementBP.getUserByEmail("77akella@gmail.com");
            boolean adminRoleFound = false;
            for (Role role : admin.getRoles()) {
                if (Role.ROLE_ADMIN.equals(role.getName())) {
                    adminRoleFound = true;
                }
            }
            assertTrue("Должна быть назначена роль админа", adminRoleFound);
        } catch (UserNotFoundException e) {
            assertTrue("Пользователь должен быть создан", false);
        }
    }

    public void testUserCreation() {
        UserManagementBP userManagementBP = (UserManagementBP) ctx.getBean("userManagementBP");
        try {
            String email = "vasja.puplin@moscow.ry";
            String name = "Vasiliy";
            log.debug("Trying to create user " + email);
            User user = userManagementBP.createUser(email, name, false);
            assertNotNull("Пользователь не может быть null", user);
        } catch (UserExistsException e) {
            e.printStackTrace();
        }
    }
}
