package com.example.aula_project_spring.repository;

import com.example.aula_project_spring.model.Word;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface WordRepository extends JpaRepository<Word, Long> {
    Page<Word> findByPtWordContainingOrEnWordContaining(String ptTerm, String enTerm, Pageable pageable);
}