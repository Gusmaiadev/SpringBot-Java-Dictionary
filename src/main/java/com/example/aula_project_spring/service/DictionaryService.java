package com.example.aula_project_spring.service;

import com.example.aula_project_spring.model.Word;
import com.example.aula_project_spring.repository.WordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public class DictionaryService {

    @Autowired
    private WordRepository wordRepository;

    public Word createWord(Word word) {
        return wordRepository.save(word);
    }

    public Word updateWord(Long id, Word word) {
        word.setId(id);
        return wordRepository.save(word);
    }

    public Page<Word> searchWords(String term, int page) {
        return wordRepository.findByPtWordContainingOrEnWordContaining(term, term, PageRequest.of(page, 10));
    }

    public void deleteWord(Long id) {
        wordRepository.deleteById(id);
    }
}