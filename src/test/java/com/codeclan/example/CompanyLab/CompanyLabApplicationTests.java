package com.codeclan.example.CompanyLab;

import com.codeclan.example.CompanyLab.models.Department;
import com.codeclan.example.CompanyLab.models.Employee;
import com.codeclan.example.CompanyLab.models.Project;
import com.codeclan.example.CompanyLab.repositories.DepartmentRepository;
import com.codeclan.example.CompanyLab.repositories.EmployeeRepository;
import com.codeclan.example.CompanyLab.repositories.ProjectRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CompanyLabApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	DepartmentRepository departmentRepository;

	@Autowired
	ProjectRepository projectRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createEmployee(){
		Department sales = new Department("sales");
		departmentRepository.save(sales);

		Employee steve = new Employee("steve", "jobs", 1, sales);
		employeeRepository.save(steve);
	}

	@Test
	public void addEmployeesAndProjects(){
		Department department = new Department("sales");
		departmentRepository.save(department);

		Employee employee1 = new Employee("steve", "jobs", 1, department);
		employeeRepository.save(employee1);

		Project project1 = new Project("iphone", 2);
		projectRepository.save(project1);

		project1.addEmployee(employee1);
		projectRepository.save(project1);
	}


}
