package com.example.InternshipsManagementApp.Users;


import com.example.InternshipsManagementApp.Internship.Internship;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Users {
    @Id @GeneratedValue(strategy= GenerationType.AUTO)
    private int userId;
    private String firstName;
    private String LastName;
    private String address;
    private String email;
    private String login;
    private String password;
    private String progress;
    private long cin;
    private long rib;
    private long phoneNumber;
    @ManyToOne
    private Internship internship;

}
