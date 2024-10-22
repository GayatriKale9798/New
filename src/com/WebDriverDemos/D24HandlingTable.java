package com.WebDriverDemos;

import java.time.Duration;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/*
 * 1.Display all the table headers
 * 2.display Total Number of rows
 * 3.Display any row random
 */

public class D24HandlingTable {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");
		List<WebElement>headers=driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
		//List<WebElement>headers = driver.findElements(By.tagName("th"));
		for(WebElement h:headers)
			System.out.println(h.getText());
		//2.display Total Number of rows
		List<WebElement>allrows=driver.findElements(By.xpath("/html/body/div[2]/div[4]/table/tbody/tr"));
		System.out.println("Total rows: " + allrows.size());
		//3.Display any row random
		Random rnd = new Random();
		//int n = rnd.nextInt(6);	//This will generage a random number in the range of 0 to 5
		int n = rnd.nextInt(allrows.size());
		System.out.println(n);
		
		System.out.println(allrows.get(n).getText());
		
		System.out.println(driver.findElement(By.xpath("/html/body/div[2]/div[4]/table/tbody/tr[" + (n+1) + "]")).getText());
		
		driver.close();
		

	}

}
