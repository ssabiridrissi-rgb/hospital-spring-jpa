package com.example.hopital.service;

import com.example.hopital.entities.Consultation;
import com.example.hopital.entities.Medcin;
import com.example.hopital.entities.Patient;
import com.example.hopital.entities.RendezVous;
import com.example.hopital.repositories.ConsultationRepository;
import com.example.hopital.repositories.MedecinTRepository;
import com.example.hopital.repositories.PatientRepository;
import com.example.hopital.repositories.RendezVousRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class HospitalServiceImpl implements IHospitalService {
    private PatientRepository patientRepository;
    private ConsultationRepository consultationRepository;
    private MedecinTRepository medecinTRepository;
    private RendezVousRepository vousRepository;
    @Override
   public Patient save(Patient patient) {
        return null;
    }
}
