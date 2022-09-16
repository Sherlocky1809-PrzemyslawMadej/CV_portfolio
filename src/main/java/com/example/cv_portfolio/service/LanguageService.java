package com.example.cv_portfolio.service;

import com.example.cv_portfolio.model.Client;
import com.example.cv_portfolio.model.Language;
import com.example.cv_portfolio.repository.LanguageRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LanguageService {

    private LanguageRepository languageRepository;

    public LanguageService(LanguageRepository languageRepository) {
        this.languageRepository = languageRepository;
    }



    public void addLanguage(Language language) {
        languageRepository.save(language);
    }

    public List<Language> getLanguages() {
        return languageRepository.findAll();
    }

    public Language getLanguage(Long id) {
        return languageRepository.findById(id).orElse(null);
    }

    public void editLanguage(Language newLanguage) {
        languageRepository.save(newLanguage);
    }

    public void deleteLanguageById(Long id) {
        languageRepository.deleteById(id);
    }
}
