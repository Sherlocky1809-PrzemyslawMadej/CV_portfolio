package com.example.cv_portfolio.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Language {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 30)
    private String languageName;

    @Column(length = 3)
    private String languageLevel;

    @ManyToMany(mappedBy = "languages")
    private List<Person> peopleWithLanguages;

    public Language() {
    }

    public Language(Long id, String languageName, String languageLevel, List<Person> peopleWithLanguages) {
        this.id = id;
        this.languageName = languageName;
        this.languageLevel = languageLevel;
        this.peopleWithLanguages = peopleWithLanguages;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLanguageName() {
        return languageName;
    }

    public void setLanguageName(String languageName) {
        this.languageName = languageName;
    }

    public String getLanguageLevel() {
        return languageLevel;
    }

    public void setLanguageLevel(String languageLevel) {
        this.languageLevel = languageLevel;
    }

    public List<Person> getPeopleWithLanguages() {
        return peopleWithLanguages;
    }

    public void setPeopleWithLanguages(List<Person> peopleWithLanguages) {
        this.peopleWithLanguages = peopleWithLanguages;
    }
}
