package com.TestNGDemos;
/*
 * 26. Open https://www.amazon.in/
	a. Print the title
	b. Click on Sell	
	c. Print the title
	d. Open https://www.amazon.in/
	e. Print the title
	f. Click on Best Sellers
	g. Print the title
	h. Open https://www.amazon.in/
	i. Print the title
	j. Click on Mobile
	k. Print the title
	l. Open https://www.amazon.in/
	m. Print the title
	n. Click on Electronics
	o. Print the title
	p. Close the browser
 */

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Assignment26 {
	WebDriver driver;
	@BeforeTest
	public void LaunchChromeBrowser()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
	}
	@BeforeMethod
	public void LaunchAmazon()
	{
		driver.get("https://www.amazon.in/");
	}
	@Test(priority = 1)
	public void ClickSell() {

		driver.findElement(By.linkText("Sell")).click();
		System.out.println("Title: " + driver.getTitle());

	}
	@Test(priority = 2)
	public void ClickBestSeller()
	{
		driver.findElement(By.linkText("Best Sellers")).click();
	}
	
	@Test(priority = 3)
	public void ClickMobile()
	{
		driver.findElement(By.linkText("Mobiles")).click();
	}
	@Test(priority = 4)
	public void ClickElectronics()
	{
		driver.findElement(By.linkText("Electronics")).click();
		
	}
	@AfterMethod
		public void printTile()
		{
		System.out.println("Title: " + driver.getTitle());
		}
	@AfterTest
	public void CloseBrowser()
	{
		driver.close();
	}
	}
