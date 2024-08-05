package com.example.bookmyshowaug24.dtos;

import com.example.bookmyshowaug24.models.ShowSeat;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class BookMovieRequestDto {
    private Long userId;
    private Long showId;
    private List<Long> showSeatIds;
}
