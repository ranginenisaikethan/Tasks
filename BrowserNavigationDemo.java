package com.example.locators;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class BrowserNavigationDemo {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));// Open the web form page
        driver.get("https://www.selenium.dev/selenium/web/web-form.html");
        System.out.println("Title: " + driver.getTitle()); // Locate the "Return to index" link using absolute XPath
        WebElement webEle = driver.findElement(By.xpath("/html/body/main/div/form/div/div[3]/a"));
        webEle.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
        System.out.println("Clicked Link");// Navigate back
        driver.navigate().back();driver.navigate().forward();
        System.out.println("After Navigation: " + driver.getTitle());// Navigate back again
        driver.navigate().back();
        driver.navigate().refresh();
        driver.quit();
    }
}
