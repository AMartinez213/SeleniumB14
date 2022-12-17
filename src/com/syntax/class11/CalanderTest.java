package com.syntax.class11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class CalanderTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.delta.com/");

        WebElement departbtn = driver.findElement(By.xpath("//span[text()='Depart']"));
        departbtn.click();

        WebElement month = driver.findElement(By.xpath("//span[@class='dl-datepicker-month-0']"));
        var isFound=false;

        while(!isFound) {
            var monthName = month.getText();

            if (monthName.equalsIgnoreCase("January")) {
                List<WebElement> dates = driver.findElements(By.xpath("(//table[@class='dl-datepicker-calendar'])[1]/tbody/tr/td"));
                for (WebElement date : dates) {
                    var currentDate = date.getText();
                    if (currentDate.equalsIgnoreCase("13")) {
                        date.click();
                        break;
                    }
                }
                isFound = true;
            } else {
                WebElement nextbtn = driver.findElement(By.xpath("//span[text()='Next']"));
                nextbtn.click();
            }
        }
    }
}
