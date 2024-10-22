package com.WebDriverDemos;
//Tc: Open Facebook,enter valid email id,invalid pass,click on login button,error massage should be display.

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D05LocateByName {

	public static void main(String[] args) {
		WebDriver Dri =new ChromeDriver();
		Dri.manage().window().maximize();
		Dri.get("https://www.facebook.com/");
		
		WebElement emailid= Dri.findElement(By.name("email"));
		emailid.sendKeys("ankushvankore@gmail.com");
		WebElement Pass=Dri.findElement(By.name("pass"));
		Pass.sendKeys("abc@123");
		WebElement Login= Dri.findElement(By.name("login"));
		Login.click();
		//Dri.close();
	}

}
