package org.hh.users.bp;

import java.util.Date;

/**
 * Интерфейс для работы с линками для активации новых пользователей.
 */
public interface LinkGeneratorBP {

    /**
     * По заданым адресу и дате создает закодированную строчку, которая станет частью линка для активации
     * 
     * @param email адрес пользователя
     * @param latestVerificationDate крайняя дата, когда данный линк можно использовать
     * @return закодированую строчку
     */
    public String generateVerificationKey(String email, Date latestVerificationDate);

    /**
     * Раскодирует ключ активации, извлекает из него адрес пользователя и максимальную дату активации.
     * 
     * @param verificationKey ключ, который передается в линке для активации
     * @return адрес пользователя, закодированный в ключе
     * @throws Exception если дата, закодированая в ключе меньше, чем текущая. т.е. срок активации истек
     */
    public String getEmailFromLink(String verificationKey) throws Exception;
}
