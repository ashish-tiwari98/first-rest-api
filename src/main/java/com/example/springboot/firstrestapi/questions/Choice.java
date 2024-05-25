package com.example.springboot.firstrestapi.questions;

import jakarta.persistence.*;

@Entity
public class Choice {

    @Id
    private long cid;

    private String cimage;

    // Getters and setters
    public long getCid() {
        return cid;
    }

    public void setCid(long cid) {
        this.cid = cid;
    }

    public String getCimage() {
        return cimage;
    }

    public void setCimage(String cimage) {
        this.cimage = cimage;
    }
}
