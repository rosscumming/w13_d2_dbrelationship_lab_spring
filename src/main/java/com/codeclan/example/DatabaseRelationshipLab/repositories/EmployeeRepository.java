package com.codeclan.example.DatabaseRelationshipLab.repositories;

import com.codeclan.example.DatabaseRelationshipLab.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
