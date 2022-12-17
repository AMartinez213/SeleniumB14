package ReviewClass.Class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Waits {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://syntaxprojects.com/dynamic-elements-loading.php");

        WebElement startbtn = driver.findElement(By.id("startButton"));
        startbtn.click();

        WebElement textElement = driver.findElement(By.xpath("//h4[text()='Welcome Syntax Technologies']"));
        System.out.println(textElement.getText());

        //Explicit waits until the webelement is displayed
        //Explicit waits until the webelement is clickable
        //Explicit waits until the webelement is selected


    }
}
