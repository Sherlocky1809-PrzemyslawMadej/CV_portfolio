package com.example.cv_portfolio.controller;


import com.example.cv_portfolio.model.Person;
import com.example.cv_portfolio.service.ClientService;
import com.example.cv_portfolio.service.LanguageService;
import com.example.cv_portfolio.service.PersonService;
import com.example.cv_portfolio.service.SkillService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class PersonController {

    private static final Long MY_ID = 1L;
    private final PersonService personService;


    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("/about")
    public String getPersonList(Model model) {
        List<Person> personList = personService.getPeople();
        model.addAttribute("personList", personList);
        return "portfolio/aboutMe";
        // Dlaczego w każdym kontrolerze nie działą mi return String
        // z odniesieniem do plików .jsp?
    }

    @GetMapping("/contact")
    public String getPersonListForContact(Model model) {
        List<Person> peopleForContact = personService.getPeople();
        model.addAttribute("people", peopleForContact);
        return "portfolio/contactMe";
    }
}
