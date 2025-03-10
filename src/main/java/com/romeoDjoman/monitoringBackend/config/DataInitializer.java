package com.romeoDjoman.monitoringBackend.config;

import com.romeoDjoman.monitoringBackend.dto.DonneeCapteurDTO;
import com.romeoDjoman.monitoringBackend.entity.DonneeCapteur;
import com.romeoDjoman.monitoringBackend.entity.Equipement;
import com.romeoDjoman.monitoringBackend.repository.DonneeCapteurRepository;
import com.romeoDjoman.monitoringBackend.repository.EquipementRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Random;

@Component
public class DataInitializer implements CommandLineRunner {

    private final EquipementRepository equipementRepository;
    private final DonneeCapteurRepository donneeCapteurRepository;
    private final Random random = new Random();

    public DataInitializer(EquipementRepository equipementRepository, DonneeCapteurRepository donneeCapteurRepository) {
        this.equipementRepository = equipementRepository;
        this.donneeCapteurRepository = donneeCapteurRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        String[] types = {"Capteur", "Détecteur", "Sonde"};
        String[] noms = {"Température", "Humidité", "Pression", "Lumière", "Gaz", "Mouvement", "Son", "CO2", "Vibration", "Proximité"};

        for (int i = 0; i < 10; i++) {
            String nomEquipement = "Capteur de " + noms[i];
            String typeEquipement = types[i % types.length];

            // Vérifier si l'équipement existe déjà
            Equipement equipement = equipementRepository.findByNom(nomEquipement);

            if (equipement == null) {
                // Créer un nouvel équipement s'il n'existe pas
                equipement = new Equipement();
                equipement.setNom(nomEquipement);
                equipement.setType(typeEquipement);
                equipement.setDateInstallation(new Date());
                equipement = equipementRepository.save(equipement);
                System.out.println("✅ Équipement créé : " + equipement.getNom());
            } else {
                System.out.println("⚠️ Équipement existant ignoré : " + equipement.getNom());
            }

            // Vérifier si des données existent déjà pour cet équipement
            List<DonneeCapteurDTO> donneesExistantes = donneeCapteurRepository.findByEquipementIdWithEquipement(equipement.getId());

            if (donneesExistantes.isEmpty()) {
                // Ajouter des données de capteur si aucune n'existe
                DonneeCapteur donnee = new DonneeCapteur();
                donnee.setValeur(10 + random.nextDouble() * 90); // Valeur entre 10 et 100
                donnee.setDateCollecte(new Date());
                donnee.setEquipement(equipement);
                donneeCapteurRepository.save(donnee);
                System.out.println("✅ Donnée de capteur ajoutée pour l'équipement : " + equipement.getNom());
            } else {
                System.out.println("⚠️ Données existantes ignorées pour l'équipement : " + equipement.getNom());
            }
        }

        System.out.println("✅ Initialisation des données terminée !");
    }
}