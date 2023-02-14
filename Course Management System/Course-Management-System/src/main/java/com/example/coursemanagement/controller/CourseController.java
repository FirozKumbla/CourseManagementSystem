package com.example.coursemanagement.controller;

import com.example.coursemanagement.entity.Course;
import com.example.coursemanagement.service.CourseService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/course")
public class CourseController {

    private final CourseService courseService;

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }


    @GetMapping
    public List<Course> getAllCourses() {
        return courseService.getAllCourses();
    }

    @GetMapping("/{id}")
    public Optional<Course> getCourseById(@PathVariable("id") Integer id) {
        return courseService.getAllCourseById(id);
    }

    @PostMapping
    public Course saveCourse(@RequestBody Course course) {

        return courseService.saveStudent(course);
    }

    @PutMapping
    public Course updateCourse(@RequestBody Course course) {

        return courseService.updateCourse(course);
    }


    @DeleteMapping("/{id}")
    public void deleteCourse(@PathVariable("id") Integer id){
        courseService.deleteCourse(id);
    }
}
