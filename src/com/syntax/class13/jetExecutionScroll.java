package com.syntax.class13;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class jetExecutionScroll {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver1.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");

//      Scroll Down
        JavascriptExecutor  js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(3000);

//      Scroll Up
        js.executeScript("window.scrollBy(0,500");

    }
}
