package bz.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity(name = "statutReservation")
@Table(name = "statutReservation")
public class StatutReservation {
    @Id
    @Column(name = "idStatutReservation")
    private int idStatutReservation;
    @Column(name = "libelle")
    private String libelle;
}
