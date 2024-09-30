package bz.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;

@Entity(name = "exemplaire")
@Getter
public class Exemplaire {
    @Id
    @Column(name = "idExemplaire")
    private int idExemplaire;
    @Id
    @ManyToOne
    @JoinColumn(name = "idMedia", referencedColumnName = "idMedia")
    private Media media;
    @Id
    @ManyToOne
    @JoinColumn(name = "idDisponibilite", referencedColumnName = "idDisponibilite")
    private Disponibilite disponibilite;
}
