package com.chefcode.starter.controller;


import com.chefcode.starter.configuration.WebSecurity;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@AutoConfigureMockMvc
@ContextConfiguration(classes = {SampleController.class, WebSecurity.class})
@WebMvcTest
@ActiveProfiles("test")
public class SampleControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void shouldBeAbleToGetSuccessOkResponseWithSampleInfo() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/sample/info"))
                .andExpect(status().isOk())
                .andExpect(content().string("Sample info"));
    }
}
