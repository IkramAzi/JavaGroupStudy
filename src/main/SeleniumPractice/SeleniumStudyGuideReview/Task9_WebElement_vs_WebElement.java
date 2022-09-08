package main.SeleniumPractice.SeleniumStudyGuideReview;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Task9_WebElement_vs_WebElement {

    public static void main(String[] args) {


        WebDriverManager.chromiumdriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        List<WebElement> element = driver.findElements(By.xpath("//span[@class='text-label']"));





        for (WebElement each : element) {

            if (each.getText().equals("Holiday Packages")) {
                System.out.println(each.getText());
                break;
            }

        }

        }
    }


