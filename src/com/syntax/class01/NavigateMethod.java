package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {
    public static void main(String[] args) throws InterruptedException {
        //Go to Google.com
        //Go to FB.com
        //Go back to Google.com

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        //go to Google.com
        driver.get("https://www.google.com/");
        Thread.sleep(2000);
        //go to facebook.com
        driver.navigate().to("https://www.fb.com/");
        //introduce some sleep which is wait
        //wait or pause for 2000 milliseconds (2 secs)
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        //go forward
        driver.navigate().forward();
        Thread.sleep(2000);
        //refresh the page
        driver.navigate().refresh();
        Thread.sleep(2000);
        driver.quit();



    }

}
