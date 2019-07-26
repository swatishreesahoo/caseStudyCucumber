package caseStudy1;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepdefCase1 {
	WebDriver driver=null;
	@Given("the Signup page is opened")
	public void the_Signup_page_is_opened() {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_b6b.00.10\\Desktop\\Browsers and Drivers\\chromedriver.exe");
		   driver=new ChromeDriver();
		   String url="http://10.232.237.143:443/TestMeApp/fetchcat.htm";
		   driver.get(url);
		   driver.manage().window().maximize();
	       driver.findElement(By.xpath("//a[@href='RegisterUser.htm']")).click();
	}

	@When("user enters username as {string}")
	public void user_enters_username_as(String string) {
		 Random rand=new Random();
		 int val=rand.nextInt(99);
		 driver.findElement(By.id("userName")).sendKeys("illu1"+val);
	    
	}

	@When("user enters firstname as {string}")
	public void user_enters_firstname_as(String string) {
		driver.findElement(By.id("firstName")).sendKeys("illu");
	}

	@When("user enters lastname as {string}")
	public void user_enters_lastname_as(String string) {
		driver.findElement(By.id("lastName")).sendKeys("lu");
	}

	@When("user enters password as {string}")
	public void user_enters_password_as(String string) {
		driver.findElement(By.id("password")).sendKeys("pass123");
	}

	@When("user enters confirm password as {string}")
	public void user_enters_confirm_password_as(String string) {
		 driver.findElement(By.id("pass_confirmation")).sendKeys("pass123"); 
	}

	@When("user clicks gender as {string}")
	public void user_clicks_gender_as(String string) {
		 WebElement radio1=driver.findElement(By.xpath("/html/body/main/div/div/form/fieldset/div/div[6]/div/div/label/span[1]"));
		 radio1.click();
	}

	@When("user enters email as {string}")
	public void user_enters_email_as(String string) {
		driver.findElement(By.id("emailAddress")).sendKeys("illu@345.com");
	}

	@When("user enters mobile number as {int}")
	public void user_enters_mobile_number_as(Integer int1) {
		driver.findElement(By.id("mobileNumber")).sendKeys("1234657890");
	}

	@When("user enters dateof birth as {string}")
	public void user_enters_dateof_birth_as(String string) {
		 driver.findElement(By.name("dob")).sendKeys("27/09/1900");
	}

	@When("user enters address as {string}")
	public void user_enters_address_as(String string) {
		 driver.findElement(By.id("address")).sendKeys("fkjvngfkjg");
	}

	@When("user select security question")
	public void user_select_security_question() throws InterruptedException {
		driver.findElement(By.id("securityQuestion")).click();
		Thread.sleep(1000);
		Random rand1=new Random();
		 Select sq=new Select(driver.findElement(By.id("securityQuestion")));
		 int value = rand1.nextInt(3);
		 sq.selectByIndex(value);
	}

	@When("user enters answer as {string}")
	public void user_enters_answer_as(String string) {
		driver.findElement(By.name("answer")).sendKeys("blr");
	}

	@When("user will click on register")
	public void user_will_click_on_register() {
		 driver.findElement(By.xpath("//input[@value='Register']")).click();   
		 
	}

	@Then("user will be directed to login page")
	public void user_will_be_directed_to_login_page() {
	    System.out.println("title is: "+driver.getTitle());
	}

}
