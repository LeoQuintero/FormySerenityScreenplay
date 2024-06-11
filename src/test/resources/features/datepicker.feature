#Auto: Edwin Quintero
#language:en
Feature: Formy Datepicker

  @datepicker
  Scenario: Select a date from the datepicker
    Given the actor is on the Formy homepage
    When he navigates to the Datepicker page
    And he selects the date "06-10-2024" from the calendar
    Then Then the selected date "06-10-2024" should be displayed in the input field
