package com.WebDriverDemos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D03ReadURL {
		public static void main(String[] args) {
			String expTitle="Google",actTitle;
			WebDriver Dri =new ChromeDriver();
			Dri.manage().window().maximize();
			Dri.get("https://www.google.co.uk/"); //link of browser
			actTitle=Dri.getTitle();
			if(expTitle.equals(actTitle))
			System.out.println("Opened Google\ntest Case Pass");
			else
				System.out.println("Not opened google \ntest Case Failed");
			Dri.close();
		}

	}


	