package com.example.aula_project_spring.model;

import jakarta.persistence.*;

@Entity
@Table(name = "words")
public class Word {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String ptWord;

    @Column(nullable = false)
    private String enWord;

    @Column(nullable = false)
    private String ptMeaning;

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPtWord() {
        return ptWord;
    }

    public void setPtWord(String ptWord) {
        this.ptWord = ptWord;
    }

    public String getEnWord() {
        return enWord;
    }

    public void setEnWord(String enWord) {
        this.enWord = enWord;
    }

    public String getPtMeaning() {
        return ptMeaning;
    }

    public void setPtMeaning(String ptMeaning) {
        this.ptMeaning = ptMeaning;
    }
}