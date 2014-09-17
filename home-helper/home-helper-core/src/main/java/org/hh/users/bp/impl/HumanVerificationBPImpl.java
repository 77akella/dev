package org.hh.users.bp.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.hh.users.bp.HumanVerificationBP;

public class HumanVerificationBPImpl implements HumanVerificationBP {
	
	private final Map<String, String> quest = new HashMap<String,String>();
	{
		quest.put(" How many eyes does a typical person have?", "2");
		quest.put("How many legs on a typical dog?", "4");
		quest.put("How many units in a dozen?", "12");
		quest.put("Name of the actor Di Caprio?", "Leonardo");
		quest.put("What is the number after six?", "7");
		quest.put("How many days in a week?", "7");
		quest.put("How many days in July?", "31");
		quest.put("How much is 2+2?", "4");
		quest.put("25+32", "57");
		quest.put("What are the last 2 words in this question? ", "this question");
		quest.put("What colour is a blue apple?  ", "blue");
		quest.put("What size is a big dog?  ", "big");
		quest.put("What is the very last letter  in this question?  ", "n");
		quest.put("How many legs has a 3 legged spider?   ", "3");
		quest.put("How many strings has a 9 string guitar? ", "9");
		quest.put("My dog is a spaniel, what breed is he? ", "spaniel");
		quest.put("What day comes after Thursday  ", "Friday");
		quest.put("What is the capital of England?", "London");
		quest.put("What continent is France in?", "Europe");
		quest.put("Write in reverse order this words: Rats live on  ", "No evil star");
		quest.put("Write in reverse order this word: slipknot ", "tonkpils");
		quest.put("Are you a botyara? (yes or no)", "no");
		quest.put("What color is green blood?", "green");
		quest.put("What is six times two?", "12");
	}
     	
    /**
     * @return возвращает случайный вопрос, который является ключом в HashMap 
     */
    @Override
    public String getQuestion() {
List<String> list = new ArrayList<String>(quest.keySet());
Random rnd = new Random();
return list.get(rnd.nextInt(list.size()));
    }

    /**
     * @param question параметр в который передается вопрос заданный юзеру
     * @param answer параметр в который передается ответ юзера на заданный ему вопрос
     * @return boolean возвращает true, если ответ юзера совпал с value в Hashmap на соответствующий вопрос. 
     */
    @Override
    public boolean isAnswerOk(String question, String answer) {
    	//do check for compliance
    	
    	return quest.get(question) != null ? quest.get(question).equals(answer):false;
    }
}
