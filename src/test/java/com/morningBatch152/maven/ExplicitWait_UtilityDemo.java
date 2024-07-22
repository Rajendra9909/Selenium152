package com.morningBatch152.maven;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import UsefulMethods.WaiTypes;

public class ExplicitWait_UtilityDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://automationexercise.com");

		WebElement LogPage = driver.findElement(By.xpath("//a[@href='/login']"));

		LogPage.click();

		WaiTypes wt = new WaiTypes(driver);

		WebElement pt = wt.waitForElement(By.name("name"), Duration.ofSeconds(3));

		pt.sendKeys("Rajendra Kumar Nayak");

		wt.clickwhenReady(By.xpath("//button[text() = 'Signup']"), Duration.ofSeconds(5));

		driver.quit();

	}

}
