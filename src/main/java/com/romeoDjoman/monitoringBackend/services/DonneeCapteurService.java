package com.romeoDjoman.monitoringBackend.services;

import com.romeoDjoman.monitoringBackend.entity.DonneeCapteur;
import org.springframework.stereotype.Service;

import java.util.List;
import com.romeoDjoman.monitoringBackend.repository.DonneeCapteurRepository;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class DonneeCapteurService {

    @Autowired
    private DonneeCapteurRepository donneeCapteurRepository;


    public List<DonneeCapteur> getAllDonneesCapteur() {
        return donneeCapteurRepository.findAll();
    }


    public DonneeCapteur addDonneeCapteur(DonneeCapteur donneeCapteur) {
        return donneeCapteurRepository.save(donneeCapteur);
    }


    public List<DonneeCapteur> getDonneesByEquipementId(Long equipementId) {
        return donneeCapteurRepository.findByEquipementId(equipementId);
    }
}
