package ReviewClass.Class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ebayDemo {
    public static void main(String[] args) {
        //        set the path to the driver to link it with our class    on mac u dont need .exe on windows u need .exe
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        //        create an instance
        WebDriver driver = new ChromeDriver();
//        open the syntax
        driver.get("https:www.ebay.com");

        //select from the drop down
        WebElement dropDown = driver.findElement(By.xpath("//select[@id='gh-cat']"));

        Select sel=new Select(dropDown);

        sel.selectByValue("58058");

        driver.findElement(By.xpath("//input[@type='submit']")).click();

        //WebElement title = driver.findElement(By.xpath("//title"));
        //String titleText = title.getText();

        String title = driver.getTitle();
        //System.out.println(title);
        if(title.equalsIgnoreCase("Computers, Laptops, Tablets & Network Hardware for Sale - eBay")){
            System.out.println("The title is verified");
        }else{
            System.out.println("The title is incorrect");
        }


    }
}