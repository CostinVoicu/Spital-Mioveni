package com.wtzconsult.demo.repository;

import com.wtzconsult.demo.bo.Sectie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SectieRepository extends JpaRepository<Sectie, Long> {
    default Sectie findSectieByIdOrElseThrow(Long sectieId){
        return findById(sectieId).orElseThrow(() -> new RuntimeException("Cannot found section with id :"+ sectieId.toString()));
    }
    Sectie findByNume(String nume);
}
