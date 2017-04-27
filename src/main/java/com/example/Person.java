package com.example;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by vladimir on 06.04.17.
 */
@Data
@Entity
public class Person {
    @Id
    @GeneratedValue
    private long id;
    private String firstName;
    private String lastName;
}
