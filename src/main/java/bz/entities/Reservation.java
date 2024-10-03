package bz.entities;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;

@Entity(name = "reservation")
@Getter
public class Reservation {
    @Id
    @Column(name = "idReservation")
    private int idReservation;
    @Column(name = "dateReservation")
    private Date dateReservation;
    @Column(name = "dateRetrait")
    private Date dateRetrait;
    @ManyToOne
    @JoinColumn(name = "idExemplaire", referencedColumnName = "idExemplaire")
    private Exemplaire exemplaire;
    @ManyToOne
    @JoinColumn(name = "idStatutReservation", referencedColumnName = "idStatutReservation")
    private StatutReservation statutReservation;
    @ManyToOne
    @JoinColumn(name = "idMediatheque", referencedColumnName = "idMediatheque")
    private Mediatheque mediatheque;
    @ManyToOne
    @JoinColumn(name = "idAdherent", referencedColumnName = "idAdherent")
    private Adherent adherent;
}
