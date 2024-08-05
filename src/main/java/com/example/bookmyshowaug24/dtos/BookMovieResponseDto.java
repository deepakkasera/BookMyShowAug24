package com.example.bookmyshowaug24.dtos;

import com.example.bookmyshowaug24.models.Booking;
import com.example.bookmyshowaug24.models.BookingStatus;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookMovieResponseDto {
    private Booking booking;
    private BookingStatus bookingStatus;
}
