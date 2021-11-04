package com.google;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class GoogleTest {
  @Test
  public void f() {
	  public static WebDriver driver;
	  System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chrome/chromedriver.exe");
	  driver = new ChromeDriver();
	  
	  driver.get("https://www.google.com/");
	  driver.manage().windows().maximize();
  }
  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

}
