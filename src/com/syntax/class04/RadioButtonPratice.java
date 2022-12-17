package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonPratice {
    public static void main(String[] args) {
        //set the path to the driver to link it with our class    on mac u dont need .exe on windows u need .exe
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        //create an instance
        WebDriver driver= new ChromeDriver();
        //open the syntax
        driver.get("https://syntaxprojects.com/basic-radiobutton-demo.php");
        //find the radio Button
        WebElement maleRadioBtn = driver.findElement(By.xpath("//input[@name='optradio' and @value='Male']"));
        //check if the radio btn is displayed
        boolean displayStatus = maleRadioBtn.isDisplayed();
        //print the display status
        System.out.println("The radio button is displayed: "+displayStatus);
        //check whether the male radio button is enabled
        boolean enableStatus = maleRadioBtn.isEnabled();
        System.out.println("The male radio button is enabled: "+enableStatus);
        //check whether the radio button male is selected
        boolean selectStatus = maleRadioBtn.isSelected();
        System.out.println("The male radio button is selected: "+selectStatus);
        //check if the male radio button is not selected then click on it
        if(!selectStatus){
            //perform a click operation on the radio button
            maleRadioBtn.click();
        }
        selectStatus=maleRadioBtn.isSelected();
        System.out.println("The radio button is selected: "+selectStatus);
    }
}
