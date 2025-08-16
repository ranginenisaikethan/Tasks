package task1_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class HelloSelenium {
    public static void main(String[] args) {
    	System.setProperty("webdriver.chrome.driver", "C:\\tools_driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");

        driver.findElement(By.name("q")).sendKeys("Selenium WebDriver");
        driver.findElement(By.name("q")).submit();

        List<WebElement> results = driver.findElements(By.cssSelector("div.g"));
        System.out.println("Number of search results: " + results.size());

        driver.quit();
    }
}
