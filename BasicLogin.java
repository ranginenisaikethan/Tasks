package task2_selenium;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicLogin {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.selenium.dev/selenium/web/login.html");

        driver.findElement(By.id("username-field")).sendKeys("admin");
        driver.findElement(By.id("password-field")).sendKeys("admin123");
        driver.findElement(By.id("login-form-submit")).click();

        driver.quit();
    }
}
