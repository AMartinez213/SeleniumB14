package ReviewClass.Class03;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Alerts {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/alerts");
        driver.manage().window().maximize();

        WebElement alertBtn1 = driver.findElement(By.xpath("//button[@id='alertButton']"));
        alertBtn1.click();
        Thread.sleep(2000);

        Alert alertHandler = driver.switchTo().alert();
        alertHandler.accept();

        WebElement alertBtn3 = driver.findElement(By.xpath("//button[@id='promtButton']"));
        alertBtn3.click();
        Thread.sleep(2000);

        alertHandler.sendKeys("abracadabra");
        alertHandler.accept();

    }
}
