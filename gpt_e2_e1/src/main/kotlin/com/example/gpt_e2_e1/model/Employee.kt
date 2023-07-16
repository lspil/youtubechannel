package com.example.gpt_e2_e1.model

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table
import java.util.*

@Table("employees")
data class Employee(
        @Id val id: Long? = null,
        val name: String,
        val jobTitle: String,
        val department: String,
        val internalId: UUID
)
