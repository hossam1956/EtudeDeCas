package com.chalabi.EtudeDeCas.service;

import java.util.List;
import java.util.Optional;

import com.chalabi.EtudeDeCas.dto.ReservationDTO;
import com.chalabi.EtudeDeCas.entities.Reservation;

public interface ReservationService {
    List<Reservation> getAllReservations();
    Optional<Reservation> getReservationById(Long id);
    Reservation saveReservation(ReservationDTO reservationDTO);
    Reservation updateReservation(Long id, ReservationDTO reservationDTO);
    void deleteReservation(Long id);
}
