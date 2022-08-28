package SeleniumPractice.SeleniumStudyGuideReview;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;

public class Task3_ExplicitWait2Test {

    @Test
    public void waitUntilElementInteractive(){


        WebDriverManager.chromiumdriver().setup();
        WebDriver driver = new ChromeDriver();


        driver.get("http://practice.cybertekschool.com/dynamic_controls");

        // 	elementToBeClickable(By locator)
        // elementToBeClickable(WebElement element)
        // An expectation for checking an element is visible and enabled such that you can click it.


        WebElement inputField = driver.findElement(By.cssSelector("form#input-example>input"));
        System.out.println("inputField.isEnabled() = " + inputField.isEnabled());

        // click on enable button and wait until the inputb=Box is enabled clickable
        driver.findElement(By.xpath("//button[.='Enable']")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        // this will wait for 7 second max for input element located by cssSelector("form#input-example>input")
        // enabled , interactive , visible
        //wait.until( elementToBeClickable(By.cssSelector("form#input-example>input") )  );
        wait.until( elementToBeClickable(inputField) ) ;

        // now enter something into the input filed
        inputField.sendKeys("HELLO WORLD");




    }


}

/*
What is Fluent Wait?
• It will try to find the element again and again until it finds it or until the final timer runs out
• EX: Jquery
• Subtype of explicit wait but you can OVERRIDE the conditions
• Wait<WebDriver>wait = new
• FluentWait <WebDriver> (driver).withTimeout
(5, timeUnit.seconds).pollingEvery(100,timeunit.milliseconds).ignoring(NoSuchEl ementsExceptions.class);
 */
