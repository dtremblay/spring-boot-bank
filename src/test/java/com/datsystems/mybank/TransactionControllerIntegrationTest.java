package com.datsystems.mybank;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
class TransactionControllerIntegrationTest {

    @Autowired
    TransactionController controller;
    
    @Autowired 
    private MockMvc mockMvc;

    @Test
    void contextLoads() throws Exception {
        assertNotNull(controller);
        
        mockMvc.perform(get("/transactions/1234"))
        .andExpect(status().isOk());
    }
}
