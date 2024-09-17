package bz.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity(name = "disponibilite")
@Table(name = "disponibilite")
public class Disponibilite {
    @Id
    @Column(name = "idDisponibilite")
    private int idDisponibilite;
    @Column(name = "libelle")
    private String libelle;
}
