package com.quora.Test;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utility.Configure;

public class BusinessFlow {
	Configure config = new Configure();
	public static WebDriver driver;

	public void launchBrowser() {
		Configure config = new Configure();
		System.setProperty("webdriver.chrome.driver", config.getChromePath());
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(config.getUrl());
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public void searchFlights() throws Exception {
		driver.findElement(By.id("hp-widget__sfrom")).clear();
		driver.findElement(By.id("hp-widget__sfrom")).sendKeys(config.getFrom());
		driver.findElement(By.id("hp-widget__sTo")).sendKeys(config.toFly());
		driver.findElement(By.id("searchBtn")).click();
	}

	public void getText() {
		
	 String text=driver.findElement(By.xpath("//p[contains(text(),'Bangalore to New Delhi - ')]")).getText();
	 System.out.println(text);

	}

	public void closeallBrowsers() {
		driver.quit();
	}

}
