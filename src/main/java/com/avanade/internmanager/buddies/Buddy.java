package com.avanade.internmanager.buddies;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "buddy")
public class Buddy {
    
    @Getter @Setter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Getter @Setter
    private String firstName;

    @Getter @Setter
    private String lastName;

    @Getter @Setter
    private String email;

    @Getter @Setter
    private LocalDate dateOfBirth;

    @Getter @Setter
    private String university;

    @Getter @Setter
    private String fieldOfStudy;

    @Getter @Setter
    private String talentCommunity;

    @Getter @Setter
    private String title;

    public Buddy(Integer id, String firstName, String lastName, String email, LocalDate dateOfBirth, String university,
            String fieldOfStudy, String talentCommunity, String title) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
        this.university = university;
        this.fieldOfStudy = fieldOfStudy;
        this.talentCommunity = talentCommunity;
        this.title = title;
    }

    public Buddy(String firstName, String lastName, String email, LocalDate dateOfBirth, String university,
            String fieldOfStudy, String talentCommunity, String title) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
        this.university = university;
        this.fieldOfStudy = fieldOfStudy;
        this.talentCommunity = talentCommunity;
        this.title = title;
    }

    public Buddy() {
    }


}
