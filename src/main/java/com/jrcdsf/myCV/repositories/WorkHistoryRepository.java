package com.jrcdsf.myCV.repositories;

import com.jrcdsf.myCV.entities.WorkHistory;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.HashSet;
import java.util.Set;

@Repository
public class WorkHistoryRepository {

    private final Set<WorkHistory> repository = new HashSet<>();

    public Set<WorkHistory> getAll() { return repository; }

    @PostConstruct
    private void initRepository(){
        repository.add(new WorkHistory("ezyCollect",
                "", "Australia",
                "18-April-2022",
                "current",
                "Refactored MYOB Advanced integration service from Spring Camel to Spring Cloud AWS and Clean Architecture - increasing scalability and testability",
                "Senior Software Engineer"));
    }
}
