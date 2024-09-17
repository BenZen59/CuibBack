package bz.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity(name = "langue")
@Table(name = "langue")
public class Langue {
    @Id
    @Column(name = "code_ISO_639_1")
    private String codeISO6391;
    @Column(name = "libelle")
    private String libelle;
}
