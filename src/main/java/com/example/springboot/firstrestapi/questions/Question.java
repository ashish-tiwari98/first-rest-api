package com.example.springboot.firstrestapi.questions;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Question {

    @Id
    private String qid;

    private String qimage;

    private int q_type;

    private int q_medium;

    private String q_hint;

    private int no_of_choices;

    private long correct_choice;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "question_id")
    private List<Choice> q_choices;

    // Getters and setters
    public String getQid() {
        return qid;
    }

    public void setQid(String qid) {
        this.qid = qid;
    }

    public String getQimage() {
        return qimage;
    }

    public void setQimage(String qimage) {
        this.qimage = qimage;
    }

    public int getQ_type() {
        return q_type;
    }

    public void setQ_type(int q_type) {
        this.q_type = q_type;
    }

    public int getQ_medium() {
        return q_medium;
    }

    public void setQ_medium(int q_medium) {
        this.q_medium = q_medium;
    }

    public String getQ_hint() {
        return q_hint;
    }

    public void setQ_hint(String q_hint) {
        this.q_hint = q_hint;
    }

    public int getNo_of_choices() {
        return no_of_choices;
    }

    public void setNo_of_choices(int no_of_choices) {
        this.no_of_choices = no_of_choices;
    }

    public long getCorrect_choice() {
        return correct_choice;
    }

    public void setCorrect_choice(long correct_choice) {
        this.correct_choice = correct_choice;
    }

    public List<Choice> getQ_choices() {
        return q_choices;
    }

    public void setQ_choices(List<Choice> q_choices) {
        this.q_choices = q_choices;
    }
}
