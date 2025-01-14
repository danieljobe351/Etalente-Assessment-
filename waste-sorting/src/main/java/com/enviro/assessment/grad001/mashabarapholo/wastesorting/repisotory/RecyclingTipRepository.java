package com.enviro.assessment.grad001.mashabarapholo.wastesorting.repisotory;
import com.enviro.assessment.grad001.mashabarapholo.wastesorting.model.RecyclingTip;
import org.springframework.data.jpa.repository.JpaRepository;

//This interface provides CRUD operations for RecyclingTip Entuty.

public interface RecyclingTipRepository extends JpaRepository<RecyclingTip, Long> {
}
