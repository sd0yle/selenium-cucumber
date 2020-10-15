Feature: Add Item To List.

  @add_to_todo
  Scenario Outline: Adding an item to the todo list.
    Given A user is at the HomePage
    And Todo input is displayed
    When a user enters a todo list item of "Walk dog"
    Then a todo list item exists matching "Walk dog"


    Examples:
      | Dishes |
      | Reading |
      | Piano |