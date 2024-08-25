package fr.digi.demo.controllers;

import fr.digi.demo.entities.Patient;
import fr.digi.demo.services.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PatientController {

    @Autowired
    private PatientService patientService;

    @GetMapping("/patients")
    public List<Patient> getPatients() {
        return patientService.getAllPatients();
    }

    @PostMapping("/patients")
    public void addPatient(@RequestBody Patient patient) {
        patientService.savePatient(patient);
    }
}
