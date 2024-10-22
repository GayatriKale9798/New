package com.HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/*
 * 8. Open https://register.rediff.com/register/register.php?FormName=user_details
	a. Select your birth date
	b. Display this birth date as 
		My Birth Date is 29 JAN 1979
 */
public class A08Rediff {

	public static void main(String[] args) {
		WebDriver Driver=new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		WebElement Bday = Driver.findElement(By.xpath("/html/body/center/form/div/table[2]/tbody/tr[22]/td[3]/select[1]"));
		Select Day = new Select(Bday);
		Day.selectByVisibleText("19");
		System.out.println(Day.getFirstSelectedOption());
		
	}

}
