package com.springboot.blog.services;

import com.springboot.blog.payload.LogInDto;
import com.springboot.blog.payload.RegisterDto;

public interface AuthService {
    String login(LogInDto logInDto);
    String register(RegisterDto registerDto);
}
