package bz.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity(name = "genreFilm")
@Table(name = "genreFilm")
public class GenreFilm {
    @Id
    @Column(name = "idGenreFilm")
    private int idGenreFilm;
    @Column(name = "libelle")
    private String libelle;
}
