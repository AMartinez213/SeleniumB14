package com.syntax.class08;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class waitsDemo2 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.manage().window().maximize();

        driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");

        WebElement button1 = driver.findElement(By.xpath("//button[@id='alert']"));
        button1.click();

        //because we dont have a webElement associated with the alert in the DOM so there is no purpose of using wait
        //(which waits for the webElement to be found

        WebDriverWait wait=new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.alertIsPresent());

        Alert alert1 = driver.switchTo().alert();
        Thread.sleep(3000);
        alert1.accept();
        driver.close();
    }
}
