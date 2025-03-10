package com.romeoDjoman.monitoringBackend.services;

import com.romeoDjoman.monitoringBackend.entity.DonneeCapteur;
import com.romeoDjoman.monitoringBackend.repository.DonneeCapteurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnalyseService {

    @Autowired
    private DonneeCapteurRepository donneeCapteurRepository;

    @Autowired
    private NotificationService notificationService;

    public String detecterAnomalies(Long equipementId) {
        List<DonneeCapteur> donnees = donneeCapteurRepository.findByEquipementId(equipementId);

        for (DonneeCapteur donnee : donnees) {
            if (donnee.getValeur() > 100) { // Exemple de seuil critique
                String message = "Alerte : Valeur critique détectée pour l'équipement ID " + equipementId + " (Valeur : " + donnee.getValeur() + ")";
                notificationService.envoyerNotification(message);
                return message;
            }
        }
        return null; // Aucune anomalie détectée
    }
}