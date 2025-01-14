package com.enviro.assessment.grad001.mashabarapholo.wastesorting.controller;

import
        com.enviro.assessment.grad001.mashabarapholo.wastesorting.model.DisposalGuideline;
import
        com.enviro.assessment.grad001.mashabarapholo.wastesorting.repisotory.DisposalGuidelineRepository;
import com.enviro.assessment.grad001.mashabarapholo.wastesorting.service.DisposalGuidelineService;
import
        org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController //Marks this class as a REST API controller
@RequestMapping("/api/disposal-guidelines")  //Base URL for this controller


public class DisposalGuidelineController {
    @Autowired
    private DisposalGuidelineService disposalGuidelineService; //Injects the service layer

    //Handles POST requests to create a new disposal guidelin

    @PostMapping
    public ResponseEntity<DisposalGuideline> create(@RequestBody DisposalGuideline disposalGuideline) {
        DisposalGuideline saved = disposalGuidelineService.createGuideline(disposalGuideline);
        return new ResponseEntity<>(saved, HttpStatus.CREATED); //returns 201 created status
    }
 //Handles GET requests to retrieve all disposal guidelines
    @GetMapping
    public ResponseEntity<List<DisposalGuideline>> getGuidelines() {
        List<DisposalGuideline> disposalGuidelines = disposalGuidelineService.getAllGuidelines();
        return new ResponseEntity<>(disposalGuidelines, HttpStatus.OK); //returns 200 OK status
    }
    @DeleteMapping("/{id}") //Maps HTTP DELETE requests to this method.
    public ResponseEntity<Void> deleteGuideline(@PathVariable Long id) {
        //Call the service layer to delete the guideline.
        disposalGuidelineService.deleteGuideline(id);

        //Http status 204 NO content if the guideline is deleted.
        return  ResponseEntity.noContent().build();
    }

}
