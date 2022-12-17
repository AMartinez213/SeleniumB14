package ReviewClass.Class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class RadioButton {
    public static void main(String[] args) {

        //        set the path to the driver to link it with our class    on mac u dont need .exe on windows u need .exe
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        //        create an instance
        WebDriver driver= new ChromeDriver();
//        open the syntax
        driver.get("https://syntaxprojects.com/basic-radiobutton-demo.php");
//     find the radio Button

                List<WebElement> radioBtns = driver.findElements(By.xpath("//input[@name='ageGroup']"));

//        traverse through the list of webElements
        for(WebElement radioBtn:radioBtns){

//            find the desired radio button
            String option = radioBtn.getAttribute("value");

            if(option.equalsIgnoreCase("5 - 15")){
//                click on the radio Btn
                radioBtn.click();

            }

        }

    }

}
