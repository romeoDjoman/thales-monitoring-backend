    package com.romeoDjoman.monitoringBackend.repository;

    import com.romeoDjoman.monitoringBackend.entity.Equipement;
    import org.springframework.data.jpa.repository.JpaRepository;
    import org.springframework.stereotype.Repository;

    @Repository
    public interface EquipementRepository extends JpaRepository<Equipement, Long> {

        Equipement findByNom(String nom);

    }
