Feature: Google search functionality
  Agile story: As a user, when I am on the google search page
  I should be able to search anything and see relevant results

  @smoke_google
  Scenario: Search page default title verification
    When user is on the google search page
    Then user should see title is google

  @wip
  Scenario: Search result title verification
    Given user is on the google search page
    When user enters the word apple
    Then user should see apple in the title