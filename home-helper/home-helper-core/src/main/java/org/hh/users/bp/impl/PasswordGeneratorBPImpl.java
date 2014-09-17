package org.hh.users.bp.impl;

import java.util.Random;

import org.hh.users.bp.PasswordGeneratorBP;

public class PasswordGeneratorBPImpl implements PasswordGeneratorBP {

    private static final String PASSWORD_SALT = "System stability";

    @Override
    public String generatePassword() {

        char[] alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ_-0123456789"
                .toCharArray(); // Пароль может содержать символы: a-z, A-Z, _,
                                // -, 0-9
        Random rnd = new Random();
        int passwordLength = rnd.nextInt(3) + 6; // Длина пароля 6-8 символов
                                                 // (rnd.nextInt(3) = [0, 2])
        int nextIndex;
        char[] passwordChar = new char[passwordLength];
        for (int i = 0; i < passwordLength; i++) {
            nextIndex = rnd.nextInt(alphabet.length);
            passwordChar[i] = alphabet[nextIndex];
        }
        String password = new String(passwordChar); // преобразуем массив char в
                                                    // строку
        return password;
    }

    @Override
    public String calculateHash(String password) {
        return String.valueOf((PASSWORD_SALT + password).hashCode());
    }

    @Override
    public boolean isValidPassword(String password, String passwordHash) {
        return calculateHash(password).equals(passwordHash);
    }

}
