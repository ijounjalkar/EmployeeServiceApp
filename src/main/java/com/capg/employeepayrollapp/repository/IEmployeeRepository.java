package com.capg.employeepayrollapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.capg.employeepayrollapp.model.Employee;

public interface IEmployeeRepository extends JpaRepository<Employee, Long> {

}