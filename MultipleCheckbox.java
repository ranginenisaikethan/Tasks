package task2_selenium;

import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleCheckbox {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        try {
            driver.get("https://itera-qa.azurewebsites.net/home/automation");
            
            // Select Monday, Wednesday, Friday
            String[] daysToSelect = {"monday", "wednesday", "friday"};
            
            for (String day : daysToSelect) {
                WebElement checkbox = driver.findElement(By.id(day));
                if (!checkbox.isSelected()) {
                    checkbox.click();
                }
            }
            
            // Validate all three are selected
            boolean allSelected = true;
            for (String day : daysToSelect) {
                WebElement checkbox = driver.findElement(By.id(day));
                if (!checkbox.isSelected()) {
                    allSelected = false;
                    break;
                }
            }
            
            if (allSelected) {
                System.out.println("Multiple checkbox selection PASSED - All selected checkboxes are checked");
            } else {
                System.out.println("Multiple checkbox selection FAILED - Some checkboxes are not selected");
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}