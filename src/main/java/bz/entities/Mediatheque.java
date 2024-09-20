package bz.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity(name = "mediatheque")
@Table(name = "mediatheque")
public class Mediatheque {
    @Id
    @Column(name = "idMediatheque")
    private int idMediatheque;
    @Column(name = "libelle")
    private String libelle;
    @Column(name = "adresse")
    private String adresse;
}
