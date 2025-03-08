package com.romeoDjoman.monitoringBackend.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;
import java.util.Date;

@Data
@Entity
public class DonneeCapteur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Double valeur;
    private Date dateCollecte;

    @ManyToOne
    @JoinColumn(name = "equipement_id")
    @JsonBackReference  // Indique que cette propriété ne doit pas être sérialisée
    private Equipement equipement;
}