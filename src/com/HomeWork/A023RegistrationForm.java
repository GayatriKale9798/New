package com.HomeWork;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A023RegistrationForm {

	public static void main(String[] args) {
			WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.manage().window().maximize();
			// Registration Form Website
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			WebElement UserName=driver.findElement(By.xpath("//input[@name=\"username\"]"));
			System.out.println("Is First Name Box is enabled?  :"+UserName.isEnabled());
			UserName.sendKeys("Admin");
			driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("admin123");
			driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
			driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a")).click();
			driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[1]/button")).click();
			driver.findElement(By.xpath("//input[@name=\"firstName\"]")).sendKeys("Gayatri");
			driver.findElement(By.xpath("//input[@name=\"middleName\"]")).sendKeys("Shree");
		   driver.findElement(By.xpath("//input[@name=\"lastName\"]")).sendKeys("Kale");
		   driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[2]/div/label/span")).click();
			
			
	}
	

}
