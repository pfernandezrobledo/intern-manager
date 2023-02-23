package com.avanade.internmanager.interns;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/intern")
public class InternController {

    private InternService service;

    @Autowired
    public InternController(InternService internService) {
        this.service = internService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Intern>> GetAllInterns() {

        List<Intern> interns = service.GetAllInterns();

        return ResponseEntity.ok(interns);

    }


    @GetMapping("/{name}")
    public ResponseEntity<List<Intern>> GetInternsByName(@PathVariable("name") String name) {

        List<Intern> interns = service.GetInternsByName(name);

        return ResponseEntity.ok(interns);

    }
}
