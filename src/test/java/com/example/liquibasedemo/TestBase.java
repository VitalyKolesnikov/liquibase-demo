package com.example.liquibasedemo;

import com.example.liquibasedemo.config.DatabaseTestConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT, classes = {DatabaseTestConfig.class})
@ContextConfiguration(
        initializers = {
                DatabaseTestConfig.class
        },
        classes = {
                DatabaseTestConfig.class
        }
)
@ActiveProfiles("integration-test")
@AutoConfigureMockMvc
abstract public class TestBase {

    @Autowired
    protected MockMvc mockMvc;

    @LocalServerPort
    protected Integer localServerPort;

}
