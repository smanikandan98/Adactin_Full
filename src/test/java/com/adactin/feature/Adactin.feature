Feature: Login Functionality of adactin application

	Background: User enters the valid username and password
		Given user launches the url of adactin application
		When User enters "vinovicky" as username
		And User enters "Jan@2020" as password
		And User clicks the login button
		Then User validate the login page
@mani		
	Scenario Outline: User enters the valid username and password
		Given user launches the url of adactin application
		When User enters "<username>" as username
		And User enters "<password>" as password
		And User clicks the login button
	
	Examples:
				|username|password|
				|MAni|0000|
				|mnb|....|
				|nnn|mmmm|
				
@mnb	
	Scenario: User Search the Hotel
		When User select the location
		And user select the hotel
		And user select the room type
		And user select the number of rooms
		And user clears the check in date
		And user enters the check in date
		And user clears the check out date
		And user enters the check out date
		And user select the adult room
		And user select the child room
		Then user clicks the submit button
	@mnb
	Scenario: User Select to confirm the Hotel
		When user select the radio button
		Then user clicks the continue button
@mnb	
	Scenario: User fill details and book a hotel
		When User enter the first name
		And User enter the last name
		And user enter the billing address
		And user enter the credit card number
		And user select the credit card type
		And user select the expiry month
		And user select the year
		And user enter the cvv number
		Then user validate the book now
		
		