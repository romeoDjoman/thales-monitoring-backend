package com.romeoDjoman.monitoringBackend.config;

import com.romeoDjoman.monitoringBackend.entity.DonneeCapteur;
import com.romeoDjoman.monitoringBackend.entity.Equipement;
import com.romeoDjoman.monitoringBackend.repository.DonneeCapteurRepository;
import com.romeoDjoman.monitoringBackend.repository.EquipementRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Date;
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
            Equipement equipement = new Equipement();
            equipement.setNom("Capteur de " + noms[i]);
            equipement.setType(types[i % types.length]);
            equipement.setDateInstallation(new Date());
            equipementRepository.save(equipement);

            DonneeCapteur donnee = new DonneeCapteur();
            donnee.setValeur(10 + random.nextDouble() * 90); // Valeur entre 10 et 100
            donnee.setDateCollecte(new Date());
            donnee.setEquipement(equipement);
            donneeCapteurRepository.save(donnee);
        }

        System.out.println("✅ 10 équipements et leurs données ont été initialisés !");
    }
}
