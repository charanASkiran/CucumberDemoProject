Feature: Employee Apprisal process
  
  I want to use this template for my feature file

  Scenario Outline: Employee Apprisal
    Given the employee name is "<empname>"
    When he gets rating as <rating>
    Then he shall recieve hike percent as <hikepercent>

    Examples: 
      | empname | rating | hikepercent |
      | Charan  |      1 |          90 |
      | Kiran   |      2 |          80 |
