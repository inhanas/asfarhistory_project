package org.sid.asfarhistory.web;

import org.sid.asfarhistory.dao.ArticlesRepository;
import org.sid.asfarhistory.dao.JoueursRepository;
import org.sid.asfarhistory.dao.Saison2020Repository;
import org.sid.asfarhistory.dao.Saison2021Repository;
import org.sid.asfarhistory.entities.Articles;
import org.sid.asfarhistory.entities.Joueurs;
import org.sid.asfarhistory.entities.Saison2020;
import org.sid.asfarhistory.entities.Saison2021;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jms.artemis.ArtemisProperties;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class ArticlesController {
    @Autowired
    ArticlesRepository articlesRepository;
    @Autowired
    JoueursRepository joueursRepository;


    @GetMapping(path="/formArticles")
    public String formPlayers(Model model){
        model.addAttribute("articles", new Articles());
        List<Joueurs> joueurs = joueursRepository.findAll();
        model.addAttribute("listdesJoueurs",joueurs);
         return "form/formArticles";
    }
    @PostMapping(path="/saveArticles")
    public String savePlayers(Articles articles,@RequestParam String name){
        Joueurs joueurs = joueursRepository.findByName(name);
        articles.setJoueurs(joueurs);
        articlesRepository.save(articles);
        return "form/confirmation";
    }

    }



