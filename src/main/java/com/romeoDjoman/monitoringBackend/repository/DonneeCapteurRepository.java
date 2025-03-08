package com.romeoDjoman.monitoringBackend.repository;

import com.romeoDjoman.monitoringBackend.entity.DonneeCapteur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DonneeCapteurRepository extends JpaRepository<DonneeCapteur, Long> {
}
