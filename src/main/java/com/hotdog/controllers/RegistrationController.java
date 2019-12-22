package com.hotdog.controllers;
import com.hotdog.entities.Role;
import com.hotdog.entities.User;
import com.hotdog.repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Collections;
import java.util.Map;

@Controller
public class RegistrationController {
    @Autowired
    private UserRepo userRepo;

    @GetMapping("/registration")
    public String registration(){
        return "registration";
    }

    @PostMapping("/registration")
    public String addUser(User user, Map<String, Object> model){

        user.setActive(true);
        user.setRoles(Collections.singleton(Role.USER));

        userRepo.save(user);


        return "redirect:/login";
    }
}
