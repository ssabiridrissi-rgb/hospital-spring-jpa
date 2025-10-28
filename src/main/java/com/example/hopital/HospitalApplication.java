package com.example.hopital;

import com.example.hopital.entities.*;
import com.example.hopital.repositories.ConsultationRepository;
import com.example.hopital.repositories.MedecinTRepository;
import com.example.hopital.repositories.PatientRepository;
import com.example.hopital.repositories.RendezVousRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.stream.Stream;

@SpringBootApplication
public class HospitalApplication {

    public static void main(String[] args) {
        SpringApplication.run(HospitalApplication.class, args);
    }

    @Bean
    CommandLineRunner start(
            PatientRepository patientRepository,
            MedecinTRepository medecinTRepository,
            RendezVousRepository rendezVousRepository,
            ConsultationRepository consultationRepository) {

        return args -> {
            Stream.of("Mohamed", "Hassan", "Najat").forEach(name -> {
                Patient patient = new Patient();
                patient.setNom(name);
                patient.setDateNaissance(new Date());
                patient.setMalade(false);
                patientRepository.save(patient);
            });

            Stream.of("ayman", "Saad", "Omar")
                    .forEach(name -> {
                        Medcin medecin = new Medcin();
                        medecin.setNom(name);
                        medecin.setEmail(name + "@gmail.com");
                        medecin.setSpecialite(Math.random() > 0.5 ? "Cardio" : "Dentiste");
                        medecinTRepository.save(medecin);
                    });

            Patient patient = patientRepository.findById(1L).orElse(null);
            Patient patient1 = patientRepository.findByNom("Mohamed");

            Medcin medecin = medecinTRepository.findByNom("Saad");

            RendezVous rendezVous = new RendezVous();
            rendezVous.setDate(new Date());
            rendezVous.setStatus(StatusRDV.Pending);
            rendezVous.setMedcin(medecin);
            rendezVous.setPatient(patient);
            RendezVous savedRDV = rendezVousRepository.save(rendezVous);
            System.out.println(savedRDV.getId());


            RendezVous rendezVous1 = rendezVousRepository.findById(1L).orElse(null);
            Consultation consultation = new Consultation();
            consultation.setDateConsultation(new Date());
            consultation.setRendezVous(rendezVous1);
            consultation.setRapport("Rapport de la consultion.....");
            consultationRepository.save(consultation);
        };
    }
}
