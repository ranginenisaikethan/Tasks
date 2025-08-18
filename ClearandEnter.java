package task2_selenium;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearandEnter {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        try {
            driver.get("https://www.w3schools.com/html/html_forms.asp");
            
            WebElement firstName = driver.findElement(By.name("fname"));
            WebElement lastName = driver.findElement(By.name("lname"));
            
            firstName.sendKeys("Initial");
            lastName.sendKeys("Value");
            
            firstName.clear();
            lastName.clear();
            
            firstName.sendKeys("Updated");
            lastName.sendKeys("Value");
            
            driver.findElement(By.xpath("//input[@type='submit']")).click();
            
            Thread.sleep(2000);
            String pageSource = driver.getPageSource();
            if (pageSource.contains("Updated") && pageSource.contains("Value")) {
                System.out.println("Clear and update validation PASSED - New values submitted");
            } else {
                System.out.println("Clear and update validation FAILED");
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}
