package task1_selenium;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://www.google.com");
        try {
            WebElement agreeButton = driver.findElement(By.xpath("//div[contains(text(),'Accept')] | //button[contains(text(),'I agree')]"));
            agreeButton.click();
        } catch (Exception e) {
            System.out.println("No consent popup found");
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Selenium WebDriver");
        searchBox.sendKeys(Keys.RETURN);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        WebElement resultStats = driver.findElement(By.id("result-stats"));
        String statsText = resultStats.getText();
        System.out.println("Search Result Stats: " + statsText);
        driver.quit();
    }
}
}