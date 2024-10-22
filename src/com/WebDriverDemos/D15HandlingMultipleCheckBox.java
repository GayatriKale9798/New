package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D15HandlingMultipleCheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver Driver=new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		WebElement Checkbox =Driver.findElement(By.xpath("//input[@type=\"checkbox\"]"));
		System.out.println("Before...");
		System.out.println("Selected:"+Checkbox.isSelected());
		if(Checkbox.isSelected()==false)
		{
		Checkbox.click();
		}
		System.out.println("\n After...");
		System.out.println("Selected:"+Checkbox.isSelected());
		
		
	}

}
