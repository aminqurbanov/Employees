package com.example.simpleemployeesystem.controller;

import com.example.simpleemployeesystem.model.request.EmployeeRequest;
import com.example.simpleemployeesystem.model.response.EmployeeResponse;
import com.example.simpleemployeesystem.services.abstraction.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.NO_CONTENT;

@RestController
@RequiredArgsConstructor
@RequestMapping("v1/employees")
public class EmployeeController {
    private final EmployeeService employeeService;
    @PostMapping
    @ResponseStatus(CREATED)
    public void createEmployee (@RequestBody EmployeeRequest request){
        employeeService.createEmployee(request);

    }
    @GetMapping("/{id}")
    EmployeeResponse getEmployee(@PathVariable Long id){
        return employeeService.getEmployee(id);

    }
    @GetMapping
    public List<EmployeeResponse> getEmployee(){
        return employeeService.getEmployee();
    }
    @DeleteMapping("/{id}")
    @ResponseStatus(NO_CONTENT)
    public  void deleteEmployee(@PathVariable Long id){
        employeeService.deleteEmployee(id);
    }
    @PatchMapping("/{id}")
    @ResponseStatus(NO_CONTENT)
    public void updateEmployeeEmail(@PathVariable Long id,
                                  @RequestBody EmployeeRequest request){
        employeeService.updateEmployeeEmail(id, request);
    }
}
