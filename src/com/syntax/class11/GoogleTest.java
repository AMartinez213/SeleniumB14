package com.syntax.class11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class GoogleTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");

        WebElement textBox = driver.findElement(By.xpath("//input[@class='gLFyf']"));
        textBox.sendKeys("Chiefs Box Score");

        WebElement searchBtn = driver.findElement(By.xpath("//input[@class='gNO89b']"));
        searchBtn.click();

        WebElement boxScore = driver.findElement(By.xpath("//th[@class='imso_scr_sum__rft-cell imso_scr_sum__nm-cell']"));
        boxScore.click();

        WebElement chargersBoxScore = driver.findElement(By.xpath("//li[text()='Chargers']"));
        chargersBoxScore.click();

        WebElement justinHerbert = driver.findElement(By.xpath("//div[text()='Justin Herbert']"));
        justinHerbert.click();

    }
}
