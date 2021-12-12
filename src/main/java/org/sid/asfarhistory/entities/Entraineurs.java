package org.sid.asfarhistory.entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
 @Data @NoArgsConstructor
public class Entraineurs {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String prenom;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dateDeNaissance;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dateDArrivee;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dateDDepart;
    @Column(name = "clubsEntraines", insertable = true, updatable = true, nullable = false)
    @ColumnDefault("'clubs'")
    private String clubsEntraines;
    @ColumnDefault("'titres'")
    @Column(name = "titresRemportesAvecLesFar", insertable = true, updatable = true, nullable = false)
    private String titresRemportesAvecLesFar;
    @ColumnDefault("0")
    @Column(name = "NbTitresRemportesAvecLesFar", insertable = true, updatable = true, nullable = false)
    private int NbTitresRemportesAvecLesFar;
    @ColumnDefault("'image'")
    @Column(name = "image", insertable = true, updatable = true, nullable = false)
    private String image;

    public Entraineurs(String nom, String prenom, Date dateDeNaissance, Date dateDArrivee, Date dateDDepart, String clubsEntraines, String titresRemportesAvecLesFar, int nbTitresRemportesAvecLesFar, String image) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateDeNaissance = dateDeNaissance;
        this.dateDArrivee = dateDArrivee;
        this.dateDDepart = dateDDepart;
        this.clubsEntraines = clubsEntraines;
        this.titresRemportesAvecLesFar = titresRemportesAvecLesFar;
        NbTitresRemportesAvecLesFar = nbTitresRemportesAvecLesFar;
        this.image = image;
    }
}
