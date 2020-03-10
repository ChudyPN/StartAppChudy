package com.chudy.spring.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@Table(name ="USERS")
@NamedQuery(name = User.GET_USERS, query = User.GET_USERS)
public class User implements Serializable {

    public static final String GET_USERS ="SELECT id, email, firstName, lastName FROM USERS";

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "firstName")
    private String firstName;

    @Column(name = "lastName")
    private String lastName;

    @Column(name = "email")
    private String email;

}
