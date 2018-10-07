Feature: Free CRM Contacts Feature 
#with Examples keyword

Scenario Outline:Free CRM Contacts Test ScenariO 
 
	Given user is already on Login Page 
	When title of login page is Free CRM 
	Then user enters "<username>" and "<password>" 
	Then user clicks on login button 
	Then user is on home page 
	Then user mouse over on contacts link 
	Then user clicks on New Contact link 
	Then user enters new contact  "<firstname>" and "<lastname>" 
	Then user clicks on save button 
	Then close the browser 
	Examples: 
		|username|password|firstname|lastname|
		| anudanda| test@123|ab |cd|
		| anudanda| test@123|ef |gh|
		| anudanda| test@123|ij |kl|
		| anudanda| test@123|mn |op|