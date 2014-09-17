package org.hh.users.web;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.hh.email.bp.EmailSenderBP;
import org.hh.users.bp.HumanVerificationBP;
import org.hh.users.bp.InvalidLoginOrPasswordException;
import org.hh.users.bp.LinkGeneratorBP;
import org.hh.users.bp.PasswordGeneratorBP;
import org.hh.users.bp.UserManagementBP;
import org.hh.users.dao.UserExistsException;
import org.hh.users.dao.UserNotFoundException;
import org.hh.users.dto.Role;
import org.hh.users.dto.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UsersController {

    private Logger log = Logger.getLogger(getClass());
    private UserManagementBP userManagementBP;
    private HumanVerificationBP humanVerificationBP;
    private LinkGeneratorBP linkGeneratorBP;
    private EmailSenderBP emailSenderBP;
    private PasswordGeneratorBP passwordGeneratorBP;
   
    
    public void setPasswordGeneratorBP(PasswordGeneratorBP passwordGeneratorBP) {
		this.passwordGeneratorBP = passwordGeneratorBP;
	}

	public void setEmailSenderBP(EmailSenderBP emailSenderBP) {
        this.emailSenderBP = emailSenderBP;
    }

    public void setLinkGeneratorBP(LinkGeneratorBP linkGeneratorBP) {
        this.linkGeneratorBP = linkGeneratorBP;
    }

    public void setHumanVerificationBP(HumanVerificationBP humanVerificationBP) {
        this.humanVerificationBP = humanVerificationBP;
    }

    public void setUserManagementBP(UserManagementBP userManagementBP) {
        this.userManagementBP = userManagementBP;
        log.info("User management injected OK");
    }

    @RequestMapping(
            value = "/login",
            method = RequestMethod.GET)
    public ModelAndView login() {
        log.debug("Открываем страницу логина");
        ModelAndView res = new ModelAndView();
        res.setViewName("login");
        return res;
    }

    @RequestMapping(
            value = "/register",
            method = RequestMethod.GET)
    public ModelAndView register() {
        log.debug("Открываем страницу регистрации");
        ModelAndView res = new ModelAndView();
        res.addObject("question", humanVerificationBP.getQuestion());
        res.setViewName("register");
        return res;
    }

    @RequestMapping(
            value = "/confirm",
            method = RequestMethod.GET)
    public ModelAndView doRegister(@RequestParam("code") String code, HttpSession session) {
        	ModelAndView res = new ModelAndView();
            String email;
			User user;
			String name = (String) session.getAttribute("name");
			Boolean craftsman = (Boolean) session.getAttribute("craftsman");
				try {
					email = linkGeneratorBP.getEmailFromLink(code);
					user = userManagementBP.createUser(email, name, craftsman);
				} catch (UserExistsException e) {
					log.debug("Attempt to activate an existing user");
					res.setViewName("confirmation_error");
					return res;
				} catch (Exception e) {
					res.setViewName("confirmation_error");
					return res;
				}
			
            session.setAttribute(WebConstants.SESSION_ATTR_USER, user);
            res.addObject("user", user);
            res.setViewName("confirmation_success");
            return res;
    }

    @RequestMapping(
            value = "/try_register",
            method = RequestMethod.POST)
    public ModelAndView tryRegister(@RequestParam("email") String email, @RequestParam("answer") String answer, @RequestParam(value="cb1", required=false, defaultValue = "false") Boolean craftsman , 
            @RequestParam("question") String question, @RequestParam("name") String name, HttpSession session) {
        ModelAndView res = new ModelAndView();
        List<String> errors = new ArrayList<>();
        if(!emailSenderBP.isValidEmailAddress(email)){
        	 errors.add("Невалидный email");
        }
           
       
        try {
            userManagementBP.getUserByEmail(email);
            errors.add("Пользователь с таким email-ом уже существует!");
        } catch (UserNotFoundException e) {
        }
        if (!humanVerificationBP.isAnswerOk(question, answer)) {
            errors.add("Да ты просто ботяра!!!");
        }
        
        if (name.isEmpty()) {
            errors.add("Укажите Ваше имя");
        }
        
        if (errors.size() > 0) {
            res.addObject("question", humanVerificationBP.getQuestion());
            res.setViewName("register");
            res.addObject("errors", errors);
            return res;
        }

        Calendar cal = Calendar.getInstance();
        Map<String, String> params = new HashMap<String, String>();
        params.put("name", name);
        
        session.setAttribute("name", name);
        session.setAttribute("craftsman", craftsman);
        
        params.put("activation_link", linkGeneratorBP.generateVerificationKey(email, cal.getTime()));
        emailSenderBP.sendEmailToUser(email, "[HomeHelper] Регистрация", "confirm_registration.txt", params);

        res.setViewName("confirmation-note");
        return res;
    }

    @RequestMapping(
            value = "/logout",
            method = RequestMethod.GET)
    public ModelAndView logout(HttpSession session) {
        log.debug("Юзер вышел");
        session.invalidate();
        ModelAndView res = new ModelAndView();
        res.setViewName("redirect:index.jsp");
        return res;
    }

    @RequestMapping(
            value = "/try_login",
            method = RequestMethod.POST)
    public ModelAndView tryLogin(@RequestParam("email") String email, @RequestParam("password") String password, HttpSession session) {
        log.debug("Пытаемся логиниться: " + email);
        ModelAndView res = new ModelAndView();
        User user = null;
        List<String> errors = new ArrayList<>();
        try {
            user = userManagementBP.login(email, password);
            
            if(user.getStatus() == 1) {
            	errors.add("Your account has been blocked. If you want to unlock it, please contact <a href=\"feedback.do\"> support </a>.");
            	res.addObject("errors", errors);
                res.setViewName("login");
                return res;
            }
        } catch (InvalidLoginOrPasswordException e) {
        	errors.add("Incorrect login or password. Try again.");
        	res.addObject("errors", errors);
            res.setViewName("login");
            return res;
        }
        log.info("Удачный логин: " + user.getEmail());

        session.setAttribute(WebConstants.SESSION_ATTR_USER, user);

        res.setViewName("redirect:index.jsp");
        return res;
    }
    
    @RequestMapping(value="/settings/changePassword.do")
    public ModelAndView changePassword(HttpSession session, @RequestParam("oldPassword") String oldPassword, @RequestParam("newPassword") String newPassword, @RequestParam("newPasswordConfirm") String newPasswordComfirm){
    	
    	  User user = (User) session.getAttribute(WebConstants.SESSION_ATTR_USER);
    	  ModelAndView res = new ModelAndView();
          List<String> errors = new ArrayList<>();
          
    	if(user!=null){
    		try {
				userManagementBP.login(user.getEmail(), oldPassword);
				
				if(newPassword.length() < 6) {
					errors.add("Enter a password more than 5 characters");
					res.addObject(errors);
				}
				
				if(!newPassword.equals(newPasswordComfirm)){
						errors.add("Passwords are not equal");
				}
    		} catch (InvalidLoginOrPasswordException e) {
				errors.add("Invalid old password");
				res.addObject(errors);
			}
    	}else{
    		res.setViewName("redirect:/login.do");
    		return res;
    	}
    
    	if(errors.size() > 0) {
    		res.addObject("errors", errors);
    		res.setViewName("/account/settings.jsp");
    		return res;
    	} else {
    		userManagementBP.changePassword(user.getEmail(), newPassword);
    		res.addObject("success", true);
    		res.setViewName("account/settings.jsp");
    		return res;
    	}
    }
    
    @RequestMapping(
            value = "/account/settings",
            method = RequestMethod.GET)
    public ModelAndView settings(HttpSession session) {
    	 User user = (User) session.getAttribute(WebConstants.SESSION_ATTR_USER);
    	 ModelAndView res = new ModelAndView();
   	  
    	 if(user != null) {
    		 res.setViewName("/account/settings");
    		 return res;
    	 }
   	  	
        res.setViewName("redirect:/login.do");
        return res;
        }
  
    @RequestMapping(
            value = "/account/change_settings",
            method = RequestMethod.POST)
    public ModelAndView changeSettings(HttpSession session, @RequestParam("name") String name, @RequestParam(value="cb1", required=false, defaultValue = "false") Boolean master ) {
    	 User user = (User) session.getAttribute(WebConstants.SESSION_ATTR_USER);
    	 ModelAndView res = new ModelAndView();
    	 boolean changes = false;
    	 System.out.println(master);
    	 if(user == null) {
    	        res.setViewName("redirect:/login.do");
    	        return res;
    	 }
    	 
    	 if(!name.isEmpty() && !user.getName().equalsIgnoreCase(name)) {
    		 user.setName(name);
    		 changes = true;
    	 }
    	 
    	 if(master == true & !user.getRoles().contains(Role.CRAFTSMAN)) {
    		 user.getRoles().add(Role.CRAFTSMAN);
    		 changes = true;
    	 } 
    	 
    	 if(master == false & user.getRoles().contains(Role.CRAFTSMAN)) {
    		 user.getRoles().remove(Role.CRAFTSMAN);
    		 changes = true;
    	 }
    	 
    	 if(changes) {
    		userManagementBP.overwriteUser(user);
    	 }
    	 
    	 /* If we do have the possibility of two email addresses 
    	  * (one address for login and another address for contacts, which can be changed) 
    	  * - it can be changed here.
    	  
    	  
    	 if(!email.isEmpty() && emailSenderBP.isValidEmailAddress(email) && !user.getContactEmail().equals(email)) {
    		 //send a message to confirm changes
    		 //add information string "Please confirm change your email"
    	 } */
    	 
    	 res.setViewName("/account/settings");
		 return res;
      
    } 
}
