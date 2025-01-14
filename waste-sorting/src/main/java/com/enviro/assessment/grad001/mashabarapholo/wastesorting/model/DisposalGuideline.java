package com.enviro.assessment.grad001.mashabarapholo.wastesorting.model;
import jakarta.persistence.*;
import
        jakarta.validation.constraints.NotBlank;
// Marks this class as aJPA entity, meaning it maps to a table in the database.

@Entity


public class DisposalGuideline {
    //Primary key for the database tabke, with auto-incremented values
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    //Ensures the category name is not null or blank
    @NotBlank(message = "Category name is required")
    private String catName;

    //Ensure the guideline description is not null or blank.
    @NotBlank(message = "Guideline is required!")
    private String guidelineName;

    //Setters and Getters for accessing and modifying the properties.

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getCatName() {
        return catName;
    }
    public void setCatName(String catName) {
        this.catName = catName;
    }
    public String getGuidelineName() {
        return guidelineName;
    }
    public void setGuidelineName(String guidelineName) {
        this.guidelineName = guidelineName;
    }

}
