package org.hh.users.bp;

/**
 * Интерфейс для работы с паролями
 */
public interface PasswordGeneratorBP {

    /**
     * Создает случайный пароль
     * 
     * @return строчку с новым паролем
     */
    public String generatePassword();

    /**
     * Возвращает хэш от пароля.
     * 
     * @param password пароль
     * @return строчка с хэшем
     */
    public String calculateHash(String password);

    /**
     * Проверяет соответсвует ли заданый пароль и хэш.
     * 
     * @param password пароль
     * @param hash хэш
     * @return <b>true</b> если пароль соответствует хэшу, <b>false</b> в обратном случае
     */
    public boolean isValidPassword(String password, String hash);

}
