package com.codeclan.example.DatabaseRelationshipLab;

import com.codeclan.example.DatabaseRelationshipLab.models.Department;
import com.codeclan.example.DatabaseRelationshipLab.models.Employee;
import com.codeclan.example.DatabaseRelationshipLab.models.Project;
import com.codeclan.example.DatabaseRelationshipLab.repositories.DepartmentRepository;
import com.codeclan.example.DatabaseRelationshipLab.repositories.EmployeeRepository;
import com.codeclan.example.DatabaseRelationshipLab.repositories.ProjectRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
class DatabaseRelationshipLabApplicationTests {

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
	public void createEmployee() {
		Department finance = new Department("Finance");
		Department hr = new Department("HR");
		Employee john = new Employee("John", "Travolta", 1, finance);
		Employee marcus = new Employee("Marcus", "Freeman", 2, hr);
		departmentRepository.save(finance);
		departmentRepository.save(hr);
		employeeRepository.save(john);
		employeeRepository.save(marcus);

	}

	@Test
	public void createDepartment(){
		Department finance = new Department("Finance");
		Department hr = new Department("HR");
		departmentRepository.save(finance);
		departmentRepository.save(hr);
	}


	@Test
	public void createProject(){
		Project alpha = new Project("Alpha", 100);
		Project bravo = new Project("Bravo", 50);
		projectRepository.save(alpha);
		projectRepository.save(bravo);

	}


}
