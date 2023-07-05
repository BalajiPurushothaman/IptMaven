package org.Day1.MavenTasks;
import org.openqa.selenium.chrome.*;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.io.*;

import org.openqa.selenium.WebElement;


import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	static WebDriver driver;
	public static void getDriver(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();}
		else if (browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();}}
	
	public static void LaunchUrl(String Url) {
		driver.manage().window().maximize();
		driver.get(Url);
	}
	
	public static void clickonElement(WebElement element) {
		driver.findElement(null).click();
	}
	public static void inputToElement(WebElement element,String value) {
		element.sendKeys(value);
		
	}
	public static void screenshot() throws IOException {
		TakesScreenshot ts= (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\admin\\eclipse-workspace\\IptMaven\\screenshots");
		FileHandler.copy(src, dest);
		
			
	}

}
