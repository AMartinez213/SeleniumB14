package com.syntax.class11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class CalanderTest2 {
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
            var monthName=month.getText();
            if(monthName.equalsIgnoreCase("February")){
                List<WebElement> dates = driver.findElements(By.xpath("(//table[@class='dl-datepicker-calendar'])/tbody/tr/td"));
                for(WebElement date:dates){
                    var currentDate=date.getText();
                    if(currentDate.equalsIgnoreCase("20")){
                        date.click();

                        WebElement doneBtn = driver.findElement(By.xpath("//button[text()='done']"));
                        doneBtn.click();
                        break;
                    }
                    }
                isFound=true;
                }
            else{
                WebElement nextBtn = driver.findElement(By.xpath("//span[text()='Next']"));
                nextBtn.click();



            }



        }
    }
}
