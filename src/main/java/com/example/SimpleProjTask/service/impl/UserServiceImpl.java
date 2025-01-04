package com.example.SimpleProjTask.service.impl;

import com.example.SimpleProjTask.model.Product;
import com.example.SimpleProjTask.model.User;
import com.example.SimpleProjTask.repository.ProductRepository;
import com.example.SimpleProjTask.repository.UserRepository;
import com.example.SimpleProjTask.service.UserService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public void addUser(User user) {
        userRepository.save(user);
        log.info("User added successfully with id: {}", user.getId());
    }

    @Override
    public void updateUser(User user) {
        Optional<User> userOptional = userRepository.findById(user.getId());

        if (userOptional.isPresent()) {
            userRepository.save(user);
            log.info("User updated successfully with id: {}", user.getId());
        } else {
            log.error("User with id {} not found to update", user.getId());
        }
    }

    @Override
    public void deleteUser(User user) {
        Optional<User> userOptional = userRepository.findById(user.getId());

        if (userOptional.isPresent()) {
            userRepository.delete(userOptional.get());
            log.info("User deleted successfully with id: {}", user.getId());
        } else {
            log.error("User with id {} not found to delete", user.getId());
        }

    }
}
