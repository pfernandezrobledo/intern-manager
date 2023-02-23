package com.avanade.internmanager.projects;

import java.time.LocalDate;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "project_manager")
public class ProjectManager {

    @Getter
    @Setter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Getter
    @Setter
    private String firstName;

    @Getter
    @Setter
    private String lastName;

    @Getter
    @Setter
    private String email;

    @Getter
    @Setter
    private LocalDate dateOfBirth;

    @Getter
    @Setter
    private String talentCommunity;

    @Getter
    @Setter
    @JsonBackReference
    @OneToMany(mappedBy = "projectManager", cascade = CascadeType.PERSIST)
    private List<Project> projects;

    public ProjectManager(Integer id, String firstName, String lastName, String email, LocalDate dateOfBirth,
            String talentCommunity) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
        this.talentCommunity = talentCommunity;
    }

    public ProjectManager(String firstName, String lastName, String email, LocalDate dateOfBirth,
            String talentCommunity) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
        this.talentCommunity = talentCommunity;
    }

    public ProjectManager() {
    }

}

/*
 * id INT PRIMARY KEY,
 * first_name VARCHAR (50) NOT NULL,
 * last_name VARCHAR (50) NOT NULL,
 * email VARCHAR (100) NOT NULL,
 * date_of_birth DATE NOT NULL,
 * talent_community VARCHAR (255) NULL
 */
