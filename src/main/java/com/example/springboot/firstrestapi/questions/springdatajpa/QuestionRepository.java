package com.example.springboot.firstrestapi.questions.springdatajpa;

import com.example.springboot.firstrestapi.questions.Choice;
import com.example.springboot.firstrestapi.questions.Question;
import org.springframework.data.jpa.repository.JpaRepository;


public interface QuestionRepository extends JpaRepository<Question, String> {
}


