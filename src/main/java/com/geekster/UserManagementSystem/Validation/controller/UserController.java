package com.geekster.UserManagementSystem.Validation.controller;

import com.geekster.UserManagementSystem.Validation.model.NumberUpdater;
import com.geekster.UserManagementSystem.Validation.model.User;
import com.geekster.UserManagementSystem.Validation.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Validated
public class UserController {

    @Autowired
    UserService userService;

    //Add User
    @PostMapping("addUser")
    public String addUser(@RequestBody @Valid User myUser){
        return userService.addUser(myUser);
    }

    //Get User By ID :
    @GetMapping("getUserById/{id}")
    public User getUserById(@PathVariable Integer id){
        return userService.getUserById(id);
    }

    //Get All Users
    @GetMapping("users")
    public List<User> getUsers(){
        return userService.getUsers();
    }

    //Update user Phone Number :
    @PutMapping("updateNumber")
    public String updateNumber(@RequestBody @Valid NumberUpdater numberUpdater){
        return userService.updateNumber(numberUpdater.getId(),numberUpdater.getNumber());
    }

    //Delete User
    @DeleteMapping("deleteUserById/{id}")
    public String deleteUserById(@PathVariable Integer id){
        return userService.deleteUserById(id);
    }
}
