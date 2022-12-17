package com.syntax.class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver= new ChromeDriver();
        driver.get("https://syntaxprojects.com/javascript-alert-box-demo.php");

        //find the button click me for the alert and click on it
        WebElement simpleAlert = driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']"));
        simpleAlert.click();
        Thread.sleep(1000);

        //Handling the alert
        Alert simpleAlert1=driver.switchTo().alert();
        simpleAlert1.accept();

        //find the button for confirmation alert and click on it
        WebElement confirmationAlert = driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']"));
        confirmationAlert.click();
        Thread.sleep(1000);

        Alert confimationAlert1=driver.switchTo().alert();
        //simpleAlert1.accept();
        simpleAlert1.dismiss();

        WebElement promptAlert = driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']"));
        promptAlert.click();

        //switch the focus to the alert
        Alert prompt1=driver.switchTo().alert();
        prompt1.sendKeys("Abracadabra");
        Thread.sleep(3000);
        prompt1.accept();


    }
}
