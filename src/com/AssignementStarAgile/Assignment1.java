package com.AssignementStarAgile;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//1. Write a WebDriver script to navigate to a Website and click on a specific link.
public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {
		//Launching 
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		// myntra website
		driver.get("https://www.myntra.com/");
		System.out.println("Title of First Page"+driver.getTitle());
		
		//navigating from  myntra to amazon
		driver.navigate().to("https://www.amazon.com/");
		System.out.println("Title of 2nd Page"+driver.getTitle());
		
		//clicking of specific link
		Thread.sleep(200);
		driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[3]")).click();
		//System.out.println(driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[5]")).getText());
		

	}

}
