package com.enviro.assessment.grad001.mashabarapholo.wastesorting.service;

import
        com.enviro.assessment.grad001.mashabarapholo.wastesorting.repisotory.RecyclingTipRepository;
import
        com.enviro.assessment.grad001.mashabarapholo.wastesorting.model.RecyclingTip;
import
        org.springframework.stereotype.Service;
import
        org.springframework.beans.factory.annotation.Autowired;
import jakarta.validation.Valid;
import java.util.List;
import java.util.Optional;

import java.util.List;

public interface RecyclingTipService{RecyclingTip createTip(RecyclingTip tip);
List<RecyclingTip> getAllTips();
void deleteTip(Long id);
}
