package com.StarkIndustries.JARVIS.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.StarkIndustries.JARVIS.models.dto.UserDTO;
import com.StarkIndustries.JARVIS.service.UserService;

@RestController
public class UserController {
    
    @Autowired
    private UserService userService;

    @GetMapping("/listusers")
    public List<UserDTO> getAllUsers(){
        return userService.getAllUser();
    }
}
