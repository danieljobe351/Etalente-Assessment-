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

@RestController
@RequestMapping("/api/waste-categories")


public class WasteCategoryController {
@Autowired
    private WasteCategoryService service;
@GetMapping
    public List<WasteCategory>getAllWastecategories()
{
    return service.getAllWasteCategories();
}
@GetMapping("/{id}")
    public ResponseEntity <WasteCategory> getWasteById(@PathVariable Long id)
{
    Optional<WasteCategory>category = service.getWasteByID(id);
    return category.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.status(HttpStatus.NOT_FOUND).build());
}
@PostMapping
    public ResponseEntity<WasteCategory>createCategory(@Valid @RequestBody WasteCategory category){
    WasteCategory createdCategory = service.createWasteCategory(category);
    return
            ResponseEntity.status(HttpStatus.CREATED).body(createdCategory);
}
@DeleteMapping("/{id}")
    public ResponseEntity<Void>deleteWasteCategory(@PathVariable Long id)
{
    service.deleteWasteCategory(id);
    return
            ResponseEntity.status(HttpStatus.NO_CONTENT).build();
}
}
