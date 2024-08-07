package com.example.bookmyshowaug24.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SignInRequestDto {
    private String email;
    private String password;
}
