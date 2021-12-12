package org.sid.asfarhistory.dao;

import org.sid.asfarhistory.entities.Entraineurs;
import org.sid.asfarhistory.entities.Joueurs;
import org.sid.asfarhistory.entities.Saison2020;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EntraineursRepository extends JpaRepository<Entraineurs,Long> {


    @Query(nativeQuery = true, value ="Select * from Entraineurs ORDER BY dateddepart LIMIT 0,4")
    public List<Entraineurs> find4rows();
    @Query(nativeQuery = true, value ="Select * from Entraineurs ORDER BY dateddepart LIMIT 4,4")
    public List<Entraineurs> find8rows();
    @Query(nativeQuery = true, value ="Select * from Entraineurs ORDER BY dateddepart LIMIT 8,4")
    public List<Entraineurs> find12rows();
    @Query(nativeQuery = true, value ="Select * from Entraineurs ORDER BY dateddepart LIMIT 12,4")
    public List<Entraineurs> find16rows();
    @Query(nativeQuery = true, value ="Select * from Entraineurs ORDER BY dateddepart LIMIT 16,4")
    public List<Entraineurs> find20rows();
    @Query(nativeQuery = true, value ="Select * from Entraineurs ORDER BY dateddepart LIMIT 20,4")
    public List<Entraineurs> find24rows();
    @Query(nativeQuery = true, value ="Select * from Entraineurs ORDER BY dateddepart LIMIT 24,4")
    public List<Entraineurs> find28rows();
    @Query(nativeQuery = true, value ="Select * from Entraineurs ORDER BY dateddepart LIMIT 28,4")
    public List<Entraineurs> find32rows();
    @Query(nativeQuery = true, value ="Select * from Entraineurs ORDER BY dateddepart LIMIT 32,4")
    public List<Entraineurs> find36rows();
    @Query(nativeQuery = true, value ="Select * from Entraineurs ORDER BY dateddepart LIMIT 36,4")
    public List<Entraineurs> find40rows();
    @Query(nativeQuery = true, value ="Select * from Entraineurs ORDER BY dateddepart LIMIT 40,4")
    public List<Entraineurs> find44rows();
    @Query(nativeQuery = true, value ="Select * from Entraineurs ORDER BY dateddepart LIMIT 44,4")
    public List<Entraineurs> find48rows();

    @Query("Select j from Entraineurs j where j.nom like :x")
    public Entraineurs findByName(@Param("x") String name);

    @Query("Select j from Entraineurs j where j.nom like :x")
    public List<Entraineurs> findByNameList(@Param("x") String name);
}
