package com.romeoDjoman.monitoringBackend.controller;

import com.romeoDjoman.monitoringBackend.services.AnalyseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/alertes")
@CrossOrigin(origins = "http://localhost:4200")
public class AlerteController {

    @Autowired
    private AnalyseService analyseService;

    @GetMapping("/equipement/{equipementId}")
    public String verifierAnomalies(@PathVariable Long equipementId) {
        return analyseService.detecterAnomalies(equipementId);
    }
}
