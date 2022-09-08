package main.SeleniumPractice.SeleniumStudyGuideReview;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Task11_CheckBox_RadioBtn {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromiumdriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");


        driver.findElement(By.id("checkBoxOption1")).click();

        if (driver.findElement(By.id("checkBoxOption1")).isSelected()){
            System.out.println("Element is Select");
        }else{
            System.out.println("Element is not selected");
        }

       if (driver.findElement(By.id("displayed-text")).isDisplayed()){
           System.out.println("Element is displayed");
       }else{
           System.out.println("Element is not displayed");
       }

        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@value='radio2']")).click();

        if (driver.findElement(By.xpath("//input[@value='radio2']")).isEnabled()){
            System.out.println("Element is enabled");
        }else{
            System.out.println("Element is not enabled");
        }




        // count all THE CHECKBOXES ON page
        System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());


    }

}
