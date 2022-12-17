package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.today.com/food/national-pasta-day-2022-where-get-free-pasta-deals-t267105/");

    }
}
