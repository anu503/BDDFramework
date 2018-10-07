Feature: Free CRM Deals Feature 

Scenario: Free CRM Deals Test ScenariO 

	Given user is already on Login Page 
	When title of login page is Free CRM 
	Then user enters username and password 
		|anudanda|test@123|
		
	Then user clicks on login button 
	Then user is on home page 
	Then user mouse over on deals link 
	Then user clicks on New deal link 
	Then user enters new deal details 
		|deal1|300|20|25|
		
	Then user clicks on save button 
	Then close the browser