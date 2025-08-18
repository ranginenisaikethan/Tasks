package task2_selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SingleCheckbox{
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        try {
            driver.get("https://itera-qa.azurewebsites.net/home/automation");
            
            WebElement mondayCheckbox = driver.findElement(By.id("monday"));
           
            if (!mondayCheckbox.isSelected()) {
                mondayCheckbox.click();
            }
            
            // Validate selection
            if (mondayCheckbox.isSelected()) {
                System.out.println("Monday checkbox selection PASSED - isSelected() returns true");
            } else {
                System.out.println("Monday checkbox selection FAILED - isSelected() returns false");
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}