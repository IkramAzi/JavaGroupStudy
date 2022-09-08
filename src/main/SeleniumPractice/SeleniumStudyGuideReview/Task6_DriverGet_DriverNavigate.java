package main.SeleniumPractice.SeleniumStudyGuideReview;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task6_DriverGet_DriverNavigate {

    public static void main(String[] args) {



        WebDriverManager.chromiumdriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        Dimension window = new Dimension(580,620);

        driver.manage().window().setSize(window);

        //will wait for the entire page to load
        driver.get("https://www.google.com/");

        //will not wait for the entire page to load
        driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");

        driver.navigate().back();

        driver.close();

        ///driver.quit();
    }
}
