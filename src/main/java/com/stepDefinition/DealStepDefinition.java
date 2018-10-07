package com.stepDefinition;

import java.util.List;
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

public class DealStepDefinition {
//	 WebDriver driver;
//	 @Given("^user is already on Login Page$")
//		public void user_is_already_on_Login_page()
//		{
//			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Danda\\Desktop\\chromedriver.exe");
//			driver=new ChromeDriver();
//			  driver.manage().deleteAllCookies();
//			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
//			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//			driver.get("http://www.freecrm.com");
//			
//		}
//		@When("^title of login page is Free CRM$")
//		public void  title_of_login_page_is_Free_CRM()
//		{
//		  String title=driver.getTitle();
//		  System.out.println(title);
//		  Assert.assertEquals("Free CRM software in the cloud powers sales and customer service",title);
//		}
//		
//		@Then("^user enters username and password$")
//		public void user_enters_username_and_password(DataTable credentials) {
//			System.out.println(credentials);
//		  List<List<String>>  data = credentials.raw();
//		  driver.findElement(By.name("username")).sendKeys(data.get(0).get(0));
//		  driver.findElement(By.name("password")).sendKeys(data.get(0).get(1));
//		}
//		
//		@Then("^user clicks on login button$")
//		public void user_clicks_on_login_button()  {
//					WebElement loginBtn = driver.findElement(By.xpath("//input[@type='submit']"));
//					JavascriptExecutor js = (JavascriptExecutor)driver;
//			    	js.executeScript("arguments[0].click();", loginBtn);
//			    	//Thread.sleep(5000);
//		    
//		}
//		@Then("^user is on home page$")
//		public void user_is_on_home_page()  {
//			String title=driver.getTitle();
//			System.out.println(title);
//			Assert.assertEquals("CRMPRO", title);
//		}
//
//		@Then("^user mouse over on deals link$")
//	public void user_mouse_over_on_deals_link() throws Throwable {
//		driver.switchTo().frame("mainpanel");
//		Actions action=new Actions(driver);
//		action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Deals')]"))).build().perform();
//		
//	}
//
//	@Then("^user clicks on New deal link$")
//	public void user_clicks_on_New_deal_link(){
//		driver.findElement(By.xpath("//a[contains(text(),'New Deal')]")).click();
//	}
//
//	@Then("^user enters new deal details$")
//	public void user_enters_new_deal_details(DataTable dealdata) {
//	List<List<String>> deals = dealdata.raw();
//	 driver.findElement(By.name("title")).sendKeys(deals.get(0).get(0));
//	 driver.findElement(By.name("amount")).sendKeys(deals.get(0).get(1));
//	 driver.findElement(By.name("probability")).sendKeys(deals.get(0).get(2));
//	 driver.findElement(By.name("commission")).sendKeys(deals.get(0).get(3));
//	
//	}
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
//
//
//
}
