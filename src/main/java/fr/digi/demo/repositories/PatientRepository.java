package fr.digi.demo.repositories;


import fr.digi.demo.entities.*;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {
}
