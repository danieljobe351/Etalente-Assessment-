package com.enviro.assessment.grad001.mashabarapholo.wastesorting.model;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;// For valldation.
// Thia marks to a table in the database.
@Entity

public class RecyclingTip {
    //Primary key for the table, with auto-incremented values.
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotBlank(message = "Recycling tip is required")
    private String recyclingTip;

    //Setters and Getters for accessing and modifying the tips properties.


    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getRecyclingTip() {
        return recyclingTip;
    }
    public void setRecyclingTip(String recyclingTip) {
        this.recyclingTip = recyclingTip;
    }

}
