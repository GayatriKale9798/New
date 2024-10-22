package com.HomeWork;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/*
 * Open https://www.redbus.in/
	a. In From Enter first 4 characters of your city (Kolhapur -> Kolh)
	b. Select 1st Option from the list displayed (Take a XPath and click on that)
	c. In To Enter first 4 characters of your city (Banglore -> Ban)
	d. Select 1st Option from the list displayed
	e. Click on Calender icon
	f. Click on Date 30
	g. Click on Search Buses button
	h. Display the name of 1st Bus from the list
 */
public class A09RedBus {

	public static void main(String[] args) {
	WebDriver Driver=new ChromeDriver();
	Driver.manage().window().maximize();
	Driver.get("https://www.redbus.in/");
	WebElement To = Driver.findElement(By.xpath("//*[@id=\"src\"]"));
	To.click();
	To.sendKeys("Pun");
	WebElement dropdownList = Driver.findElement(By.xpath(""));
	Select City = new Select(dropdownList);
	dropdownList.click();
	
	//To city
	Driver.findElement(By.id("input#dest")).sendKeys("Bang");
	Driver.findElement(By.xpath("//*[@id=\"autoSuggestContainer\"]/div/div/div[3]/div[1]/ul/li[1]/div/text")).click();
	
	
	//practice on saturday
	
	
	
	
	
	
	}

}
