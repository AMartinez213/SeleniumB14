package ReviewClass.Class01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basics {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        driver.get("http://facebook.com");

        driver.manage().window().maximize();

        //driver.findElement(By.xpath("//button[@name=\'login']")).click();

        //driver.findElement(By.xpath("//input[@name='email']")).sendKeys("23455");

        driver.findElement(By.xpath("//img[contains(@src,'https://static.xx.fbcdn.net/rsrc.php/v3/yZ/r/C6QZ-pcv3Bd.png')]")).click();

    }
}
