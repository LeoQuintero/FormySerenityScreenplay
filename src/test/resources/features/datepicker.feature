#Auto: Edwin Quintero
#language:en
Feature: Formy Datepicker

  Background:
    Given the actor is on the Formy homepage
    And he navigates to the Datepicker page

  @datepicker
  Scenario: Select a date from the datepicker
    When he selects the date "06-10-2024" from the calendar
    Then the selected date "06-10-2024" should be displayed in the input field

  @negative
  Scenario: Try to enter an incorrect date format
    When the actor enters an incorrect date format "2024/10/06"
    Then the input field should remain empty or show the current date
