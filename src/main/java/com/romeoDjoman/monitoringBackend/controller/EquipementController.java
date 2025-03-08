package com.romeoDjoman.monitoringBackend.controller;

import com.romeoDjoman.monitoringBackend.entity.Equipement;
import com.romeoDjoman.monitoringBackend.services.EquipementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/equipements")
@CrossOrigin(origins = "http://localhost:4200")
public class EquipementController {
    @Autowired
    private EquipementService equipementService;

    // Récupérer tous les équipements
    @GetMapping("/all")  // Path spécifique pour récupérer tous les équipements
    public List<Equipement> getAllEquipements() {
        return equipementService.getAllEquipements();
    }

    // Ajouter un nouvel équipement
    @PostMapping("/add")  // Path spécifique pour ajouter un équipement
    public Equipement addEquipement(@RequestBody Equipement equipement) {
        return equipementService.addEquipement(equipement);
    }

    // Récupérer un équipement par son ID
    @GetMapping("/{id}")  // Path spécifique pour récupérer un équipement par son ID
    public Equipement getEquipementById(@PathVariable Long id) {
        return equipementService.getEquipementById(id);
    }

    // Mettre à jour un équipement
    @PutMapping("/update/{id}")  // Path spécifique pour mettre à jour un équipement
    public Equipement updateEquipement(@PathVariable Long id, @RequestBody Equipement equipementDetails) {
        return equipementService.updateEquipement(id, equipementDetails);
    }

    // Supprimer un équipement
    @DeleteMapping("/delete/{id}")  // Path spécifique pour supprimer un équipement
    public void deleteEquipement(@PathVariable Long id) {
        equipementService.deleteEquipement(id);
    }
}