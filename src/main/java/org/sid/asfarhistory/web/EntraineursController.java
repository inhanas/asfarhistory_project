package org.sid.asfarhistory.web;

import org.sid.asfarhistory.dao.*;
import org.sid.asfarhistory.entities.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class EntraineursController {
    @Autowired
    EntraineursRepository entraineursRepository;
    @Autowired
    EntraineursSaisonRepository entraineursSaisonRepository;
    @Autowired
    ArticlesRepository articlesRepository;

    @GetMapping(path="/formManagers")
    public String formManagers(Model model){
        model.addAttribute("managers", new Entraineurs());
         return "form/formManagers";
    }
    @PostMapping(path="/saveManagers")
    public String saveManagers(Entraineurs managers){
        entraineursRepository.save(managers);
        return "form/confirmation";
    }

    @GetMapping(path = "/managers")
    public String getManagers(Model model){
        List<Entraineurs> entraineurs4 = entraineursRepository.find4rows();
        model.addAttribute("listDesEntraineurs4",entraineurs4);

        List<Entraineurs> entraineurs8 = entraineursRepository.find8rows();
        model.addAttribute("listDesEntraineurs8",entraineurs8);

        List<Entraineurs> entraineurs12 = entraineursRepository.find12rows();
        model.addAttribute("listDesEntraineurs12",entraineurs12);

        List<Entraineurs> entraineurs16 = entraineursRepository.find16rows();
        model.addAttribute("listDesEntraineurs16",entraineurs16);

        List<Entraineurs> entraineurs20 = entraineursRepository.find20rows();
        model.addAttribute("listDesEntraineurs20",entraineurs20);

        List<Entraineurs> entraineurs24 = entraineursRepository.find24rows();
        model.addAttribute("listDesEntraineurs24",entraineurs24);

        List<Entraineurs> entraineurs28 = entraineursRepository.find28rows();
        model.addAttribute("listDesEntraineurs28",entraineurs28);

        List<Entraineurs> entraineurs32 = entraineursRepository.find32rows();
        model.addAttribute("listDesEntraineurs32",entraineurs32);

        List<Entraineurs> entraineurs36 = entraineursRepository.find36rows();
        model.addAttribute("listDesEntraineurs36",entraineurs36);

        List<Entraineurs> entraineurs40 = entraineursRepository.find40rows();
        model.addAttribute("listDesEntraineurs40",entraineurs40);

        List<Entraineurs> entraineurs44 = entraineursRepository.find44rows();
        model.addAttribute("listDesEntraineurs44",entraineurs44);

        List<Entraineurs> entraineurs48 = entraineursRepository.find48rows();
        model.addAttribute("listDesEntraineurs48",entraineurs48);


        return "entraineurs/listDesEntraineurs";
    }

    @GetMapping(path="/profilEntraineurs")
    public String profilEntraineurs(Model model,@RequestParam(name="name",defaultValue = "") String name){
        List<Entraineurs> profilEntraineurs = entraineursRepository.findByNameList(name);
        model.addAttribute("profilEntraineurs",profilEntraineurs);
        List<EntraineursSaison> listDesStatsEntraineurs = entraineursSaisonRepository.findByNameList(name);
        model.addAttribute("listDesStatsEntraineurs",listDesStatsEntraineurs);
        List<Articles> articles = articlesRepository.findByName(name);
        model.addAttribute("articles",articles);
        return "entraineurs/profilEntraineurs";
    }
    }



