package com.syntax.class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static java.util.concurrent.TimeUnit.SECONDS;

public class waitReview {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(20, SECONDS);

        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/dynamic_controls");

        //implicit wait
        driver.manage().timeouts().implicitlyWait(20,SECONDS);

        WebElement button = driver.findElement(By.xpath("//button[text()='Remove']"));
        button.click();

        //get the text
        WebElement text = driver.findElement(By.xpath("//p[@id='message']"));
        System.out.println(text.getText());

        //click enable
        WebElement button2 = driver.findElement(By.xpath("//button[text()='Enable']"));
        button2.click();

        //explicit
        WebDriverWait wait= new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='text']")));

        //send text
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("abracadabra");

    }
}

