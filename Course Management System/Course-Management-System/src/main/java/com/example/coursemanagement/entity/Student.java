package com.example.coursemanagement.entity;

import jakarta.persistence.*;
import jakarta.transaction.Transactional;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@Transactional
@Table(name = "student_table")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "std_id")
    private int stdId;
    private String stdName;

    private String stdAddress;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_project_id")
    private FinalProject finalProject;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_std_id", referencedColumnName = "std_id")
    private List<Course> course;

}
