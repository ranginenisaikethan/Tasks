package task2_selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FormDemo {
    public static void main(String[] args) {
        // Launch browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        // Open sample form page
        driver.get("https://www.selenium.dev/selenium/web/formPage.html");

        // Fill Email
        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("alex@gmail.com");

        // Fill Age
        WebElement age = driver.findElement(By.id("age"));
        age.sendKeys("20");

        // Submit form
        driver.findElement(By.id("submitButton")).click();

        // Capture response
        String response = driver.findElement(By.id("greeting")).getText();
        System.out.println("Response: " + response);

        // Close browser
        driver.quit();
    }
}
