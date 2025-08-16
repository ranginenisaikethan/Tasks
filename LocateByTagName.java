package task1_selenium;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class LocateByTagName {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        try {
            driver.get("https://opensource-demo.orangehrmlive.com/");
            driver.findElement(By.name("username")).sendKeys("Admin");
            driver.findElement(By.name("password")).sendKeys("admin123");
            driver.findElement(By.xpath("//button[@type='submit']")).click();
            
            Thread.sleep(3000);
            List<WebElement> links = driver.findElements(By.tagName("a"));
            System.out.println("Total hyperlinks found: " + links.size());
            
            for (WebElement link : links) {
                String linkText = link.getText();
                String href = link.getAttribute("href");
                if (!linkText.isEmpty()) {
                    System.out.println("Link Text: " + linkText + " | URL: " + href);
                }
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}