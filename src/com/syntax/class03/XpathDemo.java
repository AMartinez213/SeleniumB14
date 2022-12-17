package com.syntax.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        driver.get("http://facebook.com");

       // driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Abracadabra");

        Thread.sleep(2000);

        //driver.findElement(By.xpath("//a[text()='Forgot password?']")).click();//click forgot password

        //driver.findElement(By.xpath("//button[contains(@type,'sub')]")).click();//click login
        //driver.findElement(By.xpath("//a[contains(text(),'Forgot')]")).click();//click forgot password
        driver.findElement(By.xpath("//input[starts-with(@name,'pa')]")).sendKeys("12345");
    }

}
