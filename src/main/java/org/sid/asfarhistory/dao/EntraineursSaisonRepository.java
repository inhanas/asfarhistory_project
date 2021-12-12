package org.sid.asfarhistory.dao;

import org.sid.asfarhistory.entities.EntraineursSaison;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EntraineursSaisonRepository extends JpaRepository<EntraineursSaison,Long> {

    @Query("Select j from EntraineursSaison j where j.nom like :x")
    public List<EntraineursSaison> findByNameList(@Param("x") String name);
}
