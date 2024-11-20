package org.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Properties;

import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
	
	public static WebDriver driver;
	public static String orderNumber;
	
	
	public static void BorwserLaunch() {
		// TODO Auto-generated method stub
		
		 driver = new ChromeDriver();

	}
	
	public static void getUrl(String url) {
		driver.get(url);
	}

	public void maximizeWindow() {
		driver.manage().window().maximize();
	}
	
	public void implicitWait() {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}

	public static void elementSendKeys(WebElement element, String data) {
		element.sendKeys(data);
	}

	public static void elementClick(WebElement element) {
		element.click();
	}
	
	public static String elementGetText(WebElement element) {
		visibilityOfElements(element);
		String text = element.getText().trim();
		return text;
	}
	public static void visibilityOfElements(WebElement element) {
		WebDriverWait driverwait = new WebDriverWait(driver, Duration.ofSeconds(30));
		driverwait.until(ExpectedConditions.visibilityOf(element));
	}
	public String getProjectPath() {
		return System.getProperty("user.dir");
	}

	public String getPropertyFileValue(String key) throws FileNotFoundException, IOException {
		
		Properties properties = new Properties();
		//properties.load(new FileInputStream(getProjectPath() + "\\Config\\config.properties"));
		properties.load(new FileInputStream("C:\\Users\\Kulasekaran\\eclipse-workspace\\Adactin_hotel\\Config\\config.properties"));
		
		Object object = properties.get(key);
		String value = (String) object;
		return value;
	}

	public static void getDriver(String browserType) {

		switch (browserType) {
		case "CHROME":
			driver = new ChromeDriver();
			break;
		case "IE":
			driver = new InternetExplorerDriver();
			break;
		default:
			break;
		}

	}
	
	public static void selectOptionByText(WebElement element, String value) {
		Select s = new Select(element);
		s.selectByVisibleText(value);

	}
	
//	public static String getSelected(WebElement element,String text) {
//
//		Select s = new Select(element);
//		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
//		for (WebElement webElement : allSelectedOptions) {
//			
//			String text2 = webElement.getText();
//			if (text2==text) {
//				
//				Assert.assertTrue(true);
//				
//			}
//		}
//		return text;
//	}

	public static void selectOptionByAttributeValue(WebElement element, String value) {
		Select s = new Select(element);
		s.selectByValue(value);

	}
	public static String getattributevalue(WebElement element,String attributeName) {

		String attribute = element.getAttribute(attributeName);
		return attribute;
	}

	public static void selectOptionByIndex(WebElement element, int value) {
		Select s = new Select(element);
		s.selectByIndex(value);
	}
	
	public void clearText(WebElement element) {
		element.clear();
	}
	
	public byte[] screenshot() {
		TakesScreenshot sc =(TakesScreenshot) driver;
		byte[] bs = sc.getScreenshotAs(OutputType.BYTES);
		return bs;
	}
	
	public void closeWindow(){
		driver.quit();
	}

}
