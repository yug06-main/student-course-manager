package com.example.sms.entity;

import jakarta.persistence.*;

import javax.annotation.processing.Generated;
import javax.print.DocFlavor;

@Entity
@Table(name = "students")

public class Student{
  @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
  @Column(nullable = false)
    private String name;

  @Column(nullable = false,unique = true)
    private String email;

  private boolean deleted = false;
  public Student(){ }   // JPA needs an empty constructor

    public Student(String name, String email) {
      this.name = name;
      this.email = email;
    }
    public Long getId() { return id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public boolean isDeleted() { return deleted; }
    public void setDeleted(boolean deleted) { this.deleted = deleted; }
}
