package com.chudy.spring.model;

import javax.persistence.*;

@Entity
@Table(name ="USER")
public class User {
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

    public int getId() {
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmai() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;

    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", first name=" + firstName + ", last name='" + lastName + '\'' + ", email=" + email +'}';
    }
}
