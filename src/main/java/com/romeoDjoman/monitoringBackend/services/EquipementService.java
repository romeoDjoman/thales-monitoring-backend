package com.romeoDjoman.monitoringBackend.services;

import com.romeoDjoman.monitoringBackend.entity.Equipement;
import com.romeoDjoman.monitoringBackend.repository.EquipementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EquipementService {
    @Autowired
    private EquipementRepository equipementRepository;

    public List<Equipement> getAllEquipements() {
        return equipementRepository.findAll();
    }

    public Equipement addEquipement(Equipement equipement) {
        return equipementRepository.save(equipement);
    }

    public Equipement getEquipementById(Long id) {
        return equipementRepository.findById(id).orElseThrow(() -> new RuntimeException("Équipement non trouvé"));
    }

    public Equipement updateEquipement(Long id, Equipement equipementDetails) {
        Equipement equipement = equipementRepository.findById(id).orElseThrow(() -> new RuntimeException("Équipement non trouvé"));
        equipement.setNom(equipementDetails.getNom());
        equipement.setType(equipementDetails.getType());
        equipement.setDateInstallation(equipementDetails.getDateInstallation());
        return equipementRepository.save(equipement);
    }

    public void deleteEquipement(Long id) {
        equipementRepository.deleteById(id);
    }
}