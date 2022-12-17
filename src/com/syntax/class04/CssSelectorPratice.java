package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorPratice {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        driver.get("https://syntaxprojects.com/basic-first-form-demo.php");

        //Get the webElement text box
        //driver.findElement(By.cssSelector("input[placeholder*='Please enter your Message']")).sendKeys("Hello");

        //another method of doing the abouve operation
        WebElement textBox = driver.findElement(By.cssSelector("input[placeholder*='Please enter your Message']"));
        textBox.sendKeys("Jello");

        WebElement button = driver.findElement(By.cssSelector("button[onclick='showInput();']"));
        button.click();

    }
}
