package com.bookStore.controller;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;



public class HomeStepDefinitions {

    private BookController yourController;
    private MockMvc mockMvc;

    @Given("the user opens the application")
    public void theUserOpensTheApplication() {
        mockMvc = MockMvcBuilders.standaloneSetup(yourController).build();
    }

    @When("the user navigates to the home page")
    public void theUserNavigatesToTheHomePage() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/"))
                .andExpect(MockMvcResultMatchers.status().isOk()); // Assumes HTTP 200 OK is expected
    }

    @Then("the user should see the home page content")
    public void theUserShouldSeeTheHomePageContent() {
        // Add assertions to check the content of the home page, if needed
    }
}