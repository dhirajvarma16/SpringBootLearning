package com.learnjpahibernateexample.course;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Course {
    @Column(name = "name")
    private String name;
    @Id
    private int id;
    @Column(name = "author")
    private String author;

    public Course() {
    }

    public Course(int id, String name, String author) {
        this.name = name;
        this.id = id;
        this.author = author;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

}
