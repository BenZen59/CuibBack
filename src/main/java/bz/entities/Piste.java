package bz.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity(name = "piste")
@Table(name = "piste")
public class Piste {
    @Id
    @Column(name = "idPiste")
    private int idPiste;
    @Column(name = "libelle")
    private String libelle;
    @Column(name = "duree")
    private int duree;
}
