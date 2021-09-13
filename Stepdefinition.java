package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdefinition extends BaseClass {
	//public ChromeDriver driver;

	/*@Given("open the browser")
	public void loadbrowser()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	}
	@And("load the application url")
	public void loadurl()
	{
		driver.get("http://leaftaps.com/opentaps/");
	}*/
	//@Given("Enter the username as <username>") 
	@Given("Enter the username as {String}")
	public void enterUserName(String username)
	{
		driver.findElement(By.id("username")).sendKeys(username);
	}
	@Given("Enter the password as {String}")
	public void enterPassword(String password)
	{
		driver.findElement(By.id("password")).sendKeys(password);
	}
	@When("click on login button ")
	public void clickLogin()
	{
		driver.findElement(By.className("decorativeSubmit")).click();
	}
	@Then("Home page displayed ")
	public void verifyHomepage()
	{
		boolean displayed = driver.findElement(By.linkText("CRM/SFA")).isDisplayed();
		if(displayed) {
			System.out.println("Page verified");
		}
		else
		{
			System.out.println("Page not verified");
		}
	}
		@But("Error message should be displayed") 
		public void errorMessage()
		{
			System.out.println("Enter Credentials");
		}
	}

