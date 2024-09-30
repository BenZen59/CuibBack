package bz.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;

@Entity(name = "avoirPiste")
@Getter

public class AvoirPiste {
    @Id
    @ManyToOne
    @JoinColumn(name = "idMedia", referencedColumnName = "idMedia")
    private Media media;
    @Id
    @ManyToOne
    @JoinColumn(name = "idFormat", referencedColumnName = "idPiste")
    private Piste piste;
}
