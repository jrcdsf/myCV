package com.jrcdsf.myCV.repositories;

import com.jrcdsf.myCV.entities.Education;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.HashSet;
import java.util.Set;

@Repository
public class EducationRepository {

    private final Set<Education> repository = new HashSet<>();

    public Set<Education> getAll() { return repository; }


    @PostConstruct
    private void initRepository(){
        repository.add(new Education("Bachelor of Engineering", "UNICAMP", "1994", "1998"));

    }
}
