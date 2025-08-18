package task2_selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicTextFieldEntry {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        try {
            driver.get("https://www.w3schools.com/html/html_forms.asp");
            
            // Find the first form on the page
            WebElement firstName = driver.findElement(By.name("fname"));
            WebElement lastName = driver.findElement(By.name("lname"));
            
            firstName.sendKeys("John");
            lastName.sendKeys("Doe");
            
            // Submit the form
            WebElement submitButton = driver.findElement(By.xpath("//input[@type='submit']"));
            submitButton.click();
            
            // Validate data appears on new page
            Thread.sleep(2000);
            String pageSource = driver.getPageSource();
            if (pageSource.contains("John") && pageSource.contains("Doe")) {
                System.out.println("Form submission validation PASSED - Data displayed correctly");
            } else {
                System.out.println("Form submission validation FAILED - Data not found");
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}