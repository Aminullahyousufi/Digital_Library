package com.bookStore.controller;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import com.bookStore.cucumber.TestConfig;
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:features",
        glue = "com.bookStore.cucumber",
        plugin = {"pretty", "html:target/cucumber-reports"}
)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT, classes = TestConfig.class)
public class BookStoreCucumberTest {


}