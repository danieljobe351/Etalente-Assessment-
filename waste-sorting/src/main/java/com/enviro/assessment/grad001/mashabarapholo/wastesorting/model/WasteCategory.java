package com.enviro.assessment.grad001.mashabarapholo.wastesorting.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import
        jakarta.validation.constraints.NotBlank;

@Entity

public class WasteCategory {
    @Id //Primary key
    private Long Id;
    @NotBlank(message =" Name is required") // Validation Annotation
    private String name;

    //Constructors
    public WasteCategory() {

    }
    public WasteCategory(Long Id, String name) {
        this.Id = Id;
        this.name = name;
    }
    //Getters and Setters Methods
    public Long getId() {
        return Id;
    }
    public void setId(Long id) {
        this.Id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
