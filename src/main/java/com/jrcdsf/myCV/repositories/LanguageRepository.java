package com.jrcdsf.myCV.repositories;

import com.jrcdsf.myCV.entities.Language;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.HashSet;
import java.util.Set;

@Repository
public class LanguageRepository {

    private final Set<Language> repository = new HashSet<>();

    public Set<Language> getAll() { return repository; }

    @PostConstruct
    private void initRepository(){
        repository.add(new Language("Portuguese", "native"));
        repository.add(new Language("English", "fluent"));
        repository.add(new Language("Spanish", "intermediate"));
        repository.add(new Language("French", "basic"));
    }
}
