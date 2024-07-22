package com.morningBatch152.maven;

import java.time.Duration;

import UsefulMethods.WebBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ImplicitWait extends WebBrowser {

	// static WebDriver driver;

	static WebBrowser br;

	public static void main(String[] args) {

		// driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

		/*
		 * In selenium 4 series, the syntax for TimeUnit is deprecated and the following
		 * syntax is used
		 */

//		WebDriver driver = new ChromeDriver();
//		
//		driver.manage().window().maximize();
//
//		driver.get("https://automationexercise.com");

		br = new WebBrowser();

		WebBrowser.openBrowser("Chrome");

		String baseUrl = "https://automationexercise.com";
		br.openApplication(baseUrl);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
//		
		WebElement LogPage = driver.findElement(By.xpath("//a[@href='/login']"));

		LogPage.click();

		driver.findElement(By.xpath("//input[@name = 'name']")).sendKeys("Rajendra Kumar Nayak");

		driver.quit();

	}

}
