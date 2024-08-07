package com.example.bookmyshowaug24.dtos;

import com.example.bookmyshowaug24.models.User;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SignUpResponseDto {
    private User user;
    private ResponseStatus responseStatus;
}
