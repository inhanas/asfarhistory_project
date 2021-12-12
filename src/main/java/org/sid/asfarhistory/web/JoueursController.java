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
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class JoueursController {
    @Autowired
    JoueursRepository joueursRepository;
    @Autowired
    Saison2020Repository saison2020Repository;
    @Autowired
    Saison2021Repository saison2021Repository;
    @Autowired
    ArticlesRepository articlesRepository;
    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping(path="/formPlayers")
    public String formPlayers(Model model){
        model.addAttribute("players", new Joueurs());
         return "form/formPlayers";
    }
    @PostMapping(path="/savePlayers")
    public String savePlayers(Joueurs players){


        joueursRepository.save(players);
        return "form/confirmation";
    }
    @GetMapping(path="/joueurs")
    public String getPlayers(Model model,
                             @RequestParam(name="page",defaultValue = "0")int page,
                             @RequestParam(name="size",defaultValue ="5") int size,
                             @RequestParam(name="name",defaultValue = "") String name){
        if(name.equalsIgnoreCase("")){
            Page<Joueurs> pagesJoueurs = joueursRepository.findAll(PageRequest.of(page, size));
            model.addAttribute("listJoueurs",pagesJoueurs.getContent());
            model.addAttribute("pages",new int [pagesJoueurs.getTotalPages()]);
            model.addAttribute("currentPage",page);
            model.addAttribute("name",name);

        }
        else {
            Page<Joueurs> pagesJoueurs = joueursRepository.findByMc(name, PageRequest.of(page, size));
            model.addAttribute("listJoueurs",pagesJoueurs.getContent());
            model.addAttribute("pages",new int [pagesJoueurs.getTotalPages()]);
            model.addAttribute("currentPage",page);
            model.addAttribute("name",name);
        }

        return "joueurs/listDesJoueurs";
    }

    @GetMapping(path="/profilJoueurs")
    public String profilJoueurs(Model model,@RequestParam(name="name",defaultValue = "") String name){
            List<Joueurs> profilJoueurs = joueursRepository.findByNameList(name);
            model.addAttribute("profilJoueurs",profilJoueurs);
            List<Saison2020> apparenceSaison2020 = saison2020Repository.findByNameList(name);
            model.addAttribute("apparenceSaison2020",apparenceSaison2020);
            List<Saison2021> apparenceSaison2021 = saison2021Repository.findByNameList(name);
            model.addAttribute("apparenceSaison2021",apparenceSaison2021);
            List<Articles> articles = articlesRepository.findByName(name);
            model.addAttribute("articles",articles);
        return "joueurs/profilJoueurs";
    }

    }



