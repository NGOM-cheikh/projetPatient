package fr.digi.demo;

import fr.digi.demo.entities.Patient;
import fr.digi.demo.repositories.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;

@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    private PatientRepository patientRepository;

    @Override
    public void run(String... args) throws Exception {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        patientRepository.save(new Patient(null, "Didier", "John", dateFormat.parse("1980-01-01"), "123 Main St", false));
        patientRepository.save(new Patient(null, "Diallo", "koura", dateFormat.parse("1985-02-15"), "456 Oak Ave", true));
        patientRepository.save(new Patient(null, "Brown", "Charlie", dateFormat.parse("1990-03-20"), "789 Pine Rd", false));
        patientRepository.save(new Patient(null, "Jones", "Emily", dateFormat.parse("1995-04-10"), "101 Maple Dr", true));
        patientRepository.save(new Patient(null, "Miller", "David", dateFormat.parse("1975-05-05"), "202 Birch Ln", false));
        patientRepository.save(new Patient(null, "Wilson", "Samuel", dateFormat.parse("2000-06-25"), "303 Cedar St", true));
        patientRepository.save(new Patient(null, "Moore", "Kevin", dateFormat.parse("1988-07-30"), "404 Elm St", false));
        patientRepository.save(new Patient(null, "Taylor", "Sophia", dateFormat.parse("1992-08-10"), "505 Spruce Ct", true));
        patientRepository.save(new Patient(null, "Anderson", "Robert", dateFormat.parse("1970-09-15"), "606 Ash Blvd", false));
        patientRepository.save(new Patient(null, "Thomas", "Olivia", dateFormat.parse("1982-10-22"), "707 Cherry Pl", true));
    }
}
