package com.romeoDjoman.monitoringBackend.controller;

import com.romeoDjoman.monitoringBackend.services.RapportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/rapports")
@CrossOrigin(origins = "http://localhost:4200")
public class RapportController {

    @Autowired
    private RapportService rapportService;

    @GetMapping("/equipement/{equipementId}")
    public Map<String, Object> genererRapport(@PathVariable Long equipementId) {
        return rapportService.genererRapport(equipementId);
    }
}