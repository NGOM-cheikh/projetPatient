package fr.digi.demo.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Patient {
    public Patient(Object object, String string, String string2, Date date, String string3, boolean b) {
		// TODO Auto-generated constructor stub
	}

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 50)
    private String nom;

    @Column(nullable = false, length = 50)
    private String prenom;

    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dateNaissance;

    @Column(nullable = false, length = 100)
    private String adresse;

    @Column(nullable = false)
    private boolean malade;
}
