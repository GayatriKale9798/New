package com.HomeWork;
//TC:2. Open facebook.com and try login with valid user name and invalid password using className locator
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A01FaceBookLoginByClassName {

	public static void main(String[] args) {
			WebDriver driver =new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/");
			WebElement EmailId =driver.findElement(By.className("inputtext"));
			EmailId.sendKeys("ankushvankore@gmail.com");
			WebElement Pass =driver.findElement(By.className("_9npi"));
			Pass.sendKeys("abc@123");
			WebElement Login=driver.findElement(By.className("_42ft"));
			Login.click();
			
	
			

}
}