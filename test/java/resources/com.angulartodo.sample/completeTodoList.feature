Feature: Complete Item on List.

  @add_to_todo
  Scenario Outline: Completing an existing item on the todo list.
    Given A user is at the HomePage
    When a user enters a todo list item of "Laundry"
    And a todo list item exists matching "Laundry"
    When a user completes todo list item "Laundry"
    Then a todo item is marked completed matching "Laundry"


    Examples:
      | Dishes |
      | Reading |
      | Piano |