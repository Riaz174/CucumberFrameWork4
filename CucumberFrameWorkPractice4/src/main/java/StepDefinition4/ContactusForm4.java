package StepDefinition4;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Capstone.CucumberFrameWorkPractice4.feature;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class ContactusForm4 {
	public WebDriver driver;
	@Before
	public void setup() {
		String Path = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\riaz_\\eclipse-workspace\\CucumberFrameWorkPractice4\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://protrainingtech.com");
		driver.manage().window().maximize();
	}
	@Given("^Already opened the protrainingtech\\.com$")
	public void already_opened_the_protrainingtech_com() throws Throwable {
	    String id = driver.getCurrentUrl();
	    System.out.println(id);
	    Assert.assertEquals(id, "https://protrainingtech.com/");
	    
	    
	}

	@When("^user click on contact link$")
	public void user_click_on_contact_link() throws Throwable {
	    feature ob = new feature(driver);
	    ob.ContactLink();
	    
	}

	@Then("^user able to see joinus form$")
	public void user_able_to_see_joinus_form() throws Throwable {
		Thread.sleep(3000);
		feature ob = new feature(driver);
		 WebElement Course = ob.JoinUsText(); 
		 String CourseElementText = Course.getText();
		 System.out.println(CourseElementText);
	    
	}

	@When("^user enters value for First Name \"([^\"]*)\"$")
	public void user_enters_value_for(String arg1) throws Throwable {
		Thread.sleep(3000);
		feature ob = new feature(driver);
		ob.Fname(arg1);
	}
	

	@And("^user enters value for Last Name \"([^\"]*)\"$")
	public void user_enters_value_for_Last_Name(String arg1) throws Throwable {
		Thread.sleep(3000);
		feature ob = new feature(driver);
		ob.Lname(arg1);
	    
	}

	@And("^user enters value for Email \"([^\"]*)\"$")
	public void user_enters_value_for_Email(String arg1) throws Throwable {
		Thread.sleep(3000);
		feature ob = new feature(driver);
		ob.EmailField(arg1);
	}

	@And("^user enters value for Phone number \"([^\"]*)\"$")
	public void user_enters_value_for_Phone_number(String arg1) throws Throwable {
		Thread.sleep(3000);
		feature ob = new feature(driver);
		ob.PhoneField(arg1);
	}


	 @When("^user clicks the Register button$")
	public void user_clicks_the_Register_button() throws Throwable {
		 Thread.sleep(3000);
		 feature ob = new feature(driver);
		 ob.Registrationbutton();
	    
	}

	@Then("^user shall see confirmation message$")
	public void user_shall_see_confirmation_message() throws Throwable {
		Thread.sleep(6000);
		feature ob = new feature(driver);
		WebElement Confirm = ob.Confirm();
		String dt = Confirm.getText();
		System.out.println(dt);
	    
	}


}
