package RahulShettyDropDown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpDatedDropDown {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	driver.findElement(By.id("divpaxinfo")).click();
	Thread.sleep(200);
	
	//int i=1;
//	while(i<5)
//	{
//		driver.findElement(By.id("hrefIncAdt")).click();
//		i++;
//	}
	//for loop
	for(int i=1;i<5;i++)
	{
		driver.findElement(By.id("hrefIncAdt")).click();
	}
		
	driver.findElement(By.id("btnclosepaxoption")).click();
	System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
	}

}
