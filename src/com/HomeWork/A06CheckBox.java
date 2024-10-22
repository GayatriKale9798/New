package com.HomeWork;
/*
 * 6. open https://echoecho.com/htmlforms09.htm 

	a. Display the status all checkboxes (Selected, Enabled, Visible)
	b. Select the checkbox which are not selected
	c. Display the status (Selected, Enabled, Visible)
	https://echoecho.com/htmlforms09.htm
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A06CheckBox {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://echoecho.com/htmlforms09.htm");
		
		//input[type="checkbox"][value="Milk"]

	}

}
