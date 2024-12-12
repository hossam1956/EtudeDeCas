package com.chalabi.EtudeDeCas.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.chalabi.EtudeDeCas.dao.ChambreRepository;
import com.chalabi.EtudeDeCas.entities.Chambre;

public class ChambreServiceImpl implements ChambreService {
	@Autowired
    private ChambreRepository chambreRepository;

    @Override
    public List<Chambre> getAllChambres() {
        return chambreRepository.findAll();
    }

    @Override
    public Optional<Chambre> getChambreById(Long id) {
        return chambreRepository.findById(id);
    }

    @Override
    public Chambre saveChambre(Chambre chambre) {
        return chambreRepository.save(chambre);
    }

    @Override
    public Chambre updateChambre(Long id, Chambre chambreDetails) {
        return chambreRepository.findById(id).map(chambre -> {
            chambre.setType(chambreDetails.getType());
            chambre.setPrix(chambreDetails.getPrix());
            chambre.setDisponible(chambreDetails.getDisponible());
            return chambreRepository.save(chambre);
        }).orElseThrow(() -> new RuntimeException("Chambre not found with id " + id));
    }

    @Override
    public void deleteChambre(Long id) {
        chambreRepository.deleteById(id);
    }
}
