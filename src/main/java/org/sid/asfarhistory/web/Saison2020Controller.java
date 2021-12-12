package org.sid.asfarhistory.web;

import org.sid.asfarhistory.dao.JoueursRepository;
import org.sid.asfarhistory.dao.Saison2020Repository;
import org.sid.asfarhistory.dao.ToutesLesSaisonsRepository;
import org.sid.asfarhistory.entities.Joueurs;
import org.sid.asfarhistory.entities.Saison2020;
import org.sid.asfarhistory.entities.ToutesLesSaisons;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class Saison2020Controller {
    @Autowired
    Saison2020Repository saison2020Repository;
    @Autowired
    JoueursRepository joueursRepository;
    @Autowired
    ToutesLesSaisonsRepository toutesLesSaisonsRepository;

    @GetMapping(path="/formSaison2020")
    public String formSaison(Model model){
        model.addAttribute("saison2020", new Saison2020());
        List<Joueurs> joueurs = joueursRepository.findAll();
        model.addAttribute("listdesJoueurs",joueurs);

        return "form/formSaison2020";
    }
    @PostMapping(path="/saveSaison2020")
    public String saveSaison2020(Saison2020 saison2020, @RequestParam String name){
        Joueurs joueurs = joueursRepository.findByName(name);
        saison2020.setJoueurs(joueurs);
        saison2020Repository.save(saison2020);
        return "form/confirmation";
    }
    @GetMapping(path = "/saison2020")
    public String getAllPlayers(Model model){

//        la liste de tous les joueurs avec leurs staistiques
        List<Saison2020> allPlayers = saison2020Repository.findAll();
        model.addAttribute("playersListx",allPlayers);

//        La liste des 5 meilleurs buteurs
        List<Saison2020> bestGoals = saison2020Repository.findBestGoal();
        model.addAttribute("bestGoals",bestGoals);

//        la liste des 5 meilleurs apparances de la saison
        List<Saison2020> bestApparance = saison2020Repository.findBestApparance();
        model.addAttribute("bestApparance",bestApparance);

//        La liste des 5 meilleurs passeurs
        List<Saison2020> bestAssist = saison2020Repository.findBestAssist();
        model.addAttribute("bestAssist",bestAssist);

//        toutes les statistiques de la saison
        List<ToutesLesSaisons> allStats = toutesLesSaisonsRepository.findAllStat2020();
        model.addAttribute("allStats",allStats);


        return "saisons/saison2020";
    }
}

