package com.WebDriverDemos;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class D01LaunchingChrome {
	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		//It will launch browser
		driver.get("https://www.google.co.uk/"); //link of browser
		driver.close();

	}

}
