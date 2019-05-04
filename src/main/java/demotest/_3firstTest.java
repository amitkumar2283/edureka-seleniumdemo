package demotest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import org.testng.Assert;

public class _3firstTest {
  @Test
  public void check_URL() throws InterruptedException {
      System.setProperty("webdriver.chrome.driver", "D:\\Training\\Devops\\demo\\selenium\\chromedriver.exe");
      System.out.println( "Hello World!" );
      ChromeOptions options = new ChromeOptions();
      options.addArguments("--headless");
      WebDriver driver = new ChromeDriver();
      driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
      driver.get("http://www.facebook.com");
//      driver.navigate().back();
      String x = driver.getCurrentUrl();
      Assert.assertEquals("https://www.facebook.com/", x);
//      WebElement element = driver.findElement(By.id("u_0_j"));
//      WebElement element = driver.findElement(By.xpath("//input[@name='firstname']"));
//      Thread.sleep(5000);
//      element.sendKeys("Devops");
//      element.submit();
      Thread.sleep(1000);
      driver.quit();

  }
  @Test
  public void check_title() throws InterruptedException {
      System.setProperty("webdriver.chrome.driver", "D:\\Training\\Devops\\demo\\selenium\\chromedriver.exe");
      System.out.println( "Hello World!" );
      ChromeOptions options = new ChromeOptions();
      options.addArguments("--headless");
      WebDriver driver = new ChromeDriver();
      driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
      driver.get("http://www.facebook.com");
//      driver.navigate().back();
      String x = driver.getTitle();
      Assert.assertEquals("facebook", x);
//      WebElement element = driver.findElement(By.id("u_0_j"));
//      WebElement element = driver.findElement(By.xpath("//input[@name='firstname']"));
//      Thread.sleep(5000);
//      element.sendKeys("Devops");
//      element.submit();
      Thread.sleep(1000);
      driver.quit();

  }

}
