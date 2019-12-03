package com.codeclan.example.CompanyLab.repositories;

import com.codeclan.example.CompanyLab.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
