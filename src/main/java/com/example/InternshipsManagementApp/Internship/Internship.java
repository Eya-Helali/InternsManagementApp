package com.example.InternshipsManagementApp.Internship;

import com.example.InternshipsManagementApp.Users.Users;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Internship {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int internshipId;
    private String name;
    private String beginDate;
    private String endDate;
    private Domain domain;
    @OneToMany(mappedBy = "internship")
    private List<Users> users;

}
