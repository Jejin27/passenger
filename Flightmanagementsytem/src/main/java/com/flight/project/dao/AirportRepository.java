package com.flight.project.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flight.project.dto.Airport;

public interface AirportRepository extends JpaRepository<Airport,Long>{


}