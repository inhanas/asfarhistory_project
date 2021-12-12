package org.sid.asfarhistory.web;

import org.sid.asfarhistory.dao.JoueursRepository;
import org.sid.asfarhistory.dao.Saison2021Repository;
import org.sid.asfarhistory.dao.ToutesLesSaisonsRepository;
import org.sid.asfarhistory.entities.Joueurs;
import org.sid.asfarhistory.entities.Saison2021;
import org.sid.asfarhistory.entities.ToutesLesSaisons;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class Saison2021Controller {
    @Autowired
    Saison2021Repository saison2021Repository;
    @Autowired
    JoueursRepository joueursRepository;
    @Autowired
    ToutesLesSaisonsRepository toutesLesSaisonsRepository;

    @GetMapping(path="/formSaison2021")
    public String formSaison(Model model){
        model.addAttribute("saison2021", new Saison2021());
        List<Joueurs> joueurs = joueursRepository.findAll();
        model.addAttribute("listdesJoueurs",joueurs);

        return "form/formSaison2021";
    }
    @PostMapping(path="/saveSaison2021")
    public String saveSaison2021(Saison2021 saison2021, @RequestParam String name){
        Joueurs joueurs = joueursRepository.findByName(name);
        saison2021.setJoueurs(joueurs);
        saison2021Repository.save(saison2021);
        return "form/confirmation";
    }
    @GetMapping(path = "/saison2021")
    public String getAllPlayers(Model model){

//        la liste de tous les joueurs avec leurs staistiques
        List<Saison2021> allPlayers = saison2021Repository.findAll();
        model.addAttribute("playersListx",allPlayers);

//        La liste des 5 meilleurs buteurs
        List<Saison2021> bestGoals = saison2021Repository.findBestGoal();
        model.addAttribute("bestGoals",bestGoals);

//        la liste des 5 meilleurs apparances de la saison
        List<Saison2021> bestApparance = saison2021Repository.findBestApparance();
        model.addAttribute("bestApparance",bestApparance);

//        La liste des 5 meilleurs passeurs
        List<Saison2021> bestAssist = saison2021Repository.findBestAssist();
        model.addAttribute("bestAssist",bestAssist);

//        toutes les statistiques de la saison
        List<ToutesLesSaisons> allStats = toutesLesSaisonsRepository.findAllStat2020();
        model.addAttribute("allStats",allStats);


        return "saisons/saison2021";
    }
}

