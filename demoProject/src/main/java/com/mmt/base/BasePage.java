package com.mmt.base;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


public class BasePage {
	public static WebDriver driver;
	public static Properties config = new Properties();
	public static Properties OR = new Properties();
	public static FileInputStream fis;
	public static WebDriverWait wait;
	public static String browser;
	
/*	
	Step 1: Read the propery file and get the browser (chrome/firefox)
	Step 2: launch the chrome browser
	Step 3: 
		
		*/
	
	@Test
	public void readConfig() {
		try {
			fis = new FileInputStream(System.getProperty("user.dir")+ "./src/test/resources/properties/Config.properties");
			config.load(fis);
			browser = config.getProperty("browser");
			System.out.println(browser);			
		}
		catch (Exception e) {
			System.out.println("Error reading the config property file "+e.getMessage());
		}
	}
	
	
	public void invokeApp() {
		
		if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./src/test/resources/executables/chromedriver.exe");
			driver = new ChromeDriver();
		}
		driver.get(config.getProperty("appURL"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		wait = new WebDriverWait(driver, 5);
	}
	
	public void tearDown() {
		driver.quit();
	}
	
	//common keywords
	
	public static void waitForElement(String locator) {
		try {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(locator)));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locator)));
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	

}
