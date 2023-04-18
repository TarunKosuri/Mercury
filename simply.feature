Feature: Mercury tools


@regression
Scenario: REGISTER AS NEW CUSTOMER AND LOGIN
	Given User Launch Chrome browser
	When User opens URL "https://demo.guru99.com/test/newtours/"
	And Click on register
	And User enters contact information
	And User enters mailing information
	And User enters user information
	And User clicks on submit
	And close browser
	
	
	
@sanity	  
Scenario: REGISTER AS NEW CUSTOMER AND LOGIN
	Given User Launch Chrome browser
	When User opens URL "https://demo.guru99.com/test/newtours/"
	And enter usename and password
	And click on submit
	And close browser