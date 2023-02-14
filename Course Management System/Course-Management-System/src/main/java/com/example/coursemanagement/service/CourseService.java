package com.example.coursemanagement.service;

import com.example.coursemanagement.entity.Course;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


public interface CourseService {
    List<Course> getAllCourses();
    Optional<Course> getAllCourseById(Integer id);
    Course saveStudent(Course course);

    Course updateCourse(Course course);
    void deleteCourse(Integer id);
}
