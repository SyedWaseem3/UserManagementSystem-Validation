package com.geekster.UserManagementSystem.Validation.repo;

import com.geekster.UserManagementSystem.Validation.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepo {

    @Autowired
    List<User> userList;

    public List<User> getUserList(){
        return userList;
    }
}
