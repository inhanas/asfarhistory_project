package org.sid.asfarhistory.web;

import org.sid.asfarhistory.dao.ToutesLesSaisonsRepository;
import org.sid.asfarhistory.entities.ToutesLesSaisons;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ToutesLesSaisonsController {
    @Autowired
    ToutesLesSaisonsRepository toutesLesSaisonsRepository;
    @GetMapping(path="/statistiques")
    public String stats(){

        return "saisons/statistiquePage";
    }
    @GetMapping(path="/palmares")
    public String palmares(){

        return "palmares";
    }
    @GetMapping(path="/galerie")
    public String galerie(){

        return "galerie";
    }
    @GetMapping(path="/stars")
    public String nosStars(){
        return "stars/stars";
    }

    @GetMapping(path="/timoumi")
    public String timoumi(){
        return "stars/timoumi";
    }

    @GetMapping(path="/formToutesLesSaisons")
    public String formToutesLesSaisons(Model model){
        model.addAttribute("toutesLesSaisons", new ToutesLesSaisons());
        return "form/formToutesLesSaisons";
    }
    @PostMapping(path="/saveToutesLesSaisons")
    public String saveToutesLesSaisons(ToutesLesSaisons toutesLesSaisons){
        toutesLesSaisonsRepository.save(toutesLesSaisons);
        return "form/confirmation";
    }
}

