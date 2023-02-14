package com.example.coursemanagement.controller;

import com.example.coursemanagement.entity.FinalProject;
import com.example.coursemanagement.entity.Student;
import com.example.coursemanagement.service.FinalProjectService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/project")
public class ProjectController {

    private final FinalProjectService finalProjectService;

    public ProjectController(FinalProjectService finalProjectService) {
        this.finalProjectService = finalProjectService;
    }


    @GetMapping
    public List<FinalProject> getAllFinalProject() {
        return finalProjectService.getAllFinalProjects();
    }

    @GetMapping("/{id}")
    public Optional<FinalProject> getStudentById(@PathVariable("id") Integer id) {
        return finalProjectService.getAllFinalProjectById(id);
    }

    @PostMapping
    public FinalProject saveFinalProject(@RequestBody FinalProject finalProject) {
        return finalProjectService.saveFinalProject(finalProject);
    }

    @PutMapping
    public FinalProject updateFinalProject(@RequestBody FinalProject finalProject) {
        return finalProjectService.updateFinalProject(finalProject);
    }

    @DeleteMapping("/{id}")
    public void deleteFinalProject(@PathVariable("id") Integer id){
        finalProjectService.deleteFinalProject(id);
    }
}
