package com.example.service.impl;

import com.example.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public boolean check(String username, String password) {
        return "mr".equals(username) && "123456".equals(password);
    }
}
