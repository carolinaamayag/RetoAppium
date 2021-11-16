Feature: Make a search in the mobile application
  I want to make a search in the mobile application

  Background:
    Given we are setting filters
    And we click to search button

    Scenario: Do a search in the application
      when we make a search by category and place
      then the search result is successfull
