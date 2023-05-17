package com.wtzconsult.demo.repository;

import com.wtzconsult.demo.bo.Paturi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaturiRepository extends JpaRepository<Paturi, Long> {

}
