package com.webhelp.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="categories")
public class Category {
    @Id
    @GeneratedValue
    Long id;

    String name;

}
