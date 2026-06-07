package com.manoj.ecommerce.controller;

import com.manoj.ecommerce.entity.User;
import com.manoj.ecommerce.repository.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {

    private final UserRepository userRepository;

    public UserController(UserRepository userRepository)
    {
        this.userRepository = userRepository;
    }

    @GetMapping("/register")
    public String registerPage()
    {
        return "register";
    }

    @PostMapping("/register")
    public String registerUser(User user)
    {
        userRepository.save(user);

        return "redirect:/";
    }
    @GetMapping("/login")
    public String loginPage()
    {
        return "login";
    }
    @PostMapping("/login")
    public String loginUser(
            @RequestParam String email,
            @RequestParam String password)
    {

        User user = userRepository.findByEmail(email);

        if(user != null &&
                user.getPassword().equals(password))
        {
            return "redirect:/";
        }

        return "redirect:/login";
    }
}