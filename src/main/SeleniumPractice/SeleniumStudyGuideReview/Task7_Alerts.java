package main.SeleniumPractice.SeleniumStudyGuideReview;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Task7_Alerts {

    public static void main(String[] args) throws InterruptedException {


        WebDriverManager.chromiumdriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        driver.findElement(By.xpath("//input[@placeholder='Enter Your Name']")).sendKeys("Practice");


        driver.findElement(By.xpath("//input[@value='Alert']")).click();

        driver.switchTo().alert().accept();

        Thread.sleep(2000);







    }
}
