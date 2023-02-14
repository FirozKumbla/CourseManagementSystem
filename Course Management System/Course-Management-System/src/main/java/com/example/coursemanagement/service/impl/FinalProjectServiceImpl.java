package com.example.coursemanagement.service.impl;

import com.example.coursemanagement.entity.FinalProject;
import com.example.coursemanagement.repo.ProjectRepo;
import com.example.coursemanagement.service.FinalProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FinalProjectServiceImpl implements FinalProjectService {


    private final ProjectRepo projectRepo;

    public FinalProjectServiceImpl(ProjectRepo projectRepo) {
        this.projectRepo = projectRepo;
    }

    @Override
    public List<FinalProject> getAllFinalProjects() {
        return projectRepo.findAll();
    }

    @Override
    public Optional<FinalProject> getAllFinalProjectById(Integer id) {
        return projectRepo.findById(id);
    }

    @Override
    public FinalProject saveFinalProject(FinalProject finalProject) {
        return projectRepo.save(finalProject);
    }

    @Override
    public FinalProject updateFinalProject(FinalProject finalProject) {
        return projectRepo.save(finalProject);
    }

    @Override
    public void deleteFinalProject(Integer id) {
        projectRepo.deleteById(id);
    }
}
