package com.example.bookmyshowaug24.controllers;

import com.example.bookmyshowaug24.dtos.BookMovieRequestDto;
import com.example.bookmyshowaug24.dtos.BookMovieResponseDto;
import com.example.bookmyshowaug24.services.BookingService;
import org.springframework.stereotype.Controller;

@Controller
public class BookingController {
    private BookingService bookingService;

    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    public BookMovieResponseDto bookMovie(BookMovieRequestDto requestDto) {
        return null;
    }
}
