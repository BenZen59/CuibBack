package bz.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;

@Entity(name = "avoirStyleMusical")
@Getter
public class AvoirStyleMusical {
    @Id
    @ManyToOne
    @JoinColumn(name = "idMedia", referencedColumnName = "idMedia")
    private Media media;
    @Id
    @ManyToOne
    @JoinColumn(name = "idStyleMusical", referencedColumnName = "idStyleMusical")
    private StyleMusical styleMusical;
}
