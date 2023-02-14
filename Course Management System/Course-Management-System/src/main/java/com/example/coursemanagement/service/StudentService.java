package com.example.coursemanagement.service;


import com.example.coursemanagement.entity.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {
    List<Student> getAllStudents();
    Optional<Student> getAllStudentById(Integer id);
    Student saveStudent(Student student);

    Student updateStudent(Student student);
    void deleteStudent(Integer id);

}
