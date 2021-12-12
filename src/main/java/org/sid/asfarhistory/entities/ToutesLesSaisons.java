package org.sid.asfarhistory.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
public class ToutesLesSaisons {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String saison;
    private String classement;
    private String entraineur;

    private int nbButsMarques;
    private int nbButsEncaisses;

    private int butMPiedGauche;
    private int butMPiedDroit;
    private int butMTete;
    private int butMPenalty;
    private int butMCoupDePiedArrete;
    private int butMPhaseDeJeu;

    private int butEPiedGauche;
    private int butEPiedDroit;
    private int butETete;
    private int butEPenalty;
    private int butECoupDePiedArrete;
    private int butEPhaseDeJeu;

    private int butM0_15;
    private int butM16_30;
    private int butM31_45;
    private int butM46_60;
    private int butM61_75;
    private int butM76_90;
    private int butM91_94;

    private int butE0_15;
    private int butE16_30;
    private int butE31_45;
    private int butE46_60;
    private int butE61_75;
    private int butE76_90;
    private int butE91_94;

    private int butM_1MT;
    private int butM_2MT;

    private int butME_1MT;
    private int butE_2MT;

    private int nbVictoires;
    private int nbNuls;
    private int nbDefaites;

    private int nbVictoiresExt;
    private int nbNulsExt;
    private int nbDefaitesExt;

    private int nbVictoiresDom;
    private int nbNulsDom;
    private int nbDefaitesDom;

    private int nbVictoires_1MT;
    private int nbNuls1MT;
    private int nbDefaites1MT;

    private int nbVictoires_2MT;
    private int nbNuls_2MT;
    private int nbDefaites_2MT;

    private int nbDArrives;
    private int nbDDepart;


    public ToutesLesSaisons(String saison, String classement, String entraineur, int nbButsMarques, int nbButsEncaisses, int butMPiedGauche, int butMPiedDroit, int butMTete, int butMPenalty, int butMCoupDePiedArrete, int butMPhaseDeJeu, int butEPiedGauche, int butEPiedDroit, int butETete, int butEPenalty, int butECoupDePiedArrete, int butEPhaseDeJeu, int butM0_15, int butM16_30, int butM31_45, int butM46_60, int butM61_75, int butM76_90, int butM91_94, int butE0_15, int butE16_30, int butE31_45, int butE46_60, int butE61_75, int butE76_90, int butE91_94, int butM_1MT, int butM_2MT, int butME_1MT, int butE_2MT, int nbVictoires, int nbNuls, int nbDefaites, int nbVictoiresExt, int nbNulsExt, int nbDefaitesExt, int nbVictoiresDom, int nbNulsDom, int nbDefaitesDom, int nbVictoires_1MT, int nbNuls1MT, int nbDefaites1MT, int nbVictoires_2MT, int nbNuls_2MT, int nbDefaites_2MT, int nbDArrives, int nbDDepart) {
        this.saison = saison;
        this.classement = classement;
        this.entraineur = entraineur;
        this.nbButsMarques = nbButsMarques;
        this.nbButsEncaisses = nbButsEncaisses;
        this.butMPiedGauche = butMPiedGauche;
        this.butMPiedDroit = butMPiedDroit;
        this.butMTete = butMTete;
        this.butMPenalty = butMPenalty;
        this.butMCoupDePiedArrete = butMCoupDePiedArrete;
        this.butMPhaseDeJeu = butMPhaseDeJeu;
        this.butEPiedGauche = butEPiedGauche;
        this.butEPiedDroit = butEPiedDroit;
        this.butETete = butETete;
        this.butEPenalty = butEPenalty;
        this.butECoupDePiedArrete = butECoupDePiedArrete;
        this.butEPhaseDeJeu = butEPhaseDeJeu;
        this.butM0_15 = butM0_15;
        this.butM16_30 = butM16_30;
        this.butM31_45 = butM31_45;
        this.butM46_60 = butM46_60;
        this.butM61_75 = butM61_75;
        this.butM76_90 = butM76_90;
        this.butM91_94 = butM91_94;
        this.butE0_15 = butE0_15;
        this.butE16_30 = butE16_30;
        this.butE31_45 = butE31_45;
        this.butE46_60 = butE46_60;
        this.butE61_75 = butE61_75;
        this.butE76_90 = butE76_90;
        this.butE91_94 = butE91_94;
        this.butM_1MT = butM_1MT;
        this.butM_2MT = butM_2MT;
        this.butME_1MT = butME_1MT;
        this.butE_2MT = butE_2MT;
        this.nbVictoires = nbVictoires;
        this.nbNuls = nbNuls;
        this.nbDefaites = nbDefaites;
        this.nbVictoiresExt = nbVictoiresExt;
        this.nbNulsExt = nbNulsExt;
        this.nbDefaitesExt = nbDefaitesExt;
        this.nbVictoiresDom = nbVictoiresDom;
        this.nbNulsDom = nbNulsDom;
        this.nbDefaitesDom = nbDefaitesDom;
        this.nbVictoires_1MT = nbVictoires_1MT;
        this.nbNuls1MT = nbNuls1MT;
        this.nbDefaites1MT = nbDefaites1MT;
        this.nbVictoires_2MT = nbVictoires_2MT;
        this.nbNuls_2MT = nbNuls_2MT;
        this.nbDefaites_2MT = nbDefaites_2MT;
        this.nbDArrives = nbDArrives;
        this.nbDDepart = nbDDepart;
    }
}
