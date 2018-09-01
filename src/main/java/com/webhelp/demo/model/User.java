package com.webhelp.demo.model;









import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="user")
@Getter
@Setter

public class User
{
    @Id
    @GeneratedValue
    Long id;
    String email;
    String name;
    String password;
    Rang rang;

    int poeni;
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("User{");
        sb.append(", Name='").append(name).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append('}');
        return sb.toString();
    }



}
