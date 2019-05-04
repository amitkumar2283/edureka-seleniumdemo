package demotest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import org.testng.Assert;

public class _4TestWithBeforeMethod {
    WebDriver driver;
	  @BeforeMethod
	  public void beforeMethod() {
	      System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	      System.out.println( "Hello World!" );
	      ChromeOptions options = new ChromeOptions();
	      options.addArguments("--headless");
	      driver = new ChromeDriver();
	      driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
	      driver.get("http://www.facebook.com");

	  }
	  @Test
	  public void check_URL() throws InterruptedException {
	      String x = driver.getCurrentUrl();
	      Assert.assertEquals("https://www.facebook.com/", x);
//	      Thread.sleep(1000);
	  }
	  @Test
	  public void check_title() throws InterruptedException {
	      String x = driver.getTitle();
	      Assert.assertEquals("https://www.facebook.com/", x);
//	      Thread.sleep(1000);
	  }

	  @AfterMethod
	  public void afterMethod() {
	      driver.quit();
	}

}
