package com.example.hopital.repositories;
import com.example.hopital.entities.Medcin;
import com.example.hopital.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
public interface MedecinTRepository extends JpaRepository<Medcin,Long> {
    Medcin findByNom(String nom);
}
