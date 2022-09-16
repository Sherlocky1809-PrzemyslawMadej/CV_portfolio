package com.example.cv_portfolio.service;

import com.example.cv_portfolio.model.Client;
import com.example.cv_portfolio.model.Skill;
import com.example.cv_portfolio.repository.SkillRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SkillService {

    private SkillRepository skillRepository;

    public SkillService(SkillRepository skillRepository) {
        this.skillRepository = skillRepository;
    }



    public void addSkill(Skill skill) {
        skillRepository.save(skill);
    }

    public List<Skill> getSkills() {
        return skillRepository.findAll();
    }

    public Skill getSkill(Long id) {
        return skillRepository.findById(id).orElse(null);
    }

    public void editSkill(Skill newSkill) {
        skillRepository.save(newSkill);
    }

    public void deleteSkillById(Long id) {
        skillRepository.deleteById(id);
    }
}
