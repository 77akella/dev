package org.hh.users.bp;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.hh.users.bp.impl.HumanVerificationBPImpl;

import junit.framework.TestCase;

public class HumanVerificationBPTest extends TestCase {
	private Logger log = Logger.getLogger(getClass());
	
	private HumanVerificationBPImpl verification;
	
	
	
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
	}

	protected void setUp() throws Exception {
		super.setUp();
		verification = new HumanVerificationBPImpl();
		log.debug("Context initialized for test");
	}

	protected void tearDown() throws Exception {
		super.tearDown();
		log.debug("Test tear down ok");
	}

	
	public void testVerification(){
		String a = verification.getQuestion();
		log.info("verification.getQuestion()  "+a);
		String b = quest.get(a);
		log.info("quest.get(a)  "+b);
		assertTrue(verification.isAnswerOk(a, b));
		log.info("verification.isAnswerOk(a, b)  "+verification.isAnswerOk(a, b));
	}
	
	
	public void testNullException(){
		String a = verification.getQuestion();
		log.info("verification.getQuestion()  "+a);
		
		String b = quest.get(a);
		log.info("quest.get(a)  "+b);
		
		assertNotNull(a);
		assertNotNull(b);
	}
	
	

}
