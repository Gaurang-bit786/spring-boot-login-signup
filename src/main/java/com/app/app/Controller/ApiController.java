package com.app.app.Controller;

import com.app.app.Model.User;
import com.app.app.Repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class ApiController {
    

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @Autowired
    private UserRepository userReposotory;

    @RequestMapping("/")
    public String home(){
        return "home";
    }

    @RequestMapping("/register")
    public String register(){
        return "register";
    }
    @RequestMapping("/signin")
    public String signin(){
        return "login";
    }

    @PostMapping("/register/user")
    public String saveUser(User user){
        System.out.println(user.getUsername());
        user.setUser_role("ROLE_USER");
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userReposotory.save(user);
        return "redirect:/register";
    }

}
