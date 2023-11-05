package com.example.springsecurity.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "person")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class Person {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "username")
    private String username;
    @Column(name = "password")
    private String password;
    @Column(name = "email")
    private String email;

}
