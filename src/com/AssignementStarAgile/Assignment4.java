package com.AssignementStarAgile;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
// Implement a test case using WebDriver to validate the functionality of a registration form.
public class Assignment4 {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	// Registration Form Website
	driver.get("https://demo.automationtesting.in/Register.html");
	WebElement FisrtName=driver.findElement(By.xpath("//input[@placeholder=\"First Name\"]"));
	System.out.println("Is First Name Box is enabled?  :"+FisrtName.isEnabled());
	FisrtName.sendKeys("Gayatri");
	
	//Entering Last Name
	WebElement LastName=driver.findElement(By.xpath("//input[@placeholder=\"Last Name\"]"));
	System.out.println("Is First Name Box is enabled?  :"+LastName.isEnabled());
	LastName.sendKeys("Kale");
	
	//Address
	driver.findElement(By.xpath("//textarea[@ng-model=\"Adress\"]")).sendKeys("Pune-14987");
	//Email ID
	driver.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys("GK@gmail.com");
	//PHoneNumber
	driver.findElement(By.xpath("//input[@ng-model=\"Phone\"]")).sendKeys("9876543212");
	//Select Gender Radio Button
	driver.findElement(By.xpath("//input[@value=\"FeMale\"]")).click();
	//selecting by id
	driver.findElement(By.id("checkbox2")).click();
	//dropdown using contains cutomize xpath
	driver.findElement(By.id("msdd")).click();
	driver.findElement(By.xpath("//div[@id=\"msdd\"]/../div[2]/ul/li/a[contains(text(),'Arabic')]")).click();
	//dropdown using Select tag
	Select skills=new Select(driver.findElement(By.id("Skills")));
	skills.selectByVisibleText("Java");
	//Conutry
	Select Conutry1=new Select(driver.findElement(By.id("countries")));
	Conutry1.selectByVisibleText("Australia");
	Select Conutry2=new Select(driver.findElement(By.xpath("//span[@role=\"combobox\"]")));
	Conutry2.selectByVisibleText("Australia");
	//Select Year
	Select Year=new Select(driver.findElement(By.id("yearbox")));
	Year.selectByVisibleText("1998");
	//select Month
	Select Month=new Select(driver.findElement(By.xpath("//select[@type=\"text\"][@placeholder=\"Month\"]")));
	Month.selectByVisibleText("February");
	//Select Day
	Select Day=new Select(driver.findElement(By.id("daybox")));
	Day.selectByVisibleText("25");
	//Enter Password
	driver.findElement(By.id("firstpassword")).sendKeys("ABC@123");
	//Enter confirm Password
	driver.findElement(By.id("secondpassword")).sendKeys("ABC@123");
	//Submit Button using submit method for form
	WebElement SubmitButton=driver.findElement(By.id("submitbtn"));
	System.out.println("Is Submit Button Box is enabled?  :"+SubmitButton.isEnabled());
	SubmitButton.submit();
	
	
	System.out.println("Test Case Passed Succesfully");
	


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
