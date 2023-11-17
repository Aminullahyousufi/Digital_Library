package com.bookStore.controller;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static java.nio.file.Paths.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

public class BookControllerStepDefinitions {

    private MockMvc mockMvc;
    private ResultActions resultActions;

    @Given("the book register endpoint is called")
    public void theBookRegisterEndpointIsCalled() throws Exception {
        // Set up MockMvc for your controller
        this.mockMvc = MockMvcBuilders.standaloneSetup(new BookController()).build();

        // Perform the GET request to /book_register
        this.resultActions = mockMvc.perform(get("/book_register"));
    }

    @Then("the response should be {string}")
    public void theResponseShouldBe(String expectedViewName) throws Exception {
        // Verify status code is OK and the view name matches the expected value
        resultActions.andExpect(status().isOk())
                .andExpect(view().name(expectedViewName));
    }
}
