package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D08LocateByCssSelector {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement Emailid=driver.findElement(By.cssSelector("input[data-testid='royal_email']"));
		Emailid.sendKeys("ankushvankore@gmail.com");
		WebElement Password=driver.findElement(By.cssSelector("input[type='password'][id='pass']"));
		Password.sendKeys("123456");
		WebElement Loginbtn=driver.findElement(By.cssSelector("button[value='1']"));
		Loginbtn.click();

	}

}
