package org.hh.users.web;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.hh.email.bp.EmailSenderBP;
import org.hh.users.bp.HumanVerificationBP;
import org.hh.users.bp.LinkGeneratorBP;
import org.hh.users.bp.PasswordGeneratorBP;
import org.hh.users.bp.UserManagementBP;
import org.hh.users.dao.UserNotFoundException;
import org.hh.users.dto.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FeedbackController {
	
	 private LinkGeneratorBP linkGeneratorBP;
	 private PasswordGeneratorBP passwordGeneratorBP;
	 private HumanVerificationBP humanVerificationBP;
     private UserManagementBP userManagementBP;
	 private EmailSenderBP emailSenderBP;
	 private Logger log = Logger.getLogger(getClass());
	
	 public void setLinkGeneratorBP(LinkGeneratorBP linkGeneratorBP) {
		this.linkGeneratorBP = linkGeneratorBP;
	}

	public void setPasswordGeneratorBP(PasswordGeneratorBP passwordGeneratorBP) {
		this.passwordGeneratorBP = passwordGeneratorBP;
	}

	 public void setUserManagementBP(UserManagementBP userManagementBP) {
		this.userManagementBP = userManagementBP;
	}
	
	 public void setHumanVerificationBP(HumanVerificationBP humanVerificationBP) {
		this.humanVerificationBP = humanVerificationBP;
	}
	
	 public void setLog(Logger log) {
		this.log = log;
	 }
	
	 public void setEmailSenderBP(EmailSenderBP emailSenderBP) {
		this.emailSenderBP = emailSenderBP;
	 }
	
	
	@RequestMapping(value="/feedback-check",
			 		method = RequestMethod.GET)
	public ModelAndView sendEmailToSupport(@RequestParam("name") String name, @RequestParam("from") String from, @RequestParam("subject") String subject ,@RequestParam("message") String message, @RequestParam("answer") String answer,
            @RequestParam("question") String question) {
		System.out.println("ДА ДА ЭТА ХЕРНЯ РАБОТАЕТ!!!!1111111");
		ModelAndView model = new ModelAndView();
		List<String> errorsList = new ArrayList<>();
		
		if(!emailSenderBP.isValidEmailAddress(from)){
			errorsList.add("Incorrect email!");
		}
		
		if (!humanVerificationBP.isAnswerOk(question, answer)) {
            errorsList.add("Incorrect answer!");
        }
		
		if(subject == null | subject.equals("") ) {
			errorsList.add("Please complete subject");
		}
		
		if(name == null | name.equals("")) {
			errorsList.add("Please enter your name");
		}
		
		if(message == null | message.equals("")) {
			errorsList.add("Please complete message");
		}
		
		 if (errorsList.size() > 0) {
	            model.addObject("question", humanVerificationBP.getQuestion());
	            model.setViewName("feedback");
	            model.addObject("errors", errorsList);
	            return model;
	     }
		 
		 Map<String, String> params = new HashMap<String, String>();
		 params.put("from", from);
		 params.put("message", message);
		 params.put("name", name);
		 emailSenderBP.sendEmailToUser("support@home-helper.com", subject, "message_to_support.txt", params);
		
		log.debug("Message to support from " + from + " has been sent successfully");
		model.addObject(name);
		model.setViewName("feedback-message");
		return model;
		
	}
	
	 @RequestMapping(
	            value = "/feedback",
	            method = RequestMethod.GET)
	    public ModelAndView register() {
	        log.debug("Открываем страницу поддержки");
	        ModelAndView res = new ModelAndView();
	        res.addObject("question", humanVerificationBP.getQuestion());
	        res.setViewName("feedback");
	        return res;
	    }
	
	 // RESET PASSWORD
	 
	 @RequestMapping(value="/try_resetpassword", method = RequestMethod.POST)
	    public ModelAndView resetPassword(@RequestParam("email") String email, @RequestParam("answer") String answer,
	            @RequestParam("question") String question) {
	    	ModelAndView model = new ModelAndView();
	        List<String> errors = new ArrayList<>();
	    	boolean emailOk = true;
	    	boolean answerOk = true;
	    	 if (!humanVerificationBP.isAnswerOk(question, answer)) {
	             errors.add("Incorrect answer");
	             answerOk = false;
	         }
	    	 
	    	if(!emailSenderBP.isValidEmailAddress(email)){
	    		errors.add("Invalid email");
	    		emailOk = false;
	    	}
	    	
	    	if(emailOk & answerOk){
		    	try {
					User user = userManagementBP.getUserByEmail(email);
				} catch (UserNotFoundException e) {
					errors.add("User with the specified address does not exist");
				}
	    	}
	    	
	    	 if (errors.size() > 0) {
	             model.addObject("question", humanVerificationBP.getQuestion());
	             model.setViewName("reset_password");
	             model.addObject("errors", errors);
	             return model;
	         }
	    	 
	    	    Calendar cal = Calendar.getInstance();
	    	    Map<String, String> params = new HashMap<String, String>();
	    	    String  link = linkGeneratorBP.generateVerificationKey(email, cal.getTime());
		        params.put("reset_link", link);
		        emailSenderBP.sendEmailToUser(email, "[HomeHelper] Восстановление пароля", "resetpassword.txt", params);
		        model.setViewName("reset_send");
		        return model;
	    }
	 
	 
	 @RequestMapping(value = "/reset_password" )
	 public ModelAndView resetPassword(){
		 log.debug("Открываем страницу регистрации");
	        ModelAndView res = new ModelAndView();
	        res.addObject("question", humanVerificationBP.getQuestion());
	        res.setViewName("reset_password");
	        return res;
	 }
	 
	 @RequestMapping(value="/reset_password_confirm")
	 public ModelAndView changePassword(@RequestParam("code") String code) {
		 ModelAndView model = new ModelAndView();
		try {
			String email = linkGeneratorBP.getEmailFromLink(code);
			String newPassword = passwordGeneratorBP.generatePassword();
			userManagementBP.changePassword(email, newPassword);
			Map<String, String> params = new HashMap<String, String>();
			params.put("user_password", newPassword);
			params.put("user_email", email);
			emailSenderBP.sendEmailToUser(email, "[Home-Helper] Новый пароль", "new_password.txt", params);
			model.setViewName("new_password");
			return model;
		} catch (Exception e) {
			e.printStackTrace();
			model.setViewName("shfksjsafj");
			return model;
		}
	 }
	 
}
