package com.ust.capstone.user_details_service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.capstone.user_details_service.dao.UserDetailsRepository;
import com.ust.capstone.user_details_service.dao.entity.UserDetails;

@Service
public class UserDetailsService {

    @Autowired
    private UserDetailsRepository userRepo;

    public UserDetails getUserDetails(Long id)
    {
        return userRepo.findById(id).orElse(null);
    }

    public UserDetails addUserDetails(UserDetails userDetails)
    {
        return userRepo.saveAndFlush(userDetails);
    }

    public void deleteUserDetails(Long id)
    {
        userRepo.deleteById(id);
    }

}
