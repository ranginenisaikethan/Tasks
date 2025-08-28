package buttonsandmore;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://jqueryui.com/datepicker/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));

        WebElement ele_frame = driver.findElement(By.className("demo-frame"));
        driver.switchTo().frame(ele_frame);
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));

        WebElement dt_ele = driver.findElement(By.xpath("//*[@id=\"datepicker\"]"));
        dt_ele.click();

        driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[3]/td[5]/a")).click();

        driver.quit();
    }
}
