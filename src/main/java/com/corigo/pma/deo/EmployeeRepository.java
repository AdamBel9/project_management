package com.corigo.pma.deo;

import org.springframework.data.repository.CrudRepository;

import com.corigo.pma.entities.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}
