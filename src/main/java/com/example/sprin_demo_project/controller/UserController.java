package com.example.sprin_demo_project.controller;

import com.example.sprin_demo_project.dto.UserDTO;
import com.example.sprin_demo_project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1/user")
@CrossOrigin
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/getUser")
    public List<UserDTO> getUser(){
        return userService.getAllUser();
    }

    @PostMapping("/userSave")
    public UserDTO saveUser(@RequestBody UserDTO userDTO){

        return userService.saveUser(userDTO);
    }
    @PutMapping("/updateUser")
    public String updateUser(){
        return "update user";
    }

    @DeleteMapping("/deleteUser")
    public String deleteUser(){
        return "delete user";
    }

}
