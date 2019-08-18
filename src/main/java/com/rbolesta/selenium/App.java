package com.rbolesta.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class App {
	
	private final static String CHROME_DRIVER_PATH = "/Users/ryanbolesta/Projects/chromedriver";
	private final static String GMAIL_URL = "http://www.gmail.com/";
    
	public static void main( String[] args ) throws InterruptedException {
  	  	System.setProperty("webdriver.chrome.driver", CHROME_DRIVER_PATH);
		WebDriver driver = new ChromeDriver();
		driver.get(GMAIL_URL);
		driver.manage().window().maximize();
		driver.findElement(By.id("identifierId")).sendKeys("sid.aka.ryanb90@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.className("CwaK9")).click();
		Thread.sleep(2000);
		String at = driver.getTitle();
		String et = "gmail";
		driver.close();
		if(at.equalsIgnoreCase(et)) {
			System.out.println("Test Successful");
		} else {
			System.out.println("Test Failure");
		}
    }
}
