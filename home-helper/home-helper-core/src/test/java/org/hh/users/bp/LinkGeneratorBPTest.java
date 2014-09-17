package org.hh.users.bp;

import java.util.Date;

import org.apache.log4j.Logger;
import org.hh.users.bp.impl.LinkGeneratorBPImpl;

import junit.framework.TestCase;

public class LinkGeneratorBPTest extends TestCase {
	private Logger log = Logger.getLogger(getClass());
	
	public LinkGeneratorBPImpl linkGenerator = new LinkGeneratorBPImpl();
	private String wildString;
	
	public void setWildString(String wildString) {
		this.wildString = wildString;
	}

	public void testBothMethods(){
		Date date = new Date(15555);
		String email = "somemail@somedomain.net"; 		
		setWildString(linkGenerator.generateVerificationKey(email, date));
		log.info("\nShould be a wild hash link:\n" + wildString);
		
		String result = null;
		try {
			result = linkGenerator.getEmailFromLink(wildString);
		} catch (Exception e) {
			e.printStackTrace();
		}
		log.info("\nShould be user email from variable before: \n" + result);
		
		assertTrue("e-mails should be equals: ", result.equals(email));
	}

}
