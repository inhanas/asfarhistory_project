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
public class EntraineursSaisonController {
    @Autowired
    EntraineursSaisonRepository entraineursSaisonRepository;
    @Autowired
    EntraineursRepository entraineursRepository;

    @GetMapping(path="/formEntraineursSaison")
    public String formSaison(Model model){
        model.addAttribute("entraineursSaison", new EntraineursSaison());
        List<Entraineurs> entraineurs = entraineursRepository.findAll();
        model.addAttribute("listDesEntraineurs",entraineurs);

        return "form/formEntraineursSaison";
    }
    @PostMapping(path="/saveEntraineursSaison")
    public String saveSaison2020(EntraineursSaison entraineursSaison, @RequestParam String name){
        Entraineurs entraineurs = entraineursRepository.findByName(name);
        entraineursSaison.setEntraineurs(entraineurs);
        entraineursSaisonRepository.save(entraineursSaison);
        return "form/confirmation";
    }
}

