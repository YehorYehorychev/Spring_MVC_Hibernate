package com.yehorychev.springboot.spring_data_jpa.dao;


import com.yehorychev.springboot.spring_data_jpa.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
