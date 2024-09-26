package bz.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity(name = "staff")
@Table(name = "staff")
public class Staff {
    @Id
    @Column(name = "idStaff")
    private int idStaff;
    @Column(name = "nom")
    private String nom;
    @Column(name = "prenom")
    private String prenom;
}
