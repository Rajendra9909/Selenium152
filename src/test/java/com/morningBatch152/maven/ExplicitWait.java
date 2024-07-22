package com.morningBatch152.maven;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://automationexercise.com");

		WebElement LogPage = driver.findElement(By.xpath("//a[@href='/login']"));

		LogPage.click();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));

		WebElement namefield = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("name")));

		namefield.sendKeys("Rajendra Kumar Nayak");

		driver.quit();

	}

}
