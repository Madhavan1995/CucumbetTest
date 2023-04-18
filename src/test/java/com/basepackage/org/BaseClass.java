package com.basepackage.org;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public static String readProperties (String key) throws IOException {
		File file =new File("C:\\Users\\Madhavan\\eclipse-workspace\\TestLogin\\src\\test\\resources\\credentials.properties");
		FileInputStream fis=new FileInputStream(file);
		Properties prop=new Properties();
		prop.load(fis);
		String value=prop.getProperty(key);	
		return value;		
	}

	public static void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	public static void loadUrl(String url) {
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	public static WebElement findElements(String name) {
		return driver.findElement(By.id(name));
	}
	public static void closeBrowser() {
		driver.close();
	}

}

