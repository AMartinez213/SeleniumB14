package com.syntax.class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class wetable {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");

        WebElement username = driver.findElement(By.xpath("//input[ @type ='text']"));
        username.sendKeys("admin");

        WebElement password = driver.findElement(By.xpath("//input[ @type ='password']"));
        password.sendKeys("Hum@nhrm123");

        WebElement button = driver.findElement(By.xpath("//input[@type='submit']"));
        button.click();

        WebElement pimButton = driver.findElement(By.xpath("//b[text()='PIM']"));
        pimButton.click();

        WebElement employeeList = driver.findElement(By.xpath("//a[text()='Employee List']"));
        employeeList.click();

        //get a particular ID 44969A and check the checkbox
        List<WebElement> listOfID = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr/td[2]"));

        //traverse
        for (int i=0;i<listOfID.size();i++){
            String id = listOfID.get(i).getText();
            //System.out.println(id); go practice
            if(id.equalsIgnoreCase("44969A")){
                //check the checkbox
                WebElement checkBox = driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr[" + (i+1) + "]/td[1]"));
                checkBox.click();



            }
        }



    }
}