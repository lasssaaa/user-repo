package main.java.org.prz.java;

import main.java.org.prz.java.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {

    private List users = new ArrayList<>();

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public String getUsers(ModelMap model) {
        model.addAttribute("users", users);
        return "user/list";
    }

    @RequestMapping(value = "/users/add", method = RequestMethod.GET)
    public ModelAndView addUser() {
        return new ModelAndView("/user/add", "user", new User());
    }

    @RequestMapping(value = "/users/add", method = RequestMethod.POST)
    public String processAddUser(@ModelAttribute()User user,  ModelMap model) {
        users.add(user);
        return "redirect:/users";
    }



}
