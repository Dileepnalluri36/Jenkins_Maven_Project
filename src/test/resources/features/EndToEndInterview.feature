Feature: EndToEnd feature

  @EndToEndScenario
  Scenario Outline: EndToEnd_Test_case
    When I login to home page and get the title
    Then I navigate to vacation page and assert the title
    Then I navigate to home page and select the dropdowns with cities "<departureCity>" and "<destinationCity>"
    Then I will book the flight
    Then I will confirm the flight

    Examples: 
      | departureCity | destinationCity |
      | Mexico City   | London          |
      | Mexico City   | Berlin          |
      | Portland      | London          |
      | San Diego     | Dublin          |
