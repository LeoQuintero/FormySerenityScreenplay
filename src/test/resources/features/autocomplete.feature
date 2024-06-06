#Auto: Edwin Quintero
#language:en
Feature: Formy Autocomplete Form

  @autocomplete
  Scenario Outline: fill out the form
    Given the actor was on the website
    When he proceeds to fill out the form
      | address   | city   | state   | zip   | country   |
      | <address> | <city> | <state> | <zip> | <country> |
    Then he will see a confirmation message
    Examples:
      | address       | city        | state | zip   | country  |
      | calle 45 # 2a | Springfield | IL    | 62704 | COLOMBIA |