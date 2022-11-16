package com.example.msmembre.repositories;

import com.example.msmembre.entities.EnseignantChercheur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EnseignantChercheurRepository extends JpaRepository<EnseignantChercheur, Long> {
    List<EnseignantChercheur>findByGrade(String grade);
    List<EnseignantChercheur> findByEtablissement(String etablissement);
}
