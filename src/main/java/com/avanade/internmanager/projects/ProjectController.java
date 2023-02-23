package com.avanade.internmanager.projects;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/project")
public class ProjectController {

    private ProjectService service;

    @Autowired
    public ProjectController(ProjectService projectService) {
        this.service = projectService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Project>> GetAllProjects() {

        List<Project> projects = service.GetAllProjects();

        return ResponseEntity.ok(projects);
    }

}
