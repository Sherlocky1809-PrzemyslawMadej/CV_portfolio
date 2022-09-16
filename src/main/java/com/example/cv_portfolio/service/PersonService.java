package com.example.cv_portfolio.service;

import com.example.cv_portfolio.model.Client;
import com.example.cv_portfolio.model.Person;
import com.example.cv_portfolio.repository.PersonRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    private PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }



    public void addPerson(Person person) {
        personRepository.save(person);
    }

    public List<Person> getPeople() {
        return personRepository.findAll();
    }

    public Person getPerson(Long id) {
        return personRepository.findById(id).orElse(null);
    }

    public void editPerson(Person newPerson) {
        personRepository.save(newPerson);
    }

    public void deletePersonById(Long id) {
        personRepository.deleteById(id);
    }
}
