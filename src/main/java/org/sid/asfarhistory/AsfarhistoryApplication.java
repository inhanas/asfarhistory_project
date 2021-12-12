package org.sid.asfarhistory;

import org.sid.asfarhistory.dao.JoueursRepository;
import org.sid.asfarhistory.dao.Saison2020Repository;
import org.sid.asfarhistory.entities.Joueurs;
import org.sid.asfarhistory.entities.Saison2020;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.text.SimpleDateFormat;
import java.util.Date;

@SpringBootApplication
public class AsfarhistoryApplication implements CommandLineRunner {

    @Autowired
    private Saison2020Repository saison2020Repository;
    @Autowired
    private JoueursRepository joueursRepository;

    public static void main(String[] args) {
        SpringApplication.run(AsfarhistoryApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        
    }
}
