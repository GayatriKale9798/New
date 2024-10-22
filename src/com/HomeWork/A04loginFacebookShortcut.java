package com.HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//4. Open facebook.com and try login with valid user name and invalid password using className locator and display the error message.
public class A04loginFacebookShortcut {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement EmailId =driver.findElement(By.className("inputtext"));
		EmailId.sendKeys("ankushvankore@gmail.com");
		WebElement Pass =driver.findElement(By.className("_9npi"));
		Pass.sendKeys("abc@123");
		driver.findElement(By.className("_42ft")).click();
		String text = driver.findElement(By.className("_9ay7")).getText();
		
		System.out.println("Error Message: " + text);
		if(text.contains("The password that you've entered is incorrect"))
			System.out.println("Test case pass");
		else
			System.out.println("Test case fail");
		
		//driver.close();
	}

}
