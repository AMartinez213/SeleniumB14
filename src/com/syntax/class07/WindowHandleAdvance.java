package com.syntax.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowHandleAdvance {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("http://accounts.google.com/signup");

        WebElement helpButton = driver.findElement(By.xpath("//a[text()='Help']"));
        helpButton.click();

        WebElement privacyButton = driver.findElement(By.xpath("//a[text()='Privacy']"));
        privacyButton.click();

        //the title of my desire page is Google Account Help

        //get all the window handles
        Set<String> allHandles = driver.getWindowHandles();


        for(String handle:allHandles){
            //switching the focus to the current handle from the list
            driver.switchTo().window(handle);
            //get the title of the windos to which the driver has switched
            String title = driver.getTitle();
            //compare if the title is of the privacy page
            if(title.equalsIgnoreCase("Google Account Help")){
                System.out.println("The current page under focus is: "+title);
                break;
            }

        }

        //find the community button and click on it
        WebElement communityButton = driver.findElement(By.xpath("//a[text()='Community']"));
        Thread.sleep(2000);
        communityButton.click();

    }
}