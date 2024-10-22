package com.HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A02LoginUsingName {
	//3. open https://www.echotrak.com/Login.aspx?ReturnUrl=%2f
		//Create  login using  name 
	public static void main(String[] args) {
		WebDriver Driver=new ChromeDriver();
		Driver.get("https://www.echotrak.com/Login.aspx?ReturnUrl=%2f");
		 WebElement CustomerId=Driver.findElement(By.name("txtCustomerID"));
		 CustomerId.sendKeys("Gayatri");
		 WebElement Pass=Driver.findElement(By.name("txtPassword"));
		 Pass.sendKeys("xyz@123");
		 WebElement Login=Driver.findElement(By.name("Butsub"));
		 Login.click();
		 //Driver.close();

		
	}

}
