package com.jrcdsf.myCV.repositories;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.jrcdsf.myCV.entities.CV;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.nio.file.Paths;

@Repository
public class CVRepository {

    private CV repository = new CV();
    private final ObjectMapper mapper = new ObjectMapper();


    public CV getCV() throws IOException {
        initRepositoryFromJson();
        return repository;
    }

    @PostConstruct
    private void initRepositoryFromJson() throws IOException {
        repository = mapper.readValue(Paths.get("cv.json").toFile(), CV.class);
    }
}
