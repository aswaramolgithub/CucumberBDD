package com.testclasses;

import org.apache.logging.log4j.core.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.*;

import com.utilities.ReadConfig;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	//
       ReadConfig readConfig = new ReadConfig();
 String Url = readConfig.getBaseUrl();
 
 String browser = readConfig.getBrowser();
 
 public static WebDriver driver;
 public static Logger logger;
// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
 
 @BeforeClass
 public void setUp() {
	 WebDriverManager.chromedriver().setup();
	 driver = new ChromeDriver();
 }
 
 //for logging 
   //logger = LogManager.getLogger("");
 @AfterClass
 public void  tearDown() {
	 driver.close();
	 driver.quit();
 }
 
}
