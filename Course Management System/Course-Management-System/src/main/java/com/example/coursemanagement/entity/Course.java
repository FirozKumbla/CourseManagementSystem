package com.example.coursemanagement.entity;

import jakarta.persistence.*;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data
@AllArgsConstructor
@Transactional
@Table(name = "course_table")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "course_id")
    private int courseId;
    private String courseName;
    private String courseDuration;
    private double courseFees;

    public Course() {
    }
}
