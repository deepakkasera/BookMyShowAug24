package com.example.bookmyshowaug24.controllers;

import com.example.bookmyshowaug24.dtos.*;
import com.example.bookmyshowaug24.models.User;
import com.example.bookmyshowaug24.services.UserService;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    public SignUpResponseDto signUp(SignUpRequestDto requestDto) {
        User user = userService.signUp(requestDto.getName(),
                requestDto.getEmail(),
                requestDto.getPassword());

        SignUpResponseDto responseDto = new SignUpResponseDto();
        responseDto.setResponseStatus(ResponseStatus.SUCCESS);
        responseDto.setUser(user);
        return responseDto;
    }

    public void signIn(SignInRequestDto requestDto) {
        userService.signIn(
                requestDto.getEmail(),
                requestDto.getPassword()
        );
    }
}
