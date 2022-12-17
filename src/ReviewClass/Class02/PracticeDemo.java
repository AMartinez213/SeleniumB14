package ReviewClass.Class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeDemo {
    public static void main(String[] args) {
        //        set the path to the driver to link it with our class    on mac u dont need .exe on windows u need .exe
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        //        create an instance
        WebDriver driver = new ChromeDriver();
//        open the syntax
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");

        //When user sends in the username Admin
        WebElement userName = driver.findElement(By.id("txtUsername"));

        //send the user name
        userName.sendKeys("Admin");

        WebElement pass = driver.findElement(By.xpath("//input[@id='txtPassword']"));
        pass.sendKeys("12345");

        WebElement btn = driver.findElement(By.xpath("//input[@id='btnLogin']"));
        btn.click();

        WebElement errorMsg = driver.findElement(By.xpath("//span[@id='spanMessage']"));
        String error = errorMsg.getText();
        if(error.equalsIgnoreCase("Invalid credentials")) {
            System.out.println("The correct Error message is there ----> verified ");
        }else{
            System.out.println("The incorrect message is there");

        }
    }
}
