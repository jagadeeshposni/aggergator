package com.company.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

@Entity
public class Student {

    @GeneratedValue
    private Long id;

    private String name;

    private String rollnumber;
}
