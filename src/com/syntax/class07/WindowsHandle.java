package com.syntax.class07;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandle {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("http://accounts.google.com/signup");

        //Get window Handle
        String gmailHandle = driver.getWindowHandle();

        //Print
        System.out.println("The handle of the current page is: "+gmailHandle);

        driver.getWindowHandles();





    }
}
