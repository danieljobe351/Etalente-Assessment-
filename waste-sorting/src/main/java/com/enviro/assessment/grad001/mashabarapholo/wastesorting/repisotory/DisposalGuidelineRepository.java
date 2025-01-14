package com.enviro.assessment.grad001.mashabarapholo.wastesorting.repisotory;

import
        com.enviro.assessment.grad001.mashabarapholo.wastesorting.model.DisposalGuideline;
import
        org.springframework.data.jpa.repository.JpaRepository;



//This interface provides CRUD operation for DisposalGuideline Entity
public interface DisposalGuidelineRepository extends JpaRepository<DisposalGuideline, Long> {
}
