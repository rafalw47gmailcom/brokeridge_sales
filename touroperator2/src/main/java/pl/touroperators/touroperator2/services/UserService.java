package pl.touroperators.touroperator2.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import pl.touroperators.touroperator2.model.Reservation;
import pl.touroperators.touroperator2.model.Tour;
import pl.touroperators.touroperator2.model.User;
import pl.touroperators.touroperator2.repository.UserRepo;

import java.util.List;
import java.util.Optional;

@Service
public class UserService{

    private UserRepo userRepo;

    @Autowired
    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    public User save(User reservation) {
        return userRepo.save(reservation);
    }




}
