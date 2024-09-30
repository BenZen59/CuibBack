package bz.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;

@Entity(name = "avoirTheme")
@Getter
public class AvoirTheme {
    @Id
    @ManyToOne
    @JoinColumn(name = "idMedia", referencedColumnName = "idMedia")
    private Media media;
    @Id
    @ManyToOne
    @JoinColumn(name = "idTheme", referencedColumnName = "idTheme")
    private Theme theme;
}
