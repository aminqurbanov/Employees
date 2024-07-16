package com.example.simpleemployeesystem.services.concrete;

import com.example.simpleemployeesystem.model.request.EmployeeRequest;
import com.example.simpleemployeesystem.model.response.EmployeeResponse;
import com.example.simpleemployeesystem.services.abstraction.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeServiceHandler implements EmployeeService {
    @Override
    public void createEmployee(EmployeeRequest request) {

    }

    @Override
    public EmployeeResponse getEmployee(Long id) {
        return null;
    }

    @Override
    public List<EmployeeResponse> getEmployee() {
        return null;
    }

    @Override
    public void deleteEmployee(Long id) {

    }

    @Override
    public void updateEmployeeEmail(Long id, EmployeeRequest request) {

    }
}
