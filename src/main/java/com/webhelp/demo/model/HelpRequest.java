package com.webhelp.demo.model;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="help_requests")
public class HelpRequest {
    @Id
    @GeneratedValue
    Long id;

    @ManyToOne
    @JoinColumn(name = "my_category_id")
    public Category category;

    @ManyToOne
    @JoinColumn(name="my_requestuser_id")
    User requestUser;

    @ManyToMany
    @JoinTable(name="join_users")
    List<User> answerUsers= new ArrayList<>();

    @ManyToMany
    @JoinTable(name = "join_tags")
    List<Tag> tags= new ArrayList<>();
    boolean IsAnswered;

}
