package SeleniumPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Dynamic_Dropdowns {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromiumdriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get("https://rahulshettyacademy.com/dropdownsPractise/#"); //URL in the browser

        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();

        Thread.sleep(3000);
        WebElement dynamic = driver.findElement(By.xpath("ctl00_mainContent_ddl_originStation1"));



        Select multiple = new Select(dynamic);


        List<WebElement> list = multiple.getOptions();


        for (WebElement each : list) {
            System.out.println(each.getText());
        }



    }



}


