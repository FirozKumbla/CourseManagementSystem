package com.example.coursemanagement.controller;

import com.example.coursemanagement.entity.Student;
import com.example.coursemanagement.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/student")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @GetMapping("/{id}")
    public Optional<Student> getStudentById(@PathVariable("id") Integer id) {
        return studentService.getAllStudentById(id);
    }

    @PostMapping
    public Student saveStudent(@RequestBody Student student) {
        return studentService.saveStudent(student);
    }

    @PutMapping
    public Student updateStudent(@RequestBody Student student) {
        return studentService.updateStudent(student);
    }


    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable("id") Integer id){
        studentService.deleteStudent(id);
    }
}
