package com.stepDefinition;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class dealsmapStepDefinition {
	
	 WebDriver driver;
	 @Given("^user is already on Login Page$")
		public void user_is_already_on_Login_page()
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Danda\\Desktop\\chromedriver.exe");
			driver=new ChromeDriver();
			  driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			driver.get("http://www.freecrm.com");
			
		}
		@When("^title of login page is Free CRM$")
		public void  title_of_login_page_is_Free_CRM()
		{
		  String title=driver.getTitle();
		  System.out.println(title);
		  Assert.assertEquals("#1 Free CRM software in the cloud for sales and service",title);
		}
		
		@Then("^user enters username and password$")
		public void user_enters_username_and_password(DataTable credentials) {
			System.out.println(credentials);
		for (Map<String,String>  data :  credentials.asMaps(String.class,String.class))
		{
		  driver.findElement(By.name("username")).sendKeys(data.get("username"));
		  driver.findElement(By.name("password")).sendKeys(data.get("password"));
		}
		}
		@Then("^user clicks on login button$")
		public void user_clicks_on_login_button()  {
					WebElement loginBtn = driver.findElement(By.xpath("//input[@type='submit']"));
					JavascriptExecutor js = (JavascriptExecutor)driver;
			    	js.executeScript("arguments[0].click();", loginBtn);
			    	//Thread.sleep(5000);
		    
		}
		@Then("^user is on home page$")
		public void user_is_on_home_page()  {
			String title=driver.getTitle();
			System.out.println(title);
			Assert.assertEquals("CRMPRO", title);
		}

		@Then("^user mouse over on deals link$")
	public void user_mouse_over_on_deals_link() throws Throwable {
		driver.switchTo().frame("mainpanel");
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Deals')]"))).build().perform();
		
	}

	@Then("^user clicks on New deal link$")
	public void user_clicks_on_New_deal_link(){
		driver.findElement(By.xpath("//a[contains(text(),'New Deal')]")).click();
	}

	@Then("^user enters new deal details$")
	public void user_enters_new_deal_details(DataTable dealdata) throws InterruptedException {
	for(Map<String,String> deals :  dealdata.asMaps(String.class, String.class))
	{
	 driver.findElement(By.name("title")).sendKeys(deals.get("title"));
	 driver.findElement(By.name("amount")).sendKeys(deals.get("amount"));
	 driver.findElement(By.name("probability")).sendKeys(deals.get("probability"));
	 driver.findElement(By.name("commission")).sendKeys(deals.get("commission"));
	 driver.findElement(By.xpath("//input[@type='submit' and @value='Save']")).click();
	 Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Deals')]"))).build().perform();
		driver.findElement(By.xpath("//a[contains(text(),'New Deal')]")).click();
		Thread.sleep(2000);
	}	
	
	}
}	