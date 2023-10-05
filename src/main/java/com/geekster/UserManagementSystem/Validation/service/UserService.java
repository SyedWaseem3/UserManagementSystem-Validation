package com.geekster.UserManagementSystem.Validation.service;

import com.geekster.UserManagementSystem.Validation.model.User;
import com.geekster.UserManagementSystem.Validation.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepo userRepo;

    public List<User> getUsers() {
        return userRepo.getUserList();
    }

    public String addUser(User myUser) {
        userRepo.getUserList().add(myUser);
        return myUser.getUserName() +" added!";
    }

    public User getUserById(Integer id) {
        for(User user : getUsers()){
            if(user.getUserId().equals(id)){
                return user;
            }
        }
        return null;
    }

    public String updateNumber(Integer id, String number) {
        for(User user : getUsers()){
            if(user.getUserId().equals(id)){
                user.setUserNumber(number);
                return id + "'s phone number changed!";
            }
        }
        return "Invalid Id Given.";
    }

    public String deleteUserById(Integer id) {
        for(User user : getUsers()){
            if(user.getUserId().equals(id)){
                getUsers().remove(user);
                return user.getUserName() + " user deleted!";
            }
        }
        return "Invalid Id Provided.";
    }
}
