package bz.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity(name = "serie")
@Table(name = "serie")

public class Serie {
    @Id
    @Column(name = "idSerie")
    private int idSerie;
    @Column(name = "libelle")
    private String libelle;
}
