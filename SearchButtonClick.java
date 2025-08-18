package task2_selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchButtonClick {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        try {
            driver.get("https://www.google.com");
            WebElement searchBox = driver.findElement(By.name("q"));
            searchBox.sendKeys("Selenium WebDriver");
            WebElement searchButton = driver.findElement(By.name("btnK"));
            searchButton.click();
            Thread.sleep(2000);
            String pageSource = driver.getPageSource();
            if (pageSource.contains("Selenium")) {
                System.out.println("Search validation PASSED - Results contain 'Selenium'");
            } else {
                System.out.println("Search validation FAILED - Results do not contain 'Selenium'");
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}