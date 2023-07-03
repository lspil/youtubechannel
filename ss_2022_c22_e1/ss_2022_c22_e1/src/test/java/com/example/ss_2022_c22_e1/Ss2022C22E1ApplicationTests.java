package com.example.ss_2022_c22_e1;

import com.example.ss_2022_c22_e1.security.WithCustomMockUser;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.security.test.context.support.WithUserDetails;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

@SpringBootTest
@AutoConfigureMockMvc
class Ss2022C22E1ApplicationTests {

    @Autowired
    private MockMvc mockMvc;

    @Test
//    @WithMockUser
//    @WithUserDetails(userDetailsServiceBeanName = "customUserDetailsService")
//    @WithCustomMockUser(priority = "LOW")
    void test1() throws Exception {

        mockMvc.perform(get("/demo"))
                .andExpect(status().isOk());

    }

}
