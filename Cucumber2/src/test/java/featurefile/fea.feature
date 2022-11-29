Feature: user login

Scenario: user login to mail
	Given login page
	When user enters email "sindhu123@gmail.com" and password "Sindhu"
	And click on login
	Then user enters to home page
