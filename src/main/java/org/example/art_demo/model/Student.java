package org.example.art_demo.model;

import java.time.LocalDate;

public class Student {
    private Long id;
    private String fullName;
    private LocalDate dateBorn;
    private String group;

    public Student() {
    }

    public Student(Long id, String fullName, LocalDate dateBorn, String group) {
        this.fullName = fullName;
        this.dateBorn = dateBorn;
        this.group = group;
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public LocalDate getDateBorn() {
        return dateBorn;
    }

    public void setDateBorn(LocalDate dateBorn) {
        this.dateBorn = dateBorn;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }
}
