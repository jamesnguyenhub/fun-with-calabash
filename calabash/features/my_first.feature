Feature: Login feature

	Scenario: As a valid user I can log into my app
		Given I enter "nntuyen" into input field number 1
		Given I enter my secret password into input field number 2
		When I press view with id "btLogin"
		Then I see "ab"
