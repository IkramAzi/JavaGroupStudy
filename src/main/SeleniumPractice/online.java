package main.SeleniumPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class online {




        public static String getPageTitle(WebDriver driver) {
            return null;


        }

    public static void main(String[] args) {

        WebDriverManager.chromiumdriver().setup();
        WebDriver driver = new ChromeDriver();

        System.out.println("getPageTitle(driver) = " + getPageTitle(driver));


    }
    }
