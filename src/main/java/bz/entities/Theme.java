package bz.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity(name = "theme")
@Table(name = "theme")
public class Theme {
    @Id
    @Column(name = "idTheme")
    private int idTheme;
    @Column(name = "libelle")
    private String libelle;
}
