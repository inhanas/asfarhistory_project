package org.sid.asfarhistory.entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Entity
 @Data @NoArgsConstructor
public class Joueurs {
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
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dateDArrivee2;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dateDDepart2;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dateDArrivee3;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd ")
    private Date dateDDepart3;
    private String piedsFort;
    private String numeroMaillot;
    private String tel;
    private Double taille;
    private String image;
    private int totalTitre;
    private int titreAvecFar;

    @OneToMany( targetEntity=Articles.class, mappedBy="joueurs" )
    private List<Articles> articles;


    public Joueurs(String nom, String prenom, Date dateDeNaissance, Date dateDArrivee, Date dateDDepart, Date dateDArrivee2, Date dateDDepart2, Date dateDArrivee3, Date dateDDepart3, String piedsFort, String numeroMaillot, String tel, Double taille, String image, int totalTitre, int titreAvecFar) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateDeNaissance = dateDeNaissance;
        this.dateDArrivee = dateDArrivee;
        this.dateDDepart = dateDDepart;
        this.dateDArrivee2 = dateDArrivee2;
        this.dateDDepart2 = dateDDepart2;
        this.dateDArrivee3 = dateDArrivee3;
        this.dateDDepart3 = dateDDepart3;
        this.piedsFort = piedsFort;
        this.numeroMaillot = numeroMaillot;
        this.tel = tel;
        this.taille = taille;
        this.image = image;
        this.totalTitre = totalTitre;
        this.titreAvecFar = titreAvecFar;

    }

}
