package bz.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity(name = "format")
@Table(name = "format")
public class Format {
    @Id
    @Column(name = "idFormat")
    private int idFormat;
    @Column(name = "libelle")
    private String libelle;
}
