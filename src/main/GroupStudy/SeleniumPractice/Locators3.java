package SeleniumPractice;

import dev.failsafe.Timeout;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Locators3 {

    public static void main(String[] args) throws InterruptedException {


        WebDriverManager.chromiumdriver().setup();
        WebDriver driver = new ChromeDriver();


        //driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

//        WebElement firstResult = new WebDriverWait(driver, Duration.ofSeconds(10))
//                .until(ExpectedConditions.elementToBeClickable(By.xpath("//a/h3")));

        String password = getPassword(driver);
        driver.get("https://rahulshettyacademy.com/locatorspractice/");


        //find element with id locator
        driver.findElement(By.id("inputUsername")).sendKeys("Ikram");

        // //find element with name locator
        driver.findElement(By.name("inputPassword")).sendKeys(password);

        //find element with className
        driver.findElement(By.className("signInBtn")).click();

        //WebDriverWait wait = new WebDriverWait(driver, 20);

        //WebDriverWait wait =new WebDriverWait(driver, 5,));

       // WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("")));

        //WebDriverWait wait = new WebDriverWait(driver,  Duration.millis(30));

        System.out.println(driver.findElement(By.tagName("p")).getText());
       // Assert.assertEquals(driver.findElement(By.tagName("p")).getText(),"You are successfully logged in.");


        // Locate element using text WITH XPATH. we can also use * --> //*[text()='Log Out']
        driver.findElement(By.xpath("//button[text()='Log Out']")).click();



    }

    public static String getPassword(WebDriver driver) throws InterruptedException {
        driver.get("https://rahulshettyacademy.com/locatorspractice/");

        driver.findElement(By.linkText("Forgot your password?")).click();

        Thread.sleep(2000);

        driver.findElement(By.cssSelector(".reset-pwd-btn")).click();

        String passwordTest = driver.findElement(By.cssSelector("form p")).getText();

        //Please use temporary password 'rahulshettyacademy' to Login.
        String[] passwordArray = passwordTest.split("'");

        String password = passwordArray[1].split("'")[0];
        return password;



    }
}
