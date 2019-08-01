package Casestudy;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class case3 {
	WebDriver driver;
	@Given("user opens testme and login")
	public void user_opens_testme_and_login() {
		System.setProperty("webdriver.chrome.driver","C:\\seldriver\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.get("http://10.232.237.143:443/TestMeApp/");
		 
		  driver.findElement(By.xpath("//a[@href='login.htm']")).click();
		  driver.findElement(By.id("userName")).sendKeys("lalitha");
		    driver.findElement(By.id("password")).sendKeys("password123");
		    driver.findElement(By.name("Login")).click();
	}

	@When("user search for the particular product like headphones")
	public void user_search_for_the_particular_product_like_headphones() {
		WebElement search = driver.findElement(By.id("myInput"));
		    search.sendKeys("h");
		    search.sendKeys("e");
		    search.sendKeys("a");
		    search.sendKeys("d");
		    Actions act1 = new Actions(driver);
		    act1.moveToElement(driver.findElement(By.xpath("//div[contains(text(),'Headphone')]"))).click().build().perform();
	}
	  

	@When("user clicks the finddetails button")
	public void user_clicks_the_finddetails_button() {
		driver.findElement(By.xpath("//input[@value='FIND DETAILS']")).click();
	}

	@When("user proceed to payment by adding product to the cart")
	public void user_proceed_to_payment_by_adding_product_to_the_cart() {
	    String title=driver.getTitle();
	    Assert.assertEquals("Search",title);
	}


}
