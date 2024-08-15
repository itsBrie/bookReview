package org.example.bookreview.services;

import org.example.bookreview.model.User;
import org.example.bookreview.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

     private UserRepository userRepository;
     public java.util.List<User> getAllUsers(){
         return userRepository.findAll();
     }

}
