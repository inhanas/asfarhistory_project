package org.sid.asfarhistory.dao;

import org.sid.asfarhistory.entities.Articles;
import org.sid.asfarhistory.entities.Joueurs;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ArticlesRepository extends JpaRepository<Articles,Long> {

    @Query("SELECT a FROM Articles a left join Joueurs j on a.joueurs.id = j.id WHERE j.nom like:x")
    public List<Articles> findByName(@Param("x") String name);
}
