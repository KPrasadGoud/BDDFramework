package steps;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefination2 {
	WebDriver driver;
	@Given("user starts the {string} browser")
	public void user_starts_the_browser(String browserName) {
		
	 if(browserName.equalsIgnoreCase("chrome")) {
		 WebDriverManager.chromedriver().setup();
		 driver=	 new ChromeDriver();
	 }
	 else if(browserName.equalsIgnoreCase("firefox")) {
		 WebDriverManager.firefoxdriver().setup();
		 driver= new FirefoxDriver();
	 }
	 else {
		 WebDriverManager.edgedriver().setup();
		 driver= new EdgeDriver();
	 }
	}

	@Given("user launch the app using url {string}")
	public void user_launch_the_app_using_url(String url) {
	  driver.get(url);
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}

	@When("user click the link {string}")
	public void user_click_the_link(String linkText) {
	driver.findElement(By.xpath(linkText)).click();
	}

	@Then("user varify the title of the page {string}")
	public void user_varify_the_title_of_the_page(String exptitle) {
	  Assert.assertEquals(exptitle, driver.getTitle());
	}

	@When("user enters Name text {string} in text box using xpth {string}")
	public void user_enters_name_text_in_text_box_using_xpth(String nametext, String xpath) {
	   driver.findElement(By.xpath(xpath)).sendKeys(nametext);
	}

	@When("user enters Password text {string} in text box using xpath {string}")
	public void user_enters_password_text_in_text_box_using_xpath(String pass, String xpath) {
	 driver.findElement(By.xpath(xpath)).sendKeys(pass);
	}

	@When("user enters  Confirm Password text {string} in text box using xpath {string}")
	public void user_enters_confirm_password_text_in_text_box_using_xpath(String conpass, String xpath) {
	  driver.findElement(By.xpath(xpath)).sendKeys(conpass);
	}

	@When("user enters Full Name text {string} in text box using xpath {string}")
	public void user_enters_full_name_text_in_text_box_using_xpath(String fullnm, String xpath) {
		 driver.findElement(By.xpath(xpath)).sendKeys(fullnm);
	}

	@When("user enters Email Address text {string} in text box using xpath {string}")
	public void user_enters_email_address_text_in_text_box_using_xpath(String email, String xpath) {
		driver.findElement(By.xpath(xpath)).sendKeys(email);
	}

	@When("user enters Captcha Text text {string} in text box using xpath {string}")
	public void user_enters_captcha_text_text_in_text_box_using_xpath(String cap, String xpath) {
		driver.findElement(By.xpath(xpath)).sendKeys(cap);
	}

	@When("user Click The Check box using xpath {string}")
	public void user_click_the_check_box_using_xpath(String check) {
		driver.findElement(By.xpath(check)).click();
	}
	
	
@After
public void teardown() {
	try {
		Thread.sleep(30);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	driver.quit();
}
}
