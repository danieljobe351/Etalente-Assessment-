package com.enviro.assessment.grad001.mashabarapholo.wastesorting.implement;

import
        com.enviro.assessment.grad001.mashabarapholo.wastesorting.model.DisposalGuideline;
import
        com.enviro.assessment.grad001.mashabarapholo.wastesorting.repisotory.DisposalGuidelineRepository;
import com.enviro.assessment.grad001.mashabarapholo.wastesorting.service.DisposalGuidelineService;
import
        org.springframework.beans.factory.annotation.Autowired;
import
        org.springframework.stereotype.Service;
import java.util.List;

//Marks this as a service, part of the business logic layer.

@Service
public class DisposalGuidelineServiceImpl implements DisposalGuidelineService {
    //Injects the repository for accessing the database.

    //Saves a new disposal guideline to the database.
    @Autowired
    private DisposalGuidelineRepository repo;

    @Override
    public DisposalGuideline createGuideline(DisposalGuideline disposalGuideline) {
        return repo.save(disposalGuideline);

    }

    // Retrieves all disposal guidelines from the database
    @Override
    public List<DisposalGuideline>getAllGuidelines()
    {
        return repo.findAll();
    }
    @Override
    public void deleteGuideline(Long id) {
        //Check if guide exists
        if (!repo.existsById(id)) {
            throw new IllegalArgumentException("Disposal guideline with given id: " + id + " does not exist.");

        }
        repo.deleteById(id);
    }

}
