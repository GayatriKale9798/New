package com.HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A02LoginUsingID {
	//3. open https://www.echotrak.com/Login.aspx?ReturnUrl=%2f
	//Create 3 different classes for login using id, name & className
	public static void main(String[] args) {
	 WebDriver Driver= new ChromeDriver();
	 Driver.get("https://www.echotrak.com/Login.aspx?ReturnUrl=%2f");
	 WebElement CustomerId=Driver.findElement(By.id("txtCustomerID"));
	 CustomerId.sendKeys("Gayatri");
	 WebElement Pass=Driver.findElement(By.id("txtPassword"));
	 Pass.sendKeys("xyz@123");
	 WebElement Login=Driver.findElement(By.id("Butsub"));
	 Login.click();
	 //Driver.close();
	
	
	 

	}

}
