package com.jrcdsf.myCV.services;

import com.jrcdsf.myCV.entities.CV;
import com.jrcdsf.myCV.repositories.CVRepository;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class CVService {

    private final CVRepository cvRepository;

    public CVService(CVRepository cvRepository) {
        this.cvRepository = cvRepository;
    }

    public CV getCV() throws IOException {
        return cvRepository.getCV();
    }
}
