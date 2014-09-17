package org.hh.users.web;

import java.util.List;

import org.apache.log4j.Logger;
import org.hh.users.bp.UserManagementBP;
import org.hh.users.dao.UserNotFoundException;
import org.hh.users.dto.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AllUsersController {

    private Logger log = Logger.getLogger(getClass());
    private UserManagementBP userManagementBP;

    public void setUserManagementBP(UserManagementBP userManagementBP) {
        this.userManagementBP = userManagementBP;
        log.info("User management injected OK");
    }

    @RequestMapping(
            value = "/all-users",
            method = RequestMethod.POST)
    public void ping() {

    }

    @RequestMapping(
            value = "/all-users",
            method = RequestMethod.GET)
    public ModelAndView processRequest() {
        List<User> allUsers = null;
        try {
            allUsers = userManagementBP.getAllUsers();
        } catch (UserNotFoundException e) {
            e.printStackTrace();
        }
        ModelAndView res = new ModelAndView();
        res.setViewName("listAllUsers");
        res.addObject("allUsers", allUsers);
        return res;
    }

}
