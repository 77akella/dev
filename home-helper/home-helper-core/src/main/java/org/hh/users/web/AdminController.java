package org.hh.users.web;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.hh.users.bp.UserManagementBP;
import org.hh.users.dao.UserNotFoundException;
import org.hh.users.dto.Role;
import org.hh.users.dto.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AdminController {
	 private UserManagementBP userManagementBP;
	 private Logger log = Logger.getLogger(getClass());

	public void setUserManagementBP(UserManagementBP userManagementBP) {
		this.userManagementBP = userManagementBP;
	}
	 
	@RequestMapping(value="hh-admin/getAllUsers")
	public ModelAndView getAllUsers(HttpSession session) {
		
		User user = (User) session.getAttribute(WebConstants.SESSION_ATTR_USER);
		ModelAndView model = new ModelAndView();
			
		if (user != null && user.getRoles().contains(Role.ADMIN)) { 
			List<User> allUsers = null;
			try {
				allUsers = userManagementBP.getAllUsers();
				model.addObject("allUsers", allUsers);
				model.setViewName("hh-admin/allUsers");
				return model;
			} catch (UserNotFoundException e) {
				model.addObject("allUsers", allUsers);
				model.setViewName("hh-admin/allUsers");
				return model;
			}
		}else {
				model.setViewName("redirect:/login.do");
				return model;
		}
		
	}
	
	@RequestMapping(value="hh-admin/block_user", method= RequestMethod.GET)
	public ModelAndView blockUser (HttpSession session, @RequestParam("email") String email, @RequestParam("blocked") boolean blocked) {
		
		User user = (User) session.getAttribute(WebConstants.SESSION_ATTR_USER);
		ModelAndView model = new ModelAndView();
			
		
		if(user == null) {
				model.setViewName("redirect:/login.do");
				return model;
		}
		
		if (user.getRoles().contains(Role.ADMIN)) { 
			
			if(!user.getEmail().equals(email)){ // Админ не может заблокировать самого себя
				if(blocked == true){
					userManagementBP.changeStatusToBlocked(email, true);
				}else{
					userManagementBP.changeStatusToBlocked(email, false);
				}
			}
			model.setViewName("redirect:/hh-admin/getAllUsers.do");
			return model;
		}else {
			model.setViewName("redirect:404");
			return model;
	}
		
	}
}
