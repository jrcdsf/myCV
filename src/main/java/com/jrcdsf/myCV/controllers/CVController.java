package com.jrcdsf.myCV.controllers;

import com.jrcdsf.myCV.entities.CV;
import com.jrcdsf.myCV.services.CVService;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

@Controller
public class CVController {

    private final CVService cvService;


    public CVController(CVService cvService) {
        this.cvService = cvService;
    }

    @SchemaMapping(typeName = "Query", value = "cv")
    public CV getCV(){
        return cvService.getCV();
    }
}
