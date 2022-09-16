package com.example.cv_portfolio.controller;

import com.example.cv_portfolio.model.Language;
import com.example.cv_portfolio.service.LanguageService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class LanguageController {

    private LanguageService languageService;

    public LanguageController(LanguageService languageService) {
        this.languageService = languageService;
    }

    @GetMapping("/resume")
    public String getLanguages(Model model) {
        List<Language> languages = languageService.getLanguages();
        model.addAttribute("languages", languages);
        return "portfolio/resumeMe";
    }

}
