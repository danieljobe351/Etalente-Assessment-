package com.enviro.assessment.grad001.mashabarapholo.wastesorting.service;

import
        com.enviro.assessment.grad001.mashabarapholo.wastesorting.model.WasteCategory;
import
        com.enviro.assessment.grad001.mashabarapholo.wastesorting.repisotory.WasteCategoryRepository;
import
        org.springframework.beans.factory.annotation.Autowired;
import
        org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
@Service


public class WasteCategoryService {
    @Autowired
    private WasteCategoryRepository repository;
    //Fetch all waste categories
    public List<WasteCategory>getAllWasteCategories()
    {
        return repository.findAll();

    }

    //Fetch a single waste an ID
    public Optional<WasteCategory>getWasteByID(Long id)
    {
        return repository.findById(id);
    }
    //Create or update a waste category
    public WasteCategory createWasteCategory(WasteCategory category)
    {
        return repository.save(category);
    }
    //Delete a waste category by ID
    public void deleteWasteCategory(long id)
    {
        repository.deleteById(id);
    }
}
