package org.example.bookreview.services;

import org.example.bookreview.model.User;
import org.example.bookreview.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
@Autowired
     private UserRepository userRepository;
     public java.util.List<User> getAllUsers(){
         return userRepository.findAll();
     }

}
