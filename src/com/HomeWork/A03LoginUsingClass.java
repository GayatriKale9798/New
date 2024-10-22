package com.HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A03LoginUsingClass {

	public static void main(String[] args) {
	WebDriver Driver=new ChromeDriver();
	Driver.get("https://www.echotrak.com/Login.aspx?ReturnUrl=%2f");
	WebElement CustomerId=Driver.findElement(By.className("form-control"));
	CustomerId.sendKeys("Shree");
	//WebElement Pass=Driver.findElement(By.className("form-control"));
	//Here class name is same so aviod the fail we using name locator
	WebElement Pass=Driver.findElement(By.name("txtPassword"));
	 Pass.sendKeys("xyz@123");
	WebElement Login=Driver.findElement(By.className("btn"));
	Login.click();
	
	
	

	}

}
