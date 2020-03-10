package com.chudy.controller;


import com.chudy.spring.model.User;
import com.chudy.spring.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }


    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public String listUser(Model model) {
        model.addAttribute("user", new User());
        model.addAttribute("listUser", this.userService.listUser());
        return "user";
    }

    //For add and update user both
    @RequestMapping(value = "/user/add", method = RequestMethod.POST)
    public String addUser(@ModelAttribute("user") User u) {
        if (u.getId() == 0) {
            //new user, add it
            this.userService.addUser(u);
        } else {
            // existing user, call update
            this.userService.updateUser(u);
        }
        return "redirect:/users";
    }
    @RequestMapping("/remove/{id}")
    public String removeUser(@PathVariable("id") int id) {
        this.userService.removeUser(id);
        return "redirect:/users";
    }

    @RequestMapping("/edit/{id}")
    public String editUser(@PathVariable("id") int id, Model model) {
        model.addAttribute("user",this.userService.listUser());
        return "user";
    }

}
