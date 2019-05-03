package demotest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/** import org.testng.annotations.Test; */
import org.openqa.selenium.chrome.ChromeOptions;
/**
 * Hello world!
 *
 */
public class _1App 
{
    public static void main( String[] args ) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\Training\\Devops\\demo\\selenium\\chromedriver.exe");
        System.out.println( "Hello World!" );
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
        driver.get("http://www.facebook.com");
//        driver.navigate().back();
        System.out.println(driver.getCurrentUrl());
        WebElement element = driver.findElement(By.id("u_0_j"));
//        WebElement element = driver.findElement(By.xpath("//input[@name='firstname']"));
//        Thread.sleep(5000);
        element.sendKeys("Devops");
//        element.submit();
//        Thread.sleep(5000);
        driver.quit();
    }
}
