package com.example.hopital.repositories;
import com.example.hopital.entities.Consultation;
import com.example.hopital.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
public interface ConsultationRepository extends JpaRepository<Consultation, Long>{
}
