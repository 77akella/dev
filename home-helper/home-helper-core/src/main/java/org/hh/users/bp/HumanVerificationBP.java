package org.hh.users.bp;

/**
 * Интерфейс для получения случайных вопросов и проверки правильности ответов на них.
 */
public interface HumanVerificationBP {

    /**
     * Возвращает следующий случайный вопрос.
     * 
     * @return строчка с вопросом
     */
    public String getQuestion();

    /**
     * Проверяет ответ на вопрос.
     * 
     * @param question оригинальный вопрос, на который отвечал пользователь.
     * @param answer ответ пользователя
     * @return <b>true</b> если ответ верный, <b>false</b> в обратном случае
     */
    public boolean isAnswerOk(String question, String answer);

}
