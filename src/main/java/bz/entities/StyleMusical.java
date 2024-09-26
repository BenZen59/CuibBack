package bz.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity(name = "styleMusical")
@Table(name = "styleMusical")
public class StyleMusical {
    @Id
    @Column(name = "idStyleMusical")
    private int idStyleMusical;
    @Column(name = "libelle")
    private String libelle;
}
