package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchingBrowser {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");
        String URL=driver.getCurrentUrl();
        System.out.println(URL);
        String title=driver.getTitle();
        System.out.println(title);
        driver.quit();
        driver.close();
    }
}
