package com.example.myapp.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setId(int id) {
        this.id = id;

    }

    @Id
    private int id;

    private String name;

    private int age;


}