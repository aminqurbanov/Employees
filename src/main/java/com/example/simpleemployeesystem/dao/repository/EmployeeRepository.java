package com.example.simpleemployeesystem.dao.repository;

import com.example.simpleemployeesystem.dao.entity.EmployeeEntity;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<EmployeeEntity,Long> {
}
