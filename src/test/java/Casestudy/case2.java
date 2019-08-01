package Casestudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class case2 {
	WebDriver driver;
	
	
	
	@Given("user opens testme application and clicks signin button")
	public void user_opens_testme_application_and_clicks_signin_button() {
		 System.setProperty("webdriver.chrome.driver","C:\\seldriver\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.get("http://10.232.237.143:443/TestMeApp/");
		  driver.findElement(By.xpath("//a[@href='login.htm']")).click();
	}

	@When("user enters the {string} and {string}")
	public void user_enters_the_and(String un, String pwd) {
	    driver.findElement(By.id("userName")).sendKeys(un);
	    driver.findElement(By.id("password")).sendKeys(pwd);
	}


/*@Given("user opens web browser and launches application")
	public void user_opens_web_browser_and_launches_application() {
		  System.setProperty("webdriver.chrome.driver","C:\\seldriver\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.get("http://10.232.237.143:443/TestMeApp/");
	}

	@When("user enters the <{string}> and <{string}>")
	public void user_enters_the_and(String string, String string2) {
		driver.findElement(By.name("userName")).sendKeys(string);
		 driver.findElement(By.name("password")).sendKeys(string2);

	}*/

	@When("user clicks the login button")
	public void user_clicks_the_login_button() {
		driver.findElement(By.name("Login")).click(); 
		 //driver.close();

	}


}
