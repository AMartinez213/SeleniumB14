package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingElements {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        driver.get("https://www.facebook.com");

        driver.manage().window().maximize();

        driver.findElement(By.id("email")).sendKeys("xxxswwsasa");

        driver.findElement(By.name("pass")).sendKeys("Bob");

      //  driver.findElement(By.name("login")).click();

       // driver.findElement(By.linkText("Forgot password?")).click();

        driver.findElement(By.partialLinkText("Forgot pass")).click();


    }

}
