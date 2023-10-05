package com.geekster.UserManagementSystem.Validation.repo;

import com.geekster.UserManagementSystem.Validation.model.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class UserFactory {

    @Bean
    List<User> getUserSource(){
        return new ArrayList<>();
    }

}
