package com.example.hopital.repositories;
import com.example.hopital.entities.Patient;
import com.example.hopital.entities.RendezVous;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
public interface RendezVousRepository extends JpaRepository<RendezVous, Long> {
}
