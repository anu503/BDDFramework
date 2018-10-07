Feature: Free CRM Dealsmap Feature 

Scenario: Free CRM Dealsmap Test ScenariO 
 
	Given user is already on Login Page 
	When title of login page is Free CRM 
	Then user enters username and password 
		|username|password|
		|anudanda|test@123|
		
	Then user clicks on login button 
	Then user is on home page 
	Then user mouse over on deals link 
	Then user clicks on New deal link 
	Then user enters new deal details 
		|title|amount|probability|commission|
		|deal123|3000|20|25|
		|deal234|4000|30|35|
		|deal345|5000|40|45|
		|deal456|6000|50|55|