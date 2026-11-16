package com.example.sms.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import javax.annotation.processing.Generated;

@Entity
@Table(name = "students")
@Id
public class Student{

    @Generated(strategy = GenerationType.IDENTITY)
}
