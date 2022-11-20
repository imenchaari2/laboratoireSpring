package com.example.msmembre.repositories;

import com.example.msmembre.entities.TeacherResearcher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TeacherResearcherRepository extends JpaRepository<TeacherResearcher, Long> {
    List<TeacherResearcher>findByGrade(String grade);
    List<TeacherResearcher> findByEtablishment(String etablishment);
}
