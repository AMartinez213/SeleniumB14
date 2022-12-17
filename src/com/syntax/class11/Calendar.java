package com.syntax.class11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Calendar {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.delta.com/");

        //click on the calendar
        WebElement calander = driver.findElement(By.xpath("//span[text()='Depart']"));
        calander.click();

        WebElement month = driver.findElement(By.xpath("//span[@class='dl-datepicker-month-0']"));
        boolean isFound=false;

        while(!isFound){
            String monthName = month.getText();

            if(monthName.equalsIgnoreCase("March")){
                List<WebElement> dates = driver.findElements(By.xpath("(//table[@class='dl-datepicker-calendar'])[1]/tbody/tr/td"));
                for(WebElement date:dates){
                    String currentDate = date.getText();
                    if(currentDate.equalsIgnoreCase("10")){
                        date.click();
                        break;
                    }
                }
                //System.out.println("I have found the desired month:"+monthName); check if codes works up to this point
                isFound=true;

            }else{
                WebElement nextbtn = driver.findElement(By.xpath("//span[text()='Next']"));
                nextbtn.click();

            }
        }
    }
}
