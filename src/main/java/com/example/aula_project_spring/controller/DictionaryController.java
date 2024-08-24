
package com.example.aula_project_spring.controller;

import com.example.aula_project_spring.model.Word;
import com.example.aula_project_spring.service.DictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/dictionary")
public class DictionaryController {

    @Autowired
    private DictionaryService dictionaryService;

    @PostMapping("/create")
    public ResponseEntity<Word> createWord(@RequestBody Word word) {
        return ResponseEntity.ok(dictionaryService.createWord(word));
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Word> updateWord(@PathVariable Long id, @RequestBody Word word) {
        return ResponseEntity.ok(dictionaryService.updateWord(id, word));
    }

    @GetMapping("/search")
    public ResponseEntity<Page<Word>> searchWords(@RequestParam String term, @RequestParam(defaultValue = "0") int page) {
        return ResponseEntity.ok(dictionaryService.searchWords(term, page));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteWord(@PathVariable Long id) {
        dictionaryService.deleteWord(id);
        return ResponseEntity.ok().build();
    }
}