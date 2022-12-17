package ReviewClass.Class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckBoxes {
    private static WebElement checkboxes;

    public static void main(String[] args) {
        //        set the path to the driver to link it with our class    on mac u dont need .exe on windows u need .exe
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        //        create an instance
        WebDriver driver= new ChromeDriver();
//        open the syntax
        driver.get("https://www.ironspider.ca/forms/checkradio.htm");
//     find the radio Button
        List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@name='color']"));

        for (WebElement checkBx:checkboxes){
            String color = checkBx.getAttribute("value");

            if(color.equalsIgnoreCase("blue")){
                checkBx.click();
                break;
            }
        }

    }
}
