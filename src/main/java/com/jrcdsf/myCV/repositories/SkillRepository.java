package com.jrcdsf.myCV.repositories;

import com.jrcdsf.myCV.entities.Skill;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.HashSet;
import java.util.Set;

@Repository
public class SkillRepository {

    private final Set<Skill> repository = new HashSet<>();

    public Set<Skill> getAll(){ return repository; }

    @PostConstruct
    private void initRepository(){

        repository.add(new Skill("Java"));
        repository.add(new Skill("C"));
    }
}
