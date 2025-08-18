package task2_selenium;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FormDemo1 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://www.selenium.dev/selenium/web/formPage.html");

        // Email
        WebElement email = driver.findElement(By.xpath("//*[@id='email']"));
        email.sendKeys("alex@gmail.com");

        // Age
        WebElement age = driver.findElement(By.xpath("//*[@id='age']"));
        age.sendKeys("20");

        // Submit form
        driver.findElement(By.xpath("//*[@id='submitButton']")).click();

        // Greeting text
        String response = driver.findElement(By.xpath("//*[@id='greeting']")).getText();
        System.out.println("Response: " + response);

        // Checkbox
        driver.findElement(By.xpath("//*[@id='checky']")).click();

        // Dropdown
        WebElement dd = driver.findElement(By.xpath("/html/body/form[3]/select[1]"));
        Select select = new Select(dd);
        WebElement webEle = select.getFirstSelectedOption();
        System.out.println("Default Selected: " + webEle.getText());

        driver.quit();
    }
}
