package com.romeoDjoman.monitoringBackend.repository;

import com.romeoDjoman.monitoringBackend.entity.DonneeCapteur;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface DonneeCapteurRepository extends JpaRepository<DonneeCapteur, Long> {

    @EntityGraph(attributePaths = {"equipement"})  // Charge explicitement la relation equipement
    List<DonneeCapteur> findAll();

    @EntityGraph(attributePaths = {"equipement"})
    List<DonneeCapteur> findByEquipementId(Long equipementId);
}