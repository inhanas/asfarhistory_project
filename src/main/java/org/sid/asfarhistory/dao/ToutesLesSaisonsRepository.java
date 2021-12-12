package org.sid.asfarhistory.dao;

import org.sid.asfarhistory.entities.Saison2020;
import org.sid.asfarhistory.entities.ToutesLesSaisons;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ToutesLesSaisonsRepository extends JpaRepository<ToutesLesSaisons,Long> {

    @Query(nativeQuery = true, value ="SELECT * FROM toutes_les_saisons WHERE saison='saison2020'")
    public List<ToutesLesSaisons> findAllStat2020();
}
