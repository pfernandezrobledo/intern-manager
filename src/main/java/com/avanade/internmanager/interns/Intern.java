package com.avanade.internmanager.interns;

import java.time.LocalDate;

import com.avanade.internmanager.buddies.Buddy;
import com.avanade.internmanager.projects.Project;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "intern")
public class Intern {

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
    private LocalDate startDate;

    @Getter
    @Setter
    private LocalDate endDate;

    @Getter
    @Setter
    private String university;

    @Getter
    @Setter
    private String fieldOfStudy;

    @Getter
    @Setter
    private String talentCommunity;

    @Getter
    @Setter
    private String title;

    @Getter
    @Setter
    @JsonManagedReference
    @ManyToOne
    @JoinColumn(name = "project_id")
    private Project project;

    // private Object skill;

    @Getter
    @Setter   
    @OneToOne
    @JoinColumn(name = "buddy_id")
    private Buddy buddy;

    public Intern(Integer id, String firstName, String lastName, String email, LocalDate dateOfBirth,
            LocalDate startDate, LocalDate endDate, String university, String fieldOfStudy, String talentCommunity,
            String title, Project project) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
        this.startDate = startDate;
        this.endDate = endDate;
        this.university = university;
        this.fieldOfStudy = fieldOfStudy;
        this.talentCommunity = talentCommunity;
        this.title = title;
        this.project = project;
    }

    public Intern(String firstName, String lastName, String email, LocalDate dateOfBirth, LocalDate startDate,
            LocalDate endDate, String university, String fieldOfStudy, String talentCommunity, String title,
            Project project) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
        this.startDate = startDate;
        this.endDate = endDate;
        this.university = university;
        this.fieldOfStudy = fieldOfStudy;
        this.talentCommunity = talentCommunity;
        this.title = title;
        this.project = project;
    }

    public Intern() {
    }

}
