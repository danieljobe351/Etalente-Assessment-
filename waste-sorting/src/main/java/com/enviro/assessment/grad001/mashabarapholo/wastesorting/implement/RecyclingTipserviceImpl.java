package com.enviro.assessment.grad001.mashabarapholo.wastesorting.implement;
import
        com.enviro.assessment.grad001.mashabarapholo.wastesorting.model.RecyclingTip;
import
        com.enviro.assessment.grad001.mashabarapholo.wastesorting.repisotory.RecyclingTipRepository;
import com.enviro.assessment.grad001.mashabarapholo.wastesorting.service.RecyclingTipService;
import
        org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service


public class RecyclingTipserviceImpl implements RecyclingTipService {
    //injects the repository for accessing the database
    @Autowired
    private RecyclingTipRepository recyclingTipRepository;

    @Override
    public RecyclingTip createTip(RecyclingTip recyclingTip) {
        return recyclingTipRepository.save(recyclingTip);
    }
    @Override
    public List<RecyclingTip> getAllTips() {
        return recyclingTipRepository.findAll();


    }
    @Override
    public void deleteTip(Long id) {
        recyclingTipRepository.deleteById(id);
    }
}
