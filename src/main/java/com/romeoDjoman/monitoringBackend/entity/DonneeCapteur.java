package com.romeoDjoman.monitoringBackend.entity;
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
    private Equipement equipement;
}
