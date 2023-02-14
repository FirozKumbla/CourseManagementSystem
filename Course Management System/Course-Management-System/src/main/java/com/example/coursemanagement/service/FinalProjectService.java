package com.example.coursemanagement.service;

import com.example.coursemanagement.entity.FinalProject;
import com.example.coursemanagement.entity.Student;

import java.util.List;
import java.util.Optional;

public interface FinalProjectService {
    List<FinalProject> getAllFinalProjects();
    Optional<FinalProject> getAllFinalProjectById(Integer id);
    FinalProject saveFinalProject(FinalProject finalProject);

    FinalProject updateFinalProject(FinalProject finalProject);
    void deleteFinalProject(Integer id);
}
