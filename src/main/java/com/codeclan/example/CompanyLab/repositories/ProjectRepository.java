package com.codeclan.example.CompanyLab.repositories;

import com.codeclan.example.CompanyLab.models.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {
}
