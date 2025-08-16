package task1_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class TitleValidation {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        try {
            // Open OrangeHRM demo site
            driver.get("https://opensource-demo.orangehrmlive.com/");
            
            // Login with admin credentials
            WebElement username = driver.findElement(By.name("username"));
            WebElement password = driver.findElement(By.name("password"));
            WebElement loginBtn = driver.findElement(By.xpath("//button[@type='submit']"));
            
            username.sendKeys("Admin");
            password.sendKeys("admin123");
            loginBtn.click();
            
            // Wait for page to load and verify title
            Thread.sleep(3000);
            String actualTitle = driver.getTitle();
            String expectedTitle = "OrangeHRM";
            
            if (actualTitle.equals(expectedTitle)) {
                System.out.println("Title validation PASSED. Title: " + actualTitle);
            } else {
                System.out.println("Title validation FAILED. Expected: " + expectedTitle + 
                                 ", Actual: " + actualTitle);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}