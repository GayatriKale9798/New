package com.TestNGDemos;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class D11POM_Client {
	WebDriver driver;
	RediffLogin r1;
	
  @Test
  public void testLogin() throws InterruptedException {
	  r1.setUserName("Gayatri");
	  r1.clickOnSignInBtn();
	  r1.handleAlert();
  }
  @BeforeTest
  public void beforeTest() {
	  driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		r1=new RediffLogin(driver);
		r1.openSite();
  }

  @AfterTest
  public void afterTest() {
	  r1.tearDown();
  }

}
