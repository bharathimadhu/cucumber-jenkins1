import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class case1 {
	WebDriver driver; 
	@Given("user opens web browser and launches application")
	public void user_opens_web_browser_and_launches_application() {
		  System.setProperty("webdriver.chrome.driver","C:\\seldriver\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.get("http://10.232.237.143:443/TestMeApp/");
	}

	@When("user clicks the signup")
	public void user_clicks_the_signup() {
		driver.findElement(By.xpath("//a[@href= 'RegisterUser.htm']")).click();
	   
	}

	@When("user enters username as {string}")
	public void user_enters_username_as(String string) {
		driver.findElement(By.id("userName")).sendKeys("selvi");
	  
	}

	@When("user enters firstname as {string}")
	public void user_enters_firstname_as(String string) {
		driver.findElement(By.id("firstName")).sendKeys("shiroh");
	    
	}

	@When("user enters lastname as {string}")
	public void user_enters_lastname_as(String string) {
	   driver.findElement(By.id("lastName")).sendKeys("sudha");
	   
	}

	@Then("user enters password as {string}")
	public void user_enters_password_as(String string) {
	   driver.findElement(By.id("password")).sendKeys("sudha1997");
	}

	@Then("user enters confirm password as {string}")
	public void user_enters_confirm_password_as_$udha(String string) {
	   driver.findElement(By.name("confirmPassword")).sendKeys("sudha1997");
	}

	@Then("user enters gender as {string}")
	public void user_enters_gender_as(String string) {
	    driver.findElement(By.xpath("//input[@value='Female']")).click();
	}

	@Then("user enters email as {string}")
	public void user_enters_email_as(String string) {
		driver.findElement(By.id("emailAddress")).sendKeys("sudhadass1997@gmail.com");
	}

	@Then("user enters mobile number as {string}")
	public void user_enters_mobile_number_as(String string) {
		driver.findElement(By.id("mobileNumber")).sendKeys("7398954811");
	}

	@Then("user enters dob as {string}")
	public void user_enters_dob_as(String string) {
		 driver.findElement(By.xpath("//img[@title='Ch']")).click();
	   WebElement month=driver.findElement(By.xpath("//select[@data-handler='selectMonth']"));
       Select selMonth=new Select(month);
selMonth.selectByValue("5");
WebElement year=driver.findElement(By.xpath("//select[@data-handler='selectYear']"));
Select selYear=new Select(year);
selYear.selectByValue("1995");
WebElement cal=driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/table"));
cal.findElement(By.linkText("22")).click();  
	}

	@When("user enters address as {string}")
	public void user_enters_address_as(String string) {
		  driver.findElement(By.id("address")).sendKeys("chennaikancheepuram");
	}

	@When("user enters security question as {string}")
	public void user_enters_security_question_as(String string) {
		driver.findElement(By.id("securityQuestion")).sendKeys("What is your Birth Place?");
	}

	@When("user enters answer as {string}")
	public void user_enters_answer_as(String string) {
		driver.findElement(By.name("answer")).sendKeys("chennai");
	}

	@When("user clicks on register button")
	public void user_clicks_on_register_button() {
		 driver.findElement(By.xpath("//input[@value='Register']")).click();
	}

}
