package com.chalabi.EtudeDeCas.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chalabi.EtudeDeCas.dao.ChambreRepository;
import com.chalabi.EtudeDeCas.dao.ClientRepository;
import com.chalabi.EtudeDeCas.dao.ReservationRepository;
import com.chalabi.EtudeDeCas.dto.ReservationDTO;
import com.chalabi.EtudeDeCas.entities.Chambre;
import com.chalabi.EtudeDeCas.entities.Client;
import com.chalabi.EtudeDeCas.entities.Reservation;

@Service
public class ReservationServiceImpl implements ReservationService {
    @Autowired
    private ReservationRepository reservationRepository;

    @Autowired
    private ClientRepository clientRepository;

    @Autowired
    private ChambreRepository chambreRepository;

    @Override
    public List<Reservation> getAllReservations() {
        return reservationRepository.findAll();
    }

    @Override
    public Optional<Reservation> getReservationById(Long id) {
        return reservationRepository.findById(id);
    }

    @Override
    public Reservation saveReservation(ReservationDTO reservationDTO) {
        Client client = clientRepository.findById(reservationDTO.getClientId())
                .orElseThrow(() -> new RuntimeException("Client not found with id " + reservationDTO.getClientId()));
        
        Chambre chambre = chambreRepository.findById(reservationDTO.getChambreId())
                .orElseThrow(() -> new RuntimeException("Chambre not found with id " + reservationDTO.getChambreId()));
        
        if (!chambre.getDisponible()) {
            throw new RuntimeException("Chambre is not available");
        }

        Reservation reservation = new Reservation();
        reservation.setClient(client);
        reservation.setChambre(chambre);
        reservation.setDateDebut(reservationDTO.getDateDebut());
        reservation.setDateFin(reservationDTO.getDateFin());
        reservation.setPreferences(reservationDTO.getPreferences());

        return reservationRepository.save(reservation);
    }

    @Override
    public Reservation updateReservation(Long id, ReservationDTO reservationDTO) {
        return reservationRepository.findById(id).map(reservation -> {
            Client client = clientRepository.findById(reservationDTO.getClientId())
                    .orElseThrow(() -> new RuntimeException("Client not found with id " + reservationDTO.getClientId()));

            Chambre chambre = chambreRepository.findById(reservationDTO.getChambreId())
                    .orElseThrow(() -> new RuntimeException("Chambre not found with id " + reservationDTO.getChambreId()));

            if (!chambre.getDisponible()) {
                throw new RuntimeException("Chambre is not available");
            }

            reservation.setClient(client);
            reservation.setChambre(chambre);
            reservation.setDateDebut(reservationDTO.getDateDebut());
            reservation.setDateFin(reservationDTO.getDateFin());
            reservation.setPreferences(reservationDTO.getPreferences());

            return reservationRepository.save(reservation);
        }).orElseThrow(() -> new RuntimeException("Reservation not found with id " + id));
    }

    @Override
    public void deleteReservation(Long id) {
        reservationRepository.deleteById(id);
    }


}
