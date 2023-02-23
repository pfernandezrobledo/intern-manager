package com.avanade.internmanager.interns;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InternService {

    private InternRepository repository;

    @Autowired
    public InternService(InternRepository internRepository) {
        this.repository = internRepository;
    }

    public List<Intern> GetAllInterns() {

        List<Intern> interns = repository.findAll();

        return interns;

    }

    public List<Intern> GetInternsByName(String name) {

        Optional<List<Intern>> interns = repository.findByName(name);

        return interns.isPresent() ? interns.get() : List.of();

        /*
         var sample = repository
                .findByName(name)
                .orElseThrow(
                        () -> new IllegalStateException(String.format("Sample with name '%s' does not exist.", name)));

        return sample;
         * 
         * 
         */

    }
    
}
