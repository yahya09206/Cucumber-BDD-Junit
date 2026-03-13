Feature: Bing search functionality
  Agile story: As a user, when I am on the bing search page
  I should be able to search anything and see relevant results


  @wip_bing
  Scenario: Search result title verification
    Given user is on the bing search page
    When user enters the word orange
    Then user should see orange in the title

  Scenario: Search result title verification
    Given user is on the bing search page
    When user enters the word "orange"
    Then user should see "orange - Search" in the title