package bz.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;

@Entity(name = "etatExemplaire")
@Getter
public class EtatExemplaire {
    @Id
    @ManyToOne
    @JoinColumn(name = "idExemplaire", referencedColumnName = "idExemplaire")
    private Exemplaire exemplaire;
    @Id
    @ManyToOne
    @JoinColumn(name = "idEtat", referencedColumnName = "idEtat")
    private Etat etat;
}
