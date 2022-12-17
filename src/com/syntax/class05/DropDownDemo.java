package com.syntax.class05;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownDemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        // create a WebDriver instance
        WebDriver driver = new ChromeDriver();
        //goto syntaxProject.com radio button
        driver.get("https://syntaxprojects.com/basic-radiobutton-demo.php");


    }
}