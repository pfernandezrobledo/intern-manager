package com.avanade.internmanager.projects;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService {

    private ProjectRepository repository;

    @Autowired
    public ProjectService(ProjectRepository projectRepository) {
        this.repository = projectRepository;
    }

    public List<Project> GetAllProjects() {

        /*
         * List.of(
         * new Project("project 1", LocalDate.parse("2023-02-27"),
         * LocalDate.parse("2024-02-28"),
         * "project 1 description", 15, 1),
         * new Project("project 2", LocalDate.parse("2023-02-27"),
         * LocalDate.parse("2024-02-28"),
         * "project 3 description", 15, 2),
         * new Project("project 3", LocalDate.parse("2023-02-27"),
         * LocalDate.parse("2024-02-28"),
         * "project 3 description", 15, 3));
         */

        List<Project> projects = repository.findAll();

        return projects;

    }

}
