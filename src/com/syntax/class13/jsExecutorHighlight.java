package com.syntax.class13;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class jsExecutorHighlight {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");

//        find the webElement username
        WebElement userName=driver.findElement(By.id("txtUsername"));
        userName.sendKeys("Admin");

//        using js Executor
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("arguments[0].style.backgroundColor='pink'",userName);
        js.executeScript("arguments[0].style.border='3px dotted blue'",userName);
        js.executeScript("arguments[0].style.border='6px dotted blue'",userName);
        js.executeScript("arguments[0].style.border='10px dotted blue'",userName);
    }
}
