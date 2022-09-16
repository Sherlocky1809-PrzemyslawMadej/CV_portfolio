package com.example.cv_portfolio.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.Pattern;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Entity
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthDate;

    @Column(length = 100)
    private String gitHub;

    @Column(length = 100)
    private String instagram;

    @Column(length = 100)
    private String facebook;

    @Column(length = 30)
    private String phone;

    @Column(length = 3)
    private Integer age;

    @Column(length = 30)
    private String city;

    @Column(length = 30)
    private String country;

    @Column(length = 30)
    private String degree;

//    @Pattern(regexp = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\\\.[A-Z]{2,6}$")
    @Column(length = 50)
    private String email;

    private Boolean freelance;

    @ManyToMany
    @JoinTable(name = "person_language",
    joinColumns = @JoinColumn(name = "person_id"),
    inverseJoinColumns = @JoinColumn(name = "language_id"))
    private List<Language> languages;

    @ManyToMany
    @JoinTable(name = "person_skill",
    joinColumns = @JoinColumn(name = "person_id"),
    inverseJoinColumns = @JoinColumn(name = "skill_id"))
    private List<Skill> skills;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.REFRESH, mappedBy = "person")
    private List<Client> siteViewers;

    public Person() {
    }

    public Person(Long id, Date birthDate, String gitHub, String instagram, String facebook, String phone,
                  Integer age, String city, String country, String degree, String email, Boolean freelance,
                  List<Language> languages, List<Skill> skills, List<Client> siteViewers) {
        this.id = id;
        this.birthDate = birthDate;
        this.gitHub = gitHub;
        this.instagram = instagram;
        this.facebook = facebook;
        this.phone = phone;
        this.age = age;
        this.city = city;
        this.country = country;
        this.degree = degree;
        this.email = email;
        this.freelance = freelance;
        this.languages = languages;
        this.skills = skills;
        this.siteViewers = siteViewers;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getGitHub() {
        return gitHub;
    }

    public void setGitHub(String gitHub) {
        this.gitHub = gitHub;
    }

    public String getInstagram() {
        return instagram;
    }

    public void setInstagram(String instagram) {
        this.instagram = instagram;
    }

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getFreelance() {
        return freelance;
    }

    public void setFreelance(Boolean freelance) {
        this.freelance = freelance;
    }

    public List<Language> getLanguages() {
        return languages;
    }

    public void setLanguages(List<Language> languages) {
        this.languages = languages;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }

    public List<Client> getSiteViewers() {
        return siteViewers;
    }

    public void setSiteViewers(List<Client> siteViewers) {
        this.siteViewers = siteViewers;
    }
}
