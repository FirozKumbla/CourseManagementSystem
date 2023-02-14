package com.example.coursemanagement.entity;

import jakarta.persistence.*;
import jakarta.transaction.Transactional;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Transactional
@Table(name = "final_project_table")
public class FinalProject {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "project_id")
    private int projectId;
    private String projectName;
    private String projectDomain;

}
