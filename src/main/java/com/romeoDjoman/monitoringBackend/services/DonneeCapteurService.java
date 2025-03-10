package com.romeoDjoman.monitoringBackend.services;

import com.romeoDjoman.monitoringBackend.dto.DonneeCapteurDTO;
import com.romeoDjoman.monitoringBackend.entity.DonneeCapteur;
import com.romeoDjoman.monitoringBackend.repository.DonneeCapteurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DonneeCapteurService {

    @Autowired
    private DonneeCapteurRepository donneeCapteurRepository;

    // Récupérer toutes les données des capteurs avec les équipements
    public List<DonneeCapteurDTO> getAllDonneesCapteur() {
        return donneeCapteurRepository.findAllWithEquipement();
    }

    // Ajouter une donnée capteur
    public DonneeCapteur addDonneeCapteur(DonneeCapteur donneeCapteur) {
        return donneeCapteurRepository.save(donneeCapteur);
    }

    // Récupérer les données des capteurs par ID d'équipement
    public List<DonneeCapteurDTO> getDonneesByEquipementId(Long equipementId) {
        return donneeCapteurRepository.findByEquipementIdWithEquipement(equipementId);
    }
}