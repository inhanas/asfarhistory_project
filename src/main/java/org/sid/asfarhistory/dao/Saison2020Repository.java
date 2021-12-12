package org.sid.asfarhistory.dao;

import org.sid.asfarhistory.entities.Joueurs;
import org.sid.asfarhistory.entities.Saison2020;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface Saison2020Repository extends JpaRepository<Saison2020,Long> {
    @Query(nativeQuery = true, value ="Select * from Saison2020 ORDER BY but_Marques DESC LIMIT 5")
    public List<Saison2020> findBestGoal();

    @Query(nativeQuery = true, value ="Select * from Saison2020 ORDER BY minutes_jouees DESC LIMIT 5")
    public List<Saison2020> findBestApparance();

    @Query(nativeQuery = true, value ="Select * from Saison2020 ORDER BY assists DESC LIMIT 5")
    public List<Saison2020> findBestAssist();

    @Query("Select j from Saison2020 j where j.nom like :x")
    public List<Saison2020> findByNameList(@Param("x") String name);
}
