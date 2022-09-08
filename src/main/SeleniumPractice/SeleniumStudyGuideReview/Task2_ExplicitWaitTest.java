package main.SeleniumPractice.SeleniumStudyGuideReview;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;

public class Task2_ExplicitWaitTest  {


    @Test
    public void testWaitForTitle(){

        WebDriverManager.chromiumdriver().setup();
        WebDriver driver = new ChromeDriver();

        //1. navigate to http://practice.cybertekschool.com/dynamic_loading
        driver.get(" http://practice.cybertekschool.com/dynamic_loading");
        //2. Click on Example 7
        driver.findElement(By.partialLinkText("Example 7")).click();

        //3. The title will show loading... until certain time ,
        // we want to wait until the title value become "Dynamic Title"
        // this is how we create WebDriverWait object with driver and max time to wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        // then we use until method that accept expected conditions
        // ExpectedConditions helper class has a lot of pre-written conditions
        // for common scenarios, so we don't have to build our own
        // in this case we are checking for title equal Dynamic Title
        //wait.until( ExpectedConditions.titleIs("Dynamic title") );
        // try different condition as below
        // wait until the spongebob image visible on screen
        // visibilityOfElementLocated accept locator as parameter
        // so this means wait 6 second max until the element located by tagName("img")
        // is visible on the screen

        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@alt='square pants']")) ) ;
        // we did static import as below so pur code can be shorter
        // import static org.openqa.selenium.support.ui.ExpectedConditions.*;
        //wait.until( visibilityOfElementLocated(By.xpath("//img[@alt='square pants']")) ) ;

        // the warning area initially hast text of this page is slow wait for 5 seconds..
        // after it load the text of that area become Done!
        // This is one of the ExpectedConditions we can use for waiting

        System.out.println("END");

    }

    @Test
    public void testByTextToBe(){

        WebDriverManager.chromiumdriver().setup();
        WebDriver driver = new ChromeDriver();

        //1. navigate to http://practice.cybertekschool.com/dynamic_loading
        driver.get(" http://practice.cybertekschool.com/dynamic_loading");
        //2. Click on Example 7
        driver.findElement(By.partialLinkText("Example 7")).click();

        WebElement alertArea = driver.findElement(By.id("alert"));
        System.out.println("alertArea.getText() = " + alertArea.getText());


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        // wait for the image show up
        wait.until( visibilityOfElementLocated(By.xpath("//img[@alt='square pants']")) ) ;
        // here we had to re-locate the element because
        // the attributes has changed (colors and stuff) , driver can not find it anymore
        // element is not in the dom anymore error
        alertArea = driver.findElement(By.id("alert"));

        System.out.println("alertArea.getText() = " + alertArea.getText());


    }



}