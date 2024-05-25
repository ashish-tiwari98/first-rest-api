package com.example.springboot.firstrestapi.questions.springdatajpa;

import com.example.springboot.firstrestapi.questions.Choice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChoiceRepository extends JpaRepository<Choice, Long> {
}
