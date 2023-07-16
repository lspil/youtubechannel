package com.example.gpt_e2_e1

import com.example.gpt_e2_e1.model.Employee
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.fasterxml.jackson.module.kotlin.readValue
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.http.MediaType
import org.springframework.test.context.DynamicPropertyRegistry
import org.springframework.test.context.DynamicPropertySource
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.post
import org.springframework.test.web.servlet.get
import org.testcontainers.containers.MySQLContainer
import org.testcontainers.junit.jupiter.Container
import org.testcontainers.junit.jupiter.Testcontainers

import java.util.*

@SpringBootTest
@AutoConfigureMockMvc
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Testcontainers
class EmployeeControllerTest {

    companion object {
        @Container
        val mySQLContainer: MySQLContainer<*> = MySQLContainer<Nothing>("mysql:5.7")
                .apply {
                    withDatabaseName("test")
                    withUsername("test")
                    withPassword("test")
                }

        @JvmStatic
        @DynamicPropertySource
        fun properties(registry: DynamicPropertyRegistry) {
            registry.add("spring.datasource.url", mySQLContainer::getJdbcUrl)
            registry.add("spring.datasource.password", mySQLContainer::getPassword)
            registry.add("spring.datasource.username", mySQLContainer::getUsername)
        }
    }

    @Autowired
    private lateinit var mockMvc: MockMvc

    private val objectMapper = jacksonObjectMapper()

    @Test
    fun `add employee`() {
        val employee = Employee(name = "John Doe", jobTitle = "Software Engineer", department = "Engineering", internalId = UUID.randomUUID())

        mockMvc.post("/employees") {
            contentType = MediaType.APPLICATION_JSON
            content = objectMapper.writeValueAsString(employee)
            accept = MediaType.APPLICATION_JSON
        }.andExpect {
            status { isCreated() } // 201 CREATED is more suitable for a resource creation endpoint
        }
    }

    @Test
    fun `get all employees`() {
        val employee = Employee(name = "John Doe", jobTitle = "Software Engineer", department = "Engineering", internalId = UUID.randomUUID())

        mockMvc.post("/employees") {
            contentType = MediaType.APPLICATION_JSON
            content = objectMapper.writeValueAsString(employee)
            accept = MediaType.APPLICATION_JSON
        }

        val result = mockMvc.get("/employees") {
            accept = MediaType.APPLICATION_JSON
        }.andExpect {
            status { isOk() }
        }.andReturn()

        val response: List<Employee> = objectMapper.readValue(result.response.contentAsString)
        assert(response.isNotEmpty())
        assert(response[0].name == "John Doe")
    }
}
