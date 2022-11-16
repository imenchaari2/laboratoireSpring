package com.example.msmembre.repositories;

import com.example.msmembre.entities.Etudiant;
import com.example.msmembre.entities.Membre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface MembreRepository extends JpaRepository<Membre, Long> {
    Membre findByCin(String cin);
    List<Membre>findByNomStartingWith(String caractere);
    Membre findByEmail(String email);
}
