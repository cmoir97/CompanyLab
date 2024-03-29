package com.codeclan.example.CompanyLab.repositories;

import com.codeclan.example.CompanyLab.models.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
