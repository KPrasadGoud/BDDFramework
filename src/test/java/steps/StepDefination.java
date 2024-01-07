package steps;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;


public class StepDefination {
	WebDriver driver;
	@Given("user starts {string} browser")
	public void user_starts_browser(String browserName) {
		
		if(browserName.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
	  
		
	}

	@Given("user launch app using url {string}")
	public void user_launch_app_using_url(String url) {
		
		driver.get(url);
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	   
	}

	@When("user enters text {string} in textbox using xpath {string}")
	public void user_enters_text_in_textbox_using_xpath(String text, String xpath) {
	    
		driver.findElement(By.xpath(xpath)).sendKeys(text);
	}

	@When("user clicks button using xpath {string}")
	public void user_clicks_button_using_xpath(String xpath) {
	    
		driver.findElement(By.xpath(xpath)).click();
	}

	@Then("user verify the title of page to be {string}")
	public void user_verify_the_title_of_page_to_be(String expTitle) {
		
		Assert.assertEquals(expTitle, driver.getTitle());
	    
	}
	//io.cucumber.junit.UndefinedStepException: The step 'user verify the presence of text using xpath "//div[@class='auth_error']/b"' is undefined.
	//You can implement this step using the snippet(s) below:

	@Then("user verify the presence of text using xpath {string}")
	public void user_verify_the_presence_of_text_using_xpath(String xpath, DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
		List<Map<String, String>> dataMap=	dataTable.asMaps();
		String actText=driver.findElement(By.xpath(xpath)).getText();
		System.out.println(actText);
		System.out.println(dataMap.get(0).get("erroe message"));
		Assert.assertEquals(dataMap.get(0).get("erroe message"), actText);
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
