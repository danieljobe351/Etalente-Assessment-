package com.enviro.assessment.grad001.mashabarapholo.wastesorting.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import
        jakarta.validation.constraints.NotBlank;

@Entity

public class WasteCategory {
    @Id //Primary key
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotBlank(message =" Name is required") // Validation Annotation
    private String name;

    //Constructors
    public WasteCategory() {

    }
    public WasteCategory(Long Id, String name) {
        this.id = Id;
        this.name = name;
    }
    //Getters and Setters Methods
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
