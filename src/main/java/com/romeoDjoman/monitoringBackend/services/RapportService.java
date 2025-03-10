package com.romeoDjoman.monitoringBackend.services;

import com.romeoDjoman.monitoringBackend.entity.DonneeCapteur;
import com.romeoDjoman.monitoringBackend.repository.DonneeCapteurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class RapportService {

    @Autowired
    private DonneeCapteurRepository donneeCapteurRepository;

    public Map<String, Object> genererRapport(Long equipementId) {
        List<DonneeCapteur> donnees = donneeCapteurRepository.findByEquipementId(equipementId);

        double moyenne = donnees.stream().mapToDouble(DonneeCapteur::getValeur).average().orElse(0);
        double max = donnees.stream().mapToDouble(DonneeCapteur::getValeur).max().orElse(0);
        double min = donnees.stream().mapToDouble(DonneeCapteur::getValeur).min().orElse(0);

        Map<String, Object> rapport = new HashMap<>();
        rapport.put("equipementId", equipementId);
        rapport.put("nombreDonnees", donnees.size());
        rapport.put("moyenne", moyenne);
        rapport.put("max", max);
        rapport.put("min", min);

        return rapport;
    }
}