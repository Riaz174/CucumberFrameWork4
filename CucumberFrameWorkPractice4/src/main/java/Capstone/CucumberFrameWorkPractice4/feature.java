package Capstone.CucumberFrameWorkPractice4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class feature {
	public WebDriver driver;
	@FindBy(linkText = "Contact") WebElement ContactLink; 
	@FindBy(xpath = "//*[text()='Join us !']") WebElement JoinusText; 
	@FindBy(id = "form-field-name") WebElement Fname;
	@FindBy(id = "form-field-field_6c5f814") WebElement Lname;
	@FindBy(id = "form-field-email") WebElement EmailField;
	@FindBy(id = "form-field-field_694d8a5") WebElement PhoneField;
	@FindBy(xpath = "//*[text()='REGISTER']") WebElement Registerbutton;
	@FindBy(xpath = "//*[text()='The form was sent successfully.']") WebElement Confirmation;
	public feature(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void ContactLink() {
		ContactLink.click();
	}
	public WebElement JoinUsText() {
		return JoinusText;
	}
	public void Fname(String name) {
		Fname.sendKeys(name);
	}
	public void Lname(String name) {
		Lname.sendKeys(name);
	}
	public void EmailField(String email) {
		EmailField.sendKeys(email);
	}
	public void PhoneField(String phone) {
		PhoneField.sendKeys(phone);
	}
	public void Registrationbutton() {
		Registerbutton.click();
	}
	public WebElement Confirm() {
		return Confirmation;
		
	}
	
}
 