package caseStudy1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class stepdefCase2 {
	WebDriver driver=null;

	@Given("the login page is opened")
	public void the_login_page_is_opened() {
		
			 System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_b6b.00.10\\Desktop\\Browsers and Drivers\\chromedriver.exe");
			   driver=new ChromeDriver();
			   String url="http://10.232.237.143:443/TestMeApp/fetchcat.htm";
			   driver.get(url);
			   driver.manage().window().maximize();
	}

	@Given("user enters {string} and {string}")
	public void user_enters_and(String username, String password) {
		driver.findElement(By.id("userName")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
	}

	@Given("user clicks on Login button")
	public void user_clicks_on_Login_button() {
	  driver.findElement(By.xpath("//input[@type='submit'][@name='Login']")).click();
	}

	@Then("user is directed to home page")
	public void user_is_directed_to_home_page() {
	    System.out.println("the title is: "+driver.getTitle());
	}

}
