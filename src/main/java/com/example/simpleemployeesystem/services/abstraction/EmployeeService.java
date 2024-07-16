package com.example.simpleemployeesystem.services.abstraction;

import com.example.simpleemployeesystem.model.request.EmployeeRequest;
import com.example.simpleemployeesystem.model.response.EmployeeResponse;

import java.util.List;

public interface EmployeeService {
    void createEmployee (EmployeeRequest request);
    EmployeeResponse getEmployee(Long id);
    List<EmployeeResponse> getEmployee();
    void deleteEmployee(Long id);
    void updateEmployeeEmail(Long id,EmployeeRequest request);
}
