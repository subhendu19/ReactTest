package com.sub.poc.SpringWithReact.dao;
import org.springframework.data.repository.CrudRepository;

import com.sub.poc.SpringWithReact.data.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}
