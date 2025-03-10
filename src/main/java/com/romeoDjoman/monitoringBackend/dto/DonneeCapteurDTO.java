package com.romeoDjoman.monitoringBackend.dto;

import java.util.Date;

public class DonneeCapteurDTO {
    private Long id;
    private Double valeur;
    private Date dateCollecte;
    private EquipementDTO equipement;

    // Constructeur correspondant à la requête JPQL
    public DonneeCapteurDTO(Long id, Double valeur, Date dateCollecte, EquipementDTO equipement) {
        this.id = id;
        this.valeur = valeur;
        this.dateCollecte = dateCollecte;
        this.equipement = equipement;
    }

    // Getters et setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Double getValeur() { return valeur; }
    public void setValeur(Double valeur) { this.valeur = valeur; }

    public Date getDateCollecte() { return dateCollecte; }
    public void setDateCollecte(Date dateCollecte) { this.dateCollecte = dateCollecte; }

    public EquipementDTO getEquipement() { return equipement; }
    public void setEquipement(EquipementDTO equipement) { this.equipement = equipement; }
}