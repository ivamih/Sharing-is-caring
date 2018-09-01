package com.webhelp.demo.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Tag {
    @Id
    String name;

    @ManyToMany(mappedBy = "tags")
    public List<HelpRequest> helpRequestst;


    public Tag(String name) {
        this.name = name;
    }

}
