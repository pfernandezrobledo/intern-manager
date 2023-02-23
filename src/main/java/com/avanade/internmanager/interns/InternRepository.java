package com.avanade.internmanager.interns;

import java.util.Optional;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface InternRepository extends JpaRepository<Intern, Integer> {
    
    @Query("SELECT i FROM Intern i WHERE i.firstName = :internName")    
    Optional<List<Intern>> findByName(@Param("internName") String name);

}
