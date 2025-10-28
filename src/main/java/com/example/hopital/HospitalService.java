package com.example.hopital;

import com.example.hopital.entities.Consultation;
import com.example.hopital.entities.Medcin;
import com.example.hopital.entities.Patient;
import com.example.hopital.entities.RendezVous;
import com.example.hopital.repositories.ConsultationRepository;
import com.example.hopital.repositories.MedecinTRepository;
import com.example.hopital.repositories.PatientRepository;
import com.example.hopital.repositories.RendezVousRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class HospitalService implements IHospitalService {

    @Autowired
    private PatientRepository patientRepository;

    @Autowired
    private MedecinTRepository medecinTRepository;

    @Autowired
    private RendezVousRepository rendezVousRepository;

    @Autowired
    private ConsultationRepository consultationRepository;

    @Override
    public Patient savePatient(Patient patient) {
        return null;
    }

    @Override
    public Medcin saveMedcin(Medcin medcin) {
        return null;
    }

    @Override
    public RendezVous saveRDV(RendezVous rendezVous) {

      ;return null;
    }

    @Override
    public Consultation saveConsultation(Consultation consultation) {
        return null;
    }
}
