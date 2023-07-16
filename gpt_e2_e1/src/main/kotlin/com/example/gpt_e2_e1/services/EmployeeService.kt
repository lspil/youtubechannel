package com.example.gpt_e2_e1.services

import com.example.gpt_e2_e1.model.Employee
import com.example.gpt_e2_e1.repositories.EmployeeRepository
import org.springframework.dao.DataIntegrityViolationException
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import java.util.*

@Service
@Transactional(readOnly = true)
class EmployeeService(private val repository: EmployeeRepository) {

    @Transactional
    fun addEmployee(employee: Employee): Employee {
        return if (isUniqueId(employee.internalId)) {
            repository.save(employee)
        } else {
            throw DataIntegrityViolationException("The UUID already exists.")
        }
    }

    fun getAllEmployees(): Iterable<Employee> {
        return repository.findAll()
    }

    private fun isUniqueId(internalId: UUID): Boolean {
        return repository.findByInternalId(internalId).isEmpty
    }
}