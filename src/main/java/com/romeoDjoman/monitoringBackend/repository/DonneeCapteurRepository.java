package com.romeoDjoman.monitoringBackend.repository;

import com.romeoDjoman.monitoringBackend.dto.DonneeCapteurDTO;
import com.romeoDjoman.monitoringBackend.entity.DonneeCapteur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

public interface DonneeCapteurRepository extends JpaRepository<DonneeCapteur, Long> {

    @Query("SELECT new com.romeoDjoman.monitoringBackend.dto.DonneeCapteurDTO(d.id, d.valeur, d.dateCollecte, new com.romeoDjoman.monitoringBackend.dto.EquipementDTO(e.id, e.nom, e.type, e.dateInstallation)) " +
            "FROM DonneeCapteur d JOIN d.equipement e")
    List<DonneeCapteurDTO> findAllWithEquipement();

    @Query("SELECT new com.romeoDjoman.monitoringBackend.dto.DonneeCapteurDTO(d.id, d.valeur, d.dateCollecte, new com.romeoDjoman.monitoringBackend.dto.EquipementDTO(e.id, e.nom, e.type, e.dateInstallation)) " +
            "FROM DonneeCapteur d JOIN d.equipement e WHERE e.id = :equipementId")
    List<DonneeCapteurDTO> findByEquipementIdWithEquipement(Long equipementId);

    List<DonneeCapteur> findByEquipementId(Long equipementId);
}