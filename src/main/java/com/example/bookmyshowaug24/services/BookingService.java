package com.example.bookmyshowaug24.services;

import com.example.bookmyshowaug24.exceptions.InvalidShowException;
import com.example.bookmyshowaug24.exceptions.InvalidUserIdException;
import com.example.bookmyshowaug24.models.Booking;
import com.example.bookmyshowaug24.models.Show;
import com.example.bookmyshowaug24.models.User;
import com.example.bookmyshowaug24.repositories.ShowRepository;
import com.example.bookmyshowaug24.repositories.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class BookingService {
    private UserRepository userRepository;
    private ShowRepository showRepository;

    public BookingService(UserRepository userRepository,
                          ShowRepository showRepository) {
        this.userRepository = userRepository;
        this.showRepository = showRepository;
    }

    @Transactional(isolation = Isolation.SERIALIZABLE)
    public Booking bookMovie(Long userId, Long showId, List<Long> showSeatIds) throws InvalidUserIdException, InvalidShowException {
        /*
        1. Get the user from the userId.
        2. Get the show from the showId.
        3. Get the list of show Seats from the list of showSeatIds.
        4. Check if all the seats are available or not.
        ------TAKE A LOCK-------
        5. If no, throw an exception.
        6. If yes, mark the seat status as BLOCKED.
        -------RELEASE THE LOCK-------
        7. Create the booking object with PENDING status.
        8. Move to the Payment page.
         */

        //1. Get the user from the userId.
        Optional<User> userOptional = userRepository.findById(userId);

        if (userOptional.isEmpty()) {
            throw new InvalidUserIdException("User with id: " + userId + " doesn't exist");
        }

        //2. Get the show from the showId.
        Optional<Show> showOptional = showRepository.findById(showId);

        if (showOptional.isEmpty()) {
            throw new InvalidShowException("Show with id: " + showId + " doesn't exist");
        }

        //3. Get the list of show Seats from the list of showSeatIds.


        return null;
    }
}
