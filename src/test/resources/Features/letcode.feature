Feature: Letcode Operations

  Background:
    Given letcode is open

  Scenario: 1 Input Field functions
    And Input Field page open
    When Fill details in input fields

  Scenario: 2 Buttons Page functions
    When click on buttons page
    And click on gotobutton
    And find the location of button
    And find the button color

  Scenario: 3 Select Drop down 
    When click on drop down button
    And select fruit
    And select super hero in drop down
    And select last programming language in drop down
    When I print all options from the dropdown
    And print select value from the dropdown
	
	Scenario: 4 Different types of alerts activities 
		When click on alert analog 