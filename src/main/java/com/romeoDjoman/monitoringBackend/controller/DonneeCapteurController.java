    package com.romeoDjoman.monitoringBackend.controller;

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

        @GetMapping("/all")
        public List<DonneeCapteur> getAllDonneesCapteur() {
            return donneeCapteurService.getAllDonneesCapteur();
        }

        @PostMapping("/add")
        public DonneeCapteur addDonneeCapteur(@RequestBody DonneeCapteur donneeCapteur) {
            return donneeCapteurService.addDonneeCapteur(donneeCapteur);
        }

        @GetMapping("/equipement/{equipementId}")
        public List<DonneeCapteur> getDonneesByEquipementId(@PathVariable Long equipementId) {
            return donneeCapteurService.getDonneesByEquipementId(equipementId);
        }
    }
