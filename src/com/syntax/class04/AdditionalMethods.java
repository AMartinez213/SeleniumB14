package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdditionalMethods {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        // create a WebDriver instance
        WebDriver driver= new ChromeDriver();
        //goto syntaxProject.com radio button
        driver.get("https://syntaxprojects.com/basic-radiobutton-demo.php");

        //find the webElement button
        WebElement btn = driver.findElement(By.cssSelector("button#buttoncheck"));

        //get the text from the btn web element
        String text = btn.getText();
        //print on console
        System.out.println(text);

        //get the value of the atrribute "ID" from this webElement
        String idValue=btn.getAttribute("id");
        //print it on the console
        System.out.println("The value of the attribute ID is "+idValue);
    }
}
