package SeleniumPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import javafx.util.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Locators {

    public static void main(String[] args) throws InterruptedException {


        WebDriverManager.chromiumdriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get("https://rahulshettyacademy.com/locatorspractice/");


        //find element with id locator
        driver.findElement(By.id("inputUsername")).sendKeys("Ikram");

        // //find element with name locator
        driver.findElement(By.name("inputPassword")).sendKeys("worongPass");

        //find element with className
        driver.findElement(By.className("signInBtn")).click();

        //find element with cssSelector
        System.out.println(driver.findElement(By.cssSelector("p[class='error']")).getText());

        //find element with linkText
        driver.findElement(By.linkText("Forgot your password?")).click();

        Thread.sleep(2000);
        //find element with xpath
        driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Ikram Azim");

        //find element with cssSelector
        driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("Ikram@Azim.com");

        //clear method with xpath
        driver.findElement(By.cssSelector("input[placeholder='Email']")).clear();

        //find by index with xpath
        driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("ikram@azim.com");

        driver.findElement(By.cssSelector("input[placeholder='Email']")).clear();

        //find by index with cssSelector
        driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("ikram@azim.com");

        //find by index with tagName parent to child using xpath (without attributes)
        //body/nav//a
        driver.findElement(By.xpath("//form/input[3]")).sendKeys("2323523543");

        //find by  cssSelector
        driver.findElement(By.cssSelector(".reset-pwd-btn")).click();

        //find by index with tagName parent to child using cssSelector (without attributes)
        System.out.println(driver.findElement(By.cssSelector("form p")).getText());

        Thread.sleep(2000);

        //xpath Parents to child with index
        driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();

        //button#disappearing -> # stands for id -> #disappearing
        driver.findElement(By.cssSelector("#inputUsername")).sendKeys("Ikram");

        //tag[attribute* = ‘some value’] --> Contains with ccsSelectors
        driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");

Thread.sleep(2000);
        driver.findElement(By.id("chkboxOne")).click();

        //tag[contains(@attribute, ‘value’)]  --> Contains with xpath
        driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();


    }
}
