package com.stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginStepDefinition {
	  WebDriver driver ;// Each scenario creates a fresh instance of all the step definitions.so u need to make static

//@Given("^user is already on Login Page$")
//	public void user_is_already_on_Login_page()
//	{
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Danda\\Desktop\\chromedriver.exe");
//		driver=new ChromeDriver();
//		  driver.manage().deleteAllCookies();
//		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
//		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		driver.get("http://www.freecrm.com");
//		
//	}
//	@When("^title of login page is Free CRM$")
//	public void  title_of_login_page_is_Free_CRM()
//	{
//	  String title=driver.getTitle();
//	  System.out.println(title);
//	  Assert.assertEquals("Free CRM software in the cloud powers sales and customer service",title);
//	}
//	
//	// u can use \"(.*)\" or \"(\"[^\"]*)\"
////	@Then("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
////	public void user_enters_username_and_password(String username, String password) {
////		driver.findElement(By.name("username")).sendKeys(username);
////		driver.findElement(By.name("password")).sendKeys(password);
////	    
//	// }
//	@Then("^user clicks on login button$")
//	public void user_clicks_on_login_button()  {
//				WebElement loginBtn = driver.findElement(By.xpath("//input[@type='submit']"));
//				JavascriptExecutor js = (JavascriptExecutor)driver;
//		    	js.executeScript("arguments[0].click();", loginBtn);
		    	//Thread.sleep(5000);
	    
//	}
//	@Then("^user is on home page$")
//	public void user_is_on_home_page()  {
//		String title=driver.getTitle();
//		System.out.println(title);
//		Assert.assertEquals("CRMPRO", title);
//	}
//
//	
//	
//		
//	@Given("^user is already on home page$")
//	public void user_is_already_on_home_page()   {
//		driver.switchTo().frame("mainpanel");
//		
//		boolean b=driver.findElement(By.xpath("//td[contains(@class,'headertext')and contains(text(),'User: anu danda')]")).isDisplayed();
//		Assert.assertTrue("The correct user is already on home page", b);
//	}

	@When("^user mouse over on contacts link$")
	public void user_mouse_over_on_contacts_link()  {
		driver.switchTo().frame("mainpanel");
		
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"))).build().perform();
		
	    }
	

	@Then("^user clicks on New Contact link$")
	public void user_clicks_on_New_Contact_link()  {
		driver.findElement(By.xpath("//a[contains(text(),'New Contact')]")).click();
		//Thread.sleep(5000);
		//driver.findElement(By.xpath("//input[@type='button' and @value='New Contact']")).click();
	    
	}

//	@Then("^user enters firstname and lastname$")
//	public void user_enters_firstname_and_lastname()  {
//		driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("chetan123");
//		driver.findElement(By.xpath("//input[@name='surname']")).sendKeys("danda");
//	    
//	}
	@Then("^user enters new contact  \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_new_contact_and(String firstname, String lastname)  {
		driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys(firstname);
		driver.findElement(By.xpath("//input[@name='surname']")).sendKeys(lastname);
	    
	}

//	@Then("^user clicks on save button$")
//	public void user_clicks_on_save_button()  {
//		driver.findElement(By.xpath("//input[@type='submit' and @value='Save']")).click();
//	    
//	}
//
//
//@Then("^close the browser$")
//public void close_the_browser()  {
//	driver.quit();
//    }


	   
	}


