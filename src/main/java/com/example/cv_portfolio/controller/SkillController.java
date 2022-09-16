package com.example.cv_portfolio.controller;

import com.example.cv_portfolio.model.Skill;
import com.example.cv_portfolio.service.SkillService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class SkillController {

    private SkillService skillService;

    public SkillController(SkillService skillService) {
        this.skillService = skillService;
    }

    @GetMapping("/about")
    public String getSkills(Model model) {
        List<Skill> skills = skillService.getSkills();
        model.addAttribute("skills", skills);
        return "/portfolio/aboutMe";
    }
}
