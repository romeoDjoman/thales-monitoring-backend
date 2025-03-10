package com.romeoDjoman.monitoringBackend.controller;

import com.romeoDjoman.monitoringBackend.dto.DonneeCapteurDTO;
import com.romeoDjoman.monitoringBackend.entity.DonneeCapteur;
import com.romeoDjoman.monitoringBackend.services.DonneeCapteurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/donnees-capteur")
@CrossOrigin(origins = "http://localhost:4200")
public class DonneeCapteurController {

    @Autowired
    private DonneeCapteurService donneeCapteurService;

    // Récupérer toutes les données des capteurs avec les équipements
    @GetMapping("/all")
    public List<DonneeCapteurDTO> getAllDonneesCapteur() {
        return donneeCapteurService.getAllDonneesCapteur();
    }

    // Ajouter une donnée capteur
    @PostMapping("/add")
    public DonneeCapteur addDonneeCapteur(@RequestBody DonneeCapteur donneeCapteur) {
        return donneeCapteurService.addDonneeCapteur(donneeCapteur);
    }

    // Récupérer les données des capteurs par ID d'équipement
    @GetMapping("/equipement/{equipementId}")
    public List<DonneeCapteurDTO> getDonneesByEquipementId(@PathVariable Long equipementId) {
        return donneeCapteurService.getDonneesByEquipementId(equipementId);
    }
}