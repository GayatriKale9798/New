package com.HomeWork;
//5. Try login on echotrak site using absolute and relative xpath and display the error message (also using xpath)
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A05EchoEcho {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://echoecho.com/htmlforms09.htm");
	}
}
