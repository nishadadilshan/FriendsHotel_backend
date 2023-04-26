package com.resturantapi.resturantapi.entity;

import javax.persistence.*;
import java.util.Date;

@Table(name = "Customer")
@Entity
public class Customer {
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String name;

    private String email;

//    private String address;

//    private Date createdAt;



}
