package org.sid.asfarhistory.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
public class Articles {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String titres;
    private String description;
    private String liens;
    @ManyToOne
    private Joueurs joueurs;

    public Articles(String titres, String description, String liens, Joueurs joueurs) {
        this.titres = titres;
        this.description = description;
        this.liens = liens;
        this.joueurs = joueurs;
    }
}
