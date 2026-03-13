Feature: Google search functionality
  Agile story: As a user, when I am on the google search page
  I should be able to search anything and see relevant results

  @smoke_google
  Scenario: Search page default title verification
    When user is on the google search page
    Then user should see title is google