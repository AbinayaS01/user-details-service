package com.ust.capstone.user_details_service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ust.capstone.user_details_service.dao.entity.UserDetails;
import com.ust.capstone.user_details_service.service.UserDetailsService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api/userdetails")
public class UserDetailsController {

    @Autowired
    private UserDetailsService userService;

    @GetMapping("/{uid}")
    public ResponseEntity<UserDetails> getUserDetailsById(@PathVariable("uid") Long id)
    {
        return new ResponseEntity<UserDetails>(userService.getUserDetails(id), HttpStatus.OK);
    }

    @PostMapping("")
    public ResponseEntity<UserDetails> addUserDetails(@RequestBody UserDetails newUserDetails) {
        return new ResponseEntity<>(userService.addUserDetails(newUserDetails),HttpStatus.OK);
    }
    

}
