package com.app.app.Config;

import com.app.app.Model.User;
import com.app.app.Repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class UserDetailServiceImplementaion implements UserDetailsService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.getUserByUserName(username);
        if(user == null){
            throw new UsernameNotFoundException("Could Not Found user !!");

        }

        CustomeUserDetail custome = new CustomeUserDetail(user);
        return custome;
    }
    
}
