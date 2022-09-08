package main.SeleniumPractice.SeleniumStudyGuideReview;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Task10_FindAll_Links {

    public static void main(String[] args) {


        WebDriverManager.chromiumdriver().setup();
        WebDriver driver = new ChromeDriver();
//
//        driver.manage().window().maximize();
//
//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//
//        driver.get("https://rahulshettyacademy.com/locatorspractice/");
//
//        List<WebElement> list = driver.findElements(By.tagName("a"));
//
//        System.out.println("list.size() = " + list.size());


        //2- Go to: https://practice.cydeo.com/abtest
        driver.get("https://practice.cydeo.com/abtest");
        // 3- Locate all the links in the page.
        List<WebElement> allLinks = driver.findElements(By.tagName("a"));


        // 4- Print out the number of the links on the page.

        System.out.println(allLinks.size());
        // 5- Print out the texts of the links.

        for ( WebElement each: allLinks) {

            System.out.println("text of link "+ each.getText());
            System.out.println(each.getAttribute("href"));
        }

    }
}
