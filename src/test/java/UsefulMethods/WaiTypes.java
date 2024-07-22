package UsefulMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaiTypes {

	WebDriver driver;

	public WaiTypes(WebDriver driver) {

		this.driver = driver;
	}

	public WebElement waitForElement(By locator, Duration timeout) {

		WebElement ele = null;

		try {

			System.out.println("Waiting for the max::" + timeout + "seconds for for element to be available ");

			WebDriverWait w = new WebDriverWait(driver, timeout);

			ele = w.until(ExpectedConditions.visibilityOfElementLocated(locator));

			System.out.println("Element appeared on the webpage");

		} catch (Exception e) {

			System.out.println("Element not appeared on the webpage");
		}
		return ele;
	}
	
	public void clickwhenReady(By locator, Duration timeout) {

		try {
			
			WebElement ele = null;

			System.out.println("Waiting for the max::" + timeout + "seconds for for element to be clickable ");

			WebDriverWait w = new WebDriverWait(driver, timeout);

			ele = w.until(ExpectedConditions.elementToBeClickable(locator));
			
			ele.click();

			System.out.println("Element clicked on the webpage");

		} catch (Exception e) {

			System.out.println("Element not clickable on the webpage");
		}
	}
}
