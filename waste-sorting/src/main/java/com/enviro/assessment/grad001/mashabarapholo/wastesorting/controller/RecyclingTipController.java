package com.enviro.assessment.grad001.mashabarapholo.wastesorting.controller;
import
        com.enviro.assessment.grad001.mashabarapholo.wastesorting.model.RecyclingTip;
import
        com.enviro.assessment.grad001.mashabarapholo.wastesorting.repisotory.RecyclingTipRepository;

import com.enviro.assessment.grad001.mashabarapholo.wastesorting.service.RecyclingTipService;
import
        org.springframework.beans.factory.annotation.Autowired;
import
        org.springframework.http.HttpStatus;
import
        org.springframework.http.ResponseEntity;
import
        org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController // Marks this class as REST API controller
@RequestMapping("/api/recycling-tips") // Base URL for this controller

public class RecyclingTipController {
    @Autowired
    private RecyclingTipService recyclingTipService; //Injects the service layer

    //Handles POST request to create a new recycling tip.
    @PostMapping

    public ResponseEntity<RecyclingTip>createTip(@RequestBody RecyclingTip recyclingTip) {
        RecyclingTip savedTip = recyclingTipService.createTip(recyclingTip);
        return new ResponseEntity<>(savedTip, HttpStatus.CREATED); //Returns 201 Created status
    }

    //Handles GET requests to retrieve all recycling tips.
    @GetMapping
    public ResponseEntity<List<RecyclingTip>> getAllRecyclingTips() {
        List<RecyclingTip> recyclingTips = recyclingTipService.getAllTips();
        return new ResponseEntity<>(recyclingTips, HttpStatus.OK);//Returns 200 OK status.

    }
    @DeleteMapping("/{id}") // Maps HTTP DELETE requests to this method

    public ResponseEntity<Void> deleteTip(@PathVariable Long id) {
        //Call the service layer to delete guideline
        recyclingTipService.deleteTip(id);

        //Return HTTP status 204 NO content if guideline is deleted.

        return  ResponseEntity.noContent().build();
    }

}
