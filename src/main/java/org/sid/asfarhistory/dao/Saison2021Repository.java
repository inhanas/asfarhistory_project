package org.sid.asfarhistory.dao;

import org.sid.asfarhistory.entities.Saison2020;
import org.sid.asfarhistory.entities.Saison2021;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface Saison2021Repository extends JpaRepository<Saison2021,Long> {
    @Query(nativeQuery = true, value ="Select * from Saison2021 ORDER BY but_Marques DESC LIMIT 5")
    public List<Saison2021> findBestGoal();

    @Query(nativeQuery = true, value ="Select * from Saison2021 ORDER BY minutes_jouees DESC LIMIT 5")
    public List<Saison2021> findBestApparance();

    @Query(nativeQuery = true, value ="Select * from Saison2021 ORDER BY assists DESC LIMIT 5")
    public List<Saison2021> findBestAssist();

    @Query("Select j from Saison2021 j where j.nom like :x")
    public List<Saison2021> findByNameList(@Param("x") String name);
}
