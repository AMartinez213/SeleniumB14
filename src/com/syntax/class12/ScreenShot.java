package com.syntax.class12;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class ScreenShot {
    public static void main(String[] args) throws InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        driver.manage().window().maximize();

        WebElement userName= driver.findElement(By.xpath("//input[@name='ctl00$MainContent$username']"));
        userName.sendKeys("Tester", Keys.TAB);


        WebElement pass= driver.findElement(By.xpath("//input[@name='ctl00$MainContent$password']"));
        pass.sendKeys("test", Keys.ENTER);

//        takescreenshot
        TakesScreenshot ss= (TakesScreenshot)driver;
//        screenshot is taken at this point
        File sourceFile = ss.getScreenshotAs(OutputType.FILE);
//        save the file from your variable into the location into your computer
        FileUtils.copyFile(sourceFile,new File("screenshots/SmartBear/abc.png"));

    }
}


