package bz.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;

@Entity(name = "editer")
@Getter
public class Editer {
    @Id
    @ManyToOne
    @JoinColumn(name = "idMedia", referencedColumnName = "idMedia")
    private Media media;
    @Id
    @ManyToOne
    @JoinColumn(name = "idEditeur", referencedColumnName = "idEditeur")
    private Editeur editeur;
}
