package ReviewClass.Class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class windowHandles {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("http://accounts.google.com/signup");

        WebElement helpButton = driver.findElement(By.xpath("//a[text()='Help']"));
        helpButton.click();

        WebElement privacyButton = driver.findElement(By.xpath("//a[text()='Privacy']"));
        privacyButton.click();

        String mainPageHandle = driver.getWindowHandle();

        Set<String> allHandles = driver.getWindowHandles();

        for(String handle:allHandles) {
            driver.switchTo().window(handle);
            String URL = driver.getCurrentUrl();

            if (driver.getTitle().equalsIgnoreCase("Google Account Help")){
                break;

            }

        }
        System.out.println("the title of current page is"+driver.getTitle());
        System.out.println("i am here");
        Thread.sleep(2000);
//        find the element comunity and click on it
        WebElement comunityBtn = driver.findElement(By.xpath("//a[text()='Community']"));
        comunityBtn.click();

        driver.switchTo().window(mainPageHandle);
        System.out.println(driver.getTitle());


    }
}
