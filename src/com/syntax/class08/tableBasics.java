package com.syntax.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class tableBasics {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.manage().window().maximize();

        driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");

        //print the whole table on the console
        WebElement allTable = driver.findElement(By.xpath("//table[@id='customers']"));
        String textAllTable = allTable.getText();
        //System.out.println(textAllTable);

        //print all the rows of the table
        //modification print all the rows which have the company google
        List<WebElement> rows = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
        /*for(WebElement row:rows){
            String rowText=row.getText();
           // System.out.println(rowText);
            //System.out.println("-------------------");
            //modified task: print only the row which has company google
            if(rowText.contains("Google")){
                System.out.println(rowText);
            }*/

        var iterator = rows.listIterator();
        while(iterator.hasNext()){
            var row = iterator.next();
            String text = row.getText();
            if(text.contains("Google")){
                System.out.println(text);
            }

        }

        //print all the individual columns of the table
        List<WebElement> columns = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td"));
        for(WebElement column:columns){
            String columnText = column.getText();
            System.out.println(columnText);
            System.out.println("-----------------------");

        }

    }
}
