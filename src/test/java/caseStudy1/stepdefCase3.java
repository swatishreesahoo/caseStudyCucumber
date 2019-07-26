package caseStudy1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class stepdefCase3 {
	WebDriver driver=null;
	  
@Given("TestMe app homepage is open")
public void testme_app_homepage_is_open() throws InterruptedException {
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\training_b6b.00.10\\Desktop\\Browsers and Drivers\\chromedriver.exe");
	    driver=new ChromeDriver();
	    String url="http://10.232.237.143:443/TestMeApp/fetchcat.htm";
	    driver.navigate().to(url);
	    driver.manage().window().maximize();
}
@When("User click on SignIn link")
	    public void user_click_on_SignIn_link() throws InterruptedException {
	 driver.findElement(By.linkText("SignIn")).click();
	    Thread.sleep(2000);
}

@When("User provides {string} as username")
public void user_provides_as_username(String string) {
    driver.findElement(By.name("userName")).sendKeys("lalitha");
}

@When("User provides {string} as password")
public void user_provides_as_password(String string) {
	driver.findElement(By.name("password")).sendKeys("password123");
}

@When("User clicks on Login button")
public void user_clicks_on_Submit_button() throws InterruptedException {
    driver.findElement(By.xpath("//input[@class='btn btn-lg btn-success col-xs-4 col-md-offset-0']")).click();
    Thread.sleep(2000);
}

@Then("LogIn page is displayed")
public void login_page_is_displayed() {
    System.out.println("This is Login Page");
}

@When("User click on Search box")
public void user_click_on_Search_box() {
    driver.findElement(By.id("myInput")).click();
}

@When("User enters {string} on search box to scroll down and select headphone")
public void user_enters_on_search_box_to_scroll_down_and_select_headphone(String Searchname) throws InterruptedException {
    driver.findElement(By.id("myInput")).sendKeys("h");
    driver.findElement(By.id("myInput")).sendKeys("e"); 
    driver.findElement(By.id("myInput")).sendKeys("a");
    driver.findElement(By.id("myInput")).sendKeys("d");
    Actions a2=new Actions(driver);
    Thread.sleep(2000);
  a2.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
    
}

@When("User clicks on Add to Cart button")
public void user_clicks_on_Add_to_Cart_button() {
    driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a")).click();
}

@When("User clicks on cart link")
public void user_clicks_on_cart_link() throws InterruptedException {
    driver.findElement(By.xpath("//a[@href='displayCart.htm']")).click();
    Thread.sleep(2000);
}

@Then("Cart page is displayed")
public void cart_page_is_displayed() {
    System.out.println("Cart Page is displayed");
}

@When("User clicks on Checkout button")
public void user_clicks_on_Checkout_button() throws InterruptedException {
    driver.findElement(By.xpath("//a[@href='checkout.htm']")).click();
    Thread.sleep(2000);
}

@When("User enters Shipping Address as {string}")
public void user_enters_Shipping_Address_as(String string) {
    driver.findElement(By.name("ShippingAdd")).sendKeys("Bengaluru");
}

@When("User clicks on Proceed to Pay button")
public void user_clicks_on_Proceed_to_Pay_button(){
    driver.findElement(By.xpath("//input[@class='btn btn-primary btn-submit-fix'][@value='Proceed to Pay']")).click();
   
}

@Then("Payment page is displayed")
public void payment_page_is_displayed() {
   System.out.println("Payment Page is displayed");
}

@When("User selects Bank in Net Banking")
public void user_selects_Bank_in_Net_Banking() throws InterruptedException {
	Thread.sleep(5000);
	 driver.findElement(By.xpath("//*[@id=\"swit\"]/div[1]/div/label/i")).click();
}

@When("User clicks on Continue button")
public void user_clicks_on_Continue_button() throws InterruptedException {
    driver.findElement(By.id("btn")).click();
    Thread.sleep(2000);
}

@When("User enters Username as {string}")
public void user_enters_Username_as(String string) {
    driver.findElement(By.xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/input[1]")).sendKeys("123456");
}

@When("User enters Passwword as {string}")
public void user_enters_Passwword_as(String string) {
    driver.findElement(By.xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/input[2]")).sendKeys("Pass@456");
}

@When("User clicks on LOGIN button")
public void user_clicks_on_LOGIN_button() throws InterruptedException {
    driver.findElement(By.xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/div/div[3]/input")).click();
    Thread.sleep(2000);
}

@When("User enters Transaction Password as {string}")
public void user_enters_Transaction_Password_as(String string) {
    driver.findElement(By.name("transpwd")).sendKeys("Trans@456");
}

@When("User clicks PAYNOW button")
public void user_clicks_PAYNOW_button() {
    driver.findElement(By.xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/div/div[2]/input")).click();
}

@Then("Order details page is displayed")
public void order_details_page_is_displayed() {
    System.out.println("Order details Page is displayed as purchase is complete");
    driver.close();
}

}