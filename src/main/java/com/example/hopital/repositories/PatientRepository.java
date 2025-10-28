package com.example.hopital.repositories;

import com.example.hopital.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface PatientRepository extends JpaRepository<Patient,Long >{
    Patient findByNom(String name);
}
