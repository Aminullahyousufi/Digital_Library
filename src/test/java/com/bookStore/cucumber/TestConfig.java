package com.bookStore.cucumber;

import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.ComponentScan;

@TestConfiguration
@ComponentScan("com.bookStore") // Adjust the package based on your project structure
public class TestConfig {
    // Any additional configuration specific to your tests
}

