package com.example.coursemanagement.service.impl;


import com.example.coursemanagement.entity.Student;
import com.example.coursemanagement.repo.StudentRepo;
import com.example.coursemanagement.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {


    private final  StudentRepo studentRepo;

    public StudentServiceImpl(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }

    @Override
    public List<Student> getAllStudents() {
        return  studentRepo.findAll();
    }

    @Override
    public Optional<Student> getAllStudentById(Integer id) {
        return studentRepo.findById(id);
    }

    @Override
    public Student saveStudent(Student student) {
        return studentRepo.save(student);
    }

    @Override
    public Student updateStudent(Student student) {
        return studentRepo.save(student);
    }

    @Override
    public void deleteStudent(Integer id) {
        studentRepo.deleteById(id);
    }
}
