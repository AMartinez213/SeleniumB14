package com.syntax.class01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaximizeWindow {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        //go to Google
        driver.get("https://www.espn.com/");
        //maximize
        driver.manage().window().maximize();
        //fullscreen
        driver.manage().window().fullscreen();
        Thread.sleep(10000);
        driver.quit();
        driver.findElement(By.id("name")).sendKeys("Allan");

    }
}
