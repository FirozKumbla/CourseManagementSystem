package com.example.coursemanagement.service.impl;

import com.example.coursemanagement.entity.Course;
import com.example.coursemanagement.repo.CourseRepo;
import com.example.coursemanagement.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseServiceImpl implements CourseService {


    private final CourseRepo courseRepo;

    public CourseServiceImpl(CourseRepo courseRepo) {
        this.courseRepo = courseRepo;
    }

    @Override
    public List<Course> getAllCourses() {
        return courseRepo.findAll();
    }

    @Override
    public Optional<Course> getAllCourseById(Integer id) {
        return courseRepo.findById(id);
    }

    @Override
    public Course saveStudent(Course course) {
        return courseRepo.save(course);
    }

    @Override
    public Course updateCourse(Course course) {
        return courseRepo.save(course);
    }

    @Override
    public void deleteCourse(Integer id) {
        courseRepo.deleteById(id);
    }
}
