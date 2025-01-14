//This controller handles http request and maps them to the service layer
package com.enviro.assessment.grad001.mashabarapholo.wastesorting.controller;
import
        com.enviro.assessment.grad001.mashabarapholo.wastesorting.model.WasteCategory;
import
        com.enviro.assessment.grad001.mashabarapholo.wastesorting.service.WasteCategoryService;
import
        org.springframework.beans.factory.annotation.Autowired;
import
        org.springframework.http.HttpStatus;
import
        org.springframework.http.ResponseEntity;
import
        org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController //Marks this class a REST API controller
@RequestMapping("/api/waste-categories") // Base URL for this controller.


public class WasteCategoryController {
@Autowired
    private WasteCategoryService service;//Injects the service layer

    //Handles GET requests to retrieve categories from the database
@GetMapping
    public List<WasteCategory>getAllWastecategories()
{
    return service.getAllWasteCategories();
}

 //Handles GET requests to retrieve categories by id
@GetMapping("/{id}")
    public ResponseEntity <WasteCategory> getWasteById(@PathVariable Long id)
{
    Optional<WasteCategory>category = service.getWasteByID(id);
    return category.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.status(HttpStatus.NOT_FOUND).build());
}
// Handless POST to create a category to the database.
@PostMapping
    public ResponseEntity<WasteCategory>createCategory(@Valid @RequestBody WasteCategory category){
    WasteCategory createdCategory = service.createWasteCategory(category);
    return
            ResponseEntity.status(HttpStatus.CREATED).body(createdCategory);
}
// Handles DELETE requests to delete a category from the database.
@DeleteMapping("/{id}")
    public ResponseEntity<Void>deleteWasteCategory(@PathVariable Long id)
{
    service.deleteWasteCategory(id);
    return
            ResponseEntity.status(HttpStatus.NO_CONTENT).build();
}
}
