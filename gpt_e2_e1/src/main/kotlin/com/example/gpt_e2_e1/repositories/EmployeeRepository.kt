package com.example.gpt_e2_e1.repositories

import com.example.gpt_e2_e1.model.Employee
import org.springframework.data.repository.CrudRepository
import java.util.*

interface EmployeeRepository : CrudRepository<Employee, Long> {
    fun findByInternalId(internalId: UUID): Optional<Employee>
}