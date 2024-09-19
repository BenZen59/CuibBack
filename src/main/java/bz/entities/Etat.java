package bz.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity(name = "etat")
@Table(name = "etat")
public class Etat {
    @Id
    @Column(name = "idEtat")
    private int idEtat;
    @Column(name = "libelle")
    private String libelle;
}
