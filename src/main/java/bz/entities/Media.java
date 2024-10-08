package bz.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "media")
@Table(name = "media")
@Getter
@Setter
@AllArgsConstructor

public class Media {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idMedia")
    private Integer idMedia;
    @Column(name = "titre")
    private String titre;
    @Column(name = "drm")
    private Integer drm;
    @Column(name = "duree")
    private Integer duree;
    @Column(name = "reservable")
    private Integer reservable;
    @ManyToOne
    @JoinColumn(name = "idTypeMedia", referencedColumnName = "idTypeMedia")
    private TypeMedia typeMedia;
    @ManyToOne
    @JoinColumn(name = "code_ISO_639_1", referencedColumnName = "code_ISO_639_1")
    private Langue langue;

    public Media() {

    }
}
