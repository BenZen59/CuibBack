package bz.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity(name = "typeMedia")
@Table(name = "typeMedia")
public class TypeMedia {
    @Id
    @Column(name = "idTypeMedia")
    private int idTypeProduit;
    @Column(name = "libelle")
    private String libelle;
}
