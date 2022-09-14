package com.jrcdsf.myCV.repositories;

import com.jrcdsf.myCV.entities.CV;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;

@Repository
public class CVRepository {

    private final CV repository = new CV();

    private final EducationRepository educationRepository;
    private final LanguageRepository languageRepository;
    private final SkillRepository skillRepository;
    private final WorkHistoryRepository workHistoryRepository;

    public CVRepository(EducationRepository educationRepository, LanguageRepository languageRepository, SkillRepository skillRepository, WorkHistoryRepository workHistoryRepository) {
        this.educationRepository = educationRepository;
        this.languageRepository = languageRepository;
        this.skillRepository = skillRepository;
        this.workHistoryRepository = workHistoryRepository;
    }

    public CV getCV() {
        return repository;
    }

    @PostConstruct
    private void initRepository(){
        repository.setName("Jose Roberto");
        repository.setSurname("Costa da Silva Filho");
        repository.setFullName("Jose Roberto Costa da Silva Filho");
        repository.setEmail("jrcdsf@gmail.com");
        repository.setMobile("+55 19 99939-2870");
        repository.setEducationHistory(educationRepository.getAll());
        repository.setLanguages(languageRepository.getAll());
        repository.setSkills(skillRepository.getAll());
        repository.setWorkHistory(workHistoryRepository.getAll());
    }
}
