Feature: Home page

  @home_page @todo_input_display
  Scenario Outline: Check page display
    Given A user is at the HomePage
    Then Todo input is displayed

    Examples: