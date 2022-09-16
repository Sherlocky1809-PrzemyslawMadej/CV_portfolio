package com.example.cv_portfolio.repository;

import com.example.cv_portfolio.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
