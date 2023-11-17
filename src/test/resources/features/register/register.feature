Feature: Testing the book register endpoint

  Scenario: Visiting the book register endpoint
    Given the book register endpoint is called
    Then the response should be "bookRegister"
