package com.WebDriverDemos;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D25HandlingAlert {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demoqa.com/alerts");
		
		Alert alt;
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement btn1=driver.findElement(By.id("alertButton"));
		//predefindcode
		js.executeScript("arguments[0].click()", btn1);
		Thread.sleep(5000);
		alt = driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.accept();
		
		
		
		
		
		
	}

}