package com.example.gpt_e2_e1.controllers

import com.example.gpt_e2_e1.model.Employee
import com.example.gpt_e2_e1.services.EmployeeService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/employees")
class EmployeeController(private val service: EmployeeService) {

    @PostMapping
    fun addEmployee(@RequestBody employee: Employee): Employee {
        return service.addEmployee(employee)
    }

    @GetMapping
    fun getAllEmployees(): Iterable<Employee> {
        return service.getAllEmployees()
    }

}