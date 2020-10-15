Feature: Delete From List

  @delete_from_todo
  Scenario Outline: Deleting an item from the todo list.
    Given A user is at the HomePage
    And a todo list item exists matching "Dishes"
    When a user deletes todo list item "Dishes"
    Then a todo item no longer exists for "Dishes"


    Examples:
      | Dishes |
      | Reading |
      | Piano |