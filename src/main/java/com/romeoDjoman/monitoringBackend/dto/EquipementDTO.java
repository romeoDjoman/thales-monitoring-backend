package com.romeoDjoman.monitoringBackend.dto;

import java.util.Date;

public class EquipementDTO {
    private Long id;
    private String nom;
    private String type;
    private Date dateInstallation;

    // Constructeur correspondant à la requête JPQL
    public EquipementDTO(Long id, String nom, String type, Date dateInstallation) {
        this.id = id;
        this.nom = nom;
        this.type = type;
        this.dateInstallation = dateInstallation;
    }

    // Getters et setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public Date getDateInstallation() { return dateInstallation; }
    public void setDateInstallation(Date dateInstallation) { this.dateInstallation = dateInstallation; }
}