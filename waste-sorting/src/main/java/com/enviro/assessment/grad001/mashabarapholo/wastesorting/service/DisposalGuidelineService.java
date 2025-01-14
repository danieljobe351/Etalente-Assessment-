package com.enviro.assessment.grad001.mashabarapholo.wastesorting.service;

import
        com.enviro.assessment.grad001.mashabarapholo.wastesorting.model.DisposalGuideline;


import
        com.enviro.assessment.grad001.mashabarapholo.wastesorting.repisotory.DisposalGuidelineRepository;

import
        org.springframework.beans.factory.annotation.Autowired;

import
        org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service


public interface DisposalGuidelineService {DisposalGuideline createGuideline(DisposalGuideline guideline)
    ;
    List<DisposalGuideline> getAllGuidelines();
    void deleteGuideline(Long id);
    }


