package com.enviro.assessment.grad001.mashabarapholo.wastesorting.repisotory;

import
        com.enviro.assessment.grad001.mashabarapholo.wastesorting.model.WasteCategory;
import
        org.springframework.data.jpa.repository.JpaRepository;

public interface WasteCategoryRepository extends JpaRepository<WasteCategory, Long>{

} // For methods like findbyId(), findAll(), and deleteById()

