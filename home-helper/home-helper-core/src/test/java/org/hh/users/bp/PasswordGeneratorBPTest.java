package org.hh.users.bp;

import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

import org.hh.users.bp.impl.PasswordGeneratorBPImpl;

public class PasswordGeneratorBPTest extends TestCase {

    private PasswordGeneratorBP bp;

    protected void setUp() throws Exception {
        super.setUp();
        bp = new PasswordGeneratorBPImpl();
    }

    protected void tearDown() throws Exception {
        super.tearDown();
    }

    public void testGeneratePassword() {
        List<String> passwords = new ArrayList<String>();
        for (int i = 0; i < 200; i++) {
            String pwd = bp.generatePassword();
            assertNotNull("Созданный пароль не должен быть null", pwd);
            assertTrue("Длина пароля 6-8 символов: " + pwd, pwd.length() >= 6 && pwd.length() <= 8);
            for (String pwd1 : passwords) {
                assertNotSame("Пароли должны быть случайными", pwd, pwd1);
            }
            passwords.add(pwd);
            System.out.println(pwd);
        }
    }

    public void testCalculateHash() {
        List<String> hashes = new ArrayList<String>();
        for (int i = 0; i < 200; i++) {
            String pwd = bp.generatePassword();
            String hash = bp.calculateHash(pwd);
            Integer.parseInt(hash);
            hashes.add(bp.calculateHash(hash));
            for (String h : hashes) {
                assertNotSame("Хэши должны быть случайными", h, hash);
            }
            System.out.println(pwd);
        }

    }

    public void testIsValidPassword() {
        for (int i = 0; i < 200; i++) {
            String pwd = bp.generatePassword();
            String hash = bp.calculateHash(pwd);
            assertTrue("Пароль и его хэш не прошли проверку", bp.isValidPassword(pwd, hash));
            assertFalse("Пароль и его хэш не должны проходить проверку", bp.isValidPassword(pwd + "a", hash));
        }
    }
}
