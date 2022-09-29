package com.flight.project.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flight.project.dto.Booking;

@Repository
public interface Bookingrepo extends JpaRepository<Booking,Long> {

}
