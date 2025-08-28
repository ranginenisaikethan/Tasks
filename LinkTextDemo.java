package com.example.locators;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTextDemo {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.selenium.dev/selenium/web/web-form.html");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));

        // Locate the link using full link text and click it
        WebElement link = driver.findElement(By.linkText("Return to index"));
        link.click();

        // Wait a bit for navigation
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));

        // Print the current page title after click
        System.out.println("Page title after clicking link: " + driver.getTitle());

        driver.quit();
    }
}
