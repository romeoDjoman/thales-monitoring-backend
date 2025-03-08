package com.romeoDjoman.monitoringBackend.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
@Entity
public class Equipement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String type;
    private Date dateInstallation;

    @OneToMany(mappedBy = "equipement", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonManagedReference  // Indique que cette propriété doit être sérialisée
    private List<DonneeCapteur> donneesCapteur;
}