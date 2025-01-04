package com.example.SimpleProjTask.service;

import com.example.SimpleProjTask.model.Product;
import com.example.SimpleProjTask.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {

    void addUser(User user);

    void updateUser(User user);

    void deleteUser(User user);
}
