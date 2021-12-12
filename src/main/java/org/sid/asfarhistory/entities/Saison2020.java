package org.sid.asfarhistory.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

import org.hibernate.annotations.ManyToAny;
import org.sid.asfarhistory.entities.Joueurs;
import org.springframework.boot.context.properties.bind.DefaultValue;

@Entity
@Data @NoArgsConstructor
public class Saison2020 {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nom;
    private String prenom;
    private int minutesJouees;
    private int butMarques;
    private int cartonsJaunes;
    private int cartonsRouges;
    private int assists;
    private int nbMatchesTitulaires;
    private int nbMatchesRemplacants;
    private int botola;
    private int coupeDuTrone;
    private int cl;
    private int cCAF;
    private int autreCompt;
    private int butsEnBotola;
    private int butsEnCoupeDuTrone;
    private int butsEnCL;
    private int butsEnCoupeDeLaCAF;
    private int butsEnAutreCompt;

    private String saison="2019-2020";
    @ToString.Exclude
    @ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.LAZY)
    private Joueurs joueurs;

    public Saison2020(String nom, String prenom, int minutesJouees, int butMarques, int cartonsJaunes,
                      int cartonsRouges, int assists, int nbMatchesTitulaires, int nbMatchesRemplacants,int botola,
                      int coupeDuTrone, int cl, int cCAF, int autreCompt,int butsEnBotola,int butsEnCoupeDuTrone,
                      int butsEnCL,int butsEnCoupeDeLaCAF, int butsEnAutreCompt,
                      Joueurs joueurs) {
        this.nom = nom;
        this.prenom = prenom;
        this.minutesJouees = minutesJouees;
        this.butMarques = butMarques;
        this.cartonsJaunes = cartonsJaunes;
        this.cartonsRouges = cartonsRouges;
        this.assists = assists;
        this.nbMatchesTitulaires = nbMatchesTitulaires;
        this.nbMatchesRemplacants = nbMatchesRemplacants;
        this.botola=botola;
        this.coupeDuTrone=coupeDuTrone;
        this.cl=cl;
        this.cCAF=cCAF;
        this.autreCompt=autreCompt;
        this.joueurs = joueurs;
        this.butsEnBotola=butsEnBotola;
        this.butsEnCoupeDuTrone=butsEnCoupeDuTrone;
        this.butsEnCL=butsEnCL;
        this.butsEnCoupeDeLaCAF=butsEnCoupeDeLaCAF;
        this.butsEnAutreCompt=butsEnAutreCompt;
        saison="2019-2020";
    }


}
