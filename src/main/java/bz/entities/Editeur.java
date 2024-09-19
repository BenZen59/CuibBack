package bz.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity(name = "editeur")
@Table(name = "editeur")
public class Editeur {
    @Id
    @Column(name = "idEditeur")
    private int idEditeur;
    @Column(name = "libelle")
    private String libelle;
}
