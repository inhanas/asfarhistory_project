package org.sid.asfarhistory.dao;

import org.sid.asfarhistory.entities.Joueurs;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface JoueursRepository extends JpaRepository<Joueurs,Long> {

    @Query("Select j from Joueurs j where j.nom like :x")
    public Joueurs findByName(@Param("x") String name);

    @Query("Select j from Joueurs j where j.nom like :x")
    public Page<Joueurs> findByMc(@Param("x") String name, Pageable pageable);

    @Query("Select j from Joueurs j where j.nom like :x")
    public List<Joueurs> findByNameList(@Param("x") String name);


}
