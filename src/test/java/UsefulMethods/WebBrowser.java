package UsefulMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebBrowser {

	//static String browser;

	public static WebDriver driver;
	String browser;

//	public static WebBrowser(WebDriver driver) {
//
//		this.driver = driver;
//		
//		return driver;
//	}

	public static void openBrowser(String browser) {

	//	this.browser = browser;

		if (browser.equals("Chrome")) {

			driver = new ChromeDriver();

			driver.manage().window().maximize();
		}

		else if (browser.equals("firefox")) {

			driver = new FirefoxDriver();
			driver.manage().window().maximize();
		}

		else {

			driver = new EdgeDriver();
			driver.manage().window().maximize();

		}
	}

	public String openApplication(String baseUrl) {

		driver.get(baseUrl);

		return baseUrl;
	}

}
