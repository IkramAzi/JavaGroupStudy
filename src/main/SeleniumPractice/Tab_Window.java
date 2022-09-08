package main.SeleniumPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class Tab_Window {

    public static void main(String[] args) {


        WebDriverManager.chromiumdriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        driver.findElement(By.id("openwindow")).click();

        String handle = driver.getWindowHandle();

        driver.switchTo().window(handle);








    }
}
