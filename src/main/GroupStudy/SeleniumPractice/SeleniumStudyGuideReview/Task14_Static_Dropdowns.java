package SeleniumPractice.SeleniumStudyGuideReview;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Task14_Static_Dropdowns {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromiumdriver().setup();
        WebDriver driver = new ChromeDriver();

      //   driver.manage().window().maximize();
        Dimension window = new Dimension(520,700);

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.manage().window().setSize(window);

        driver.manage().window().maximize();



        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));

        Select dropdown = new Select(staticDropdown);
        dropdown.selectByIndex(3);
        System.out.println(dropdown.getFirstSelectedOption().getText());

        dropdown.selectByValue("AED");
        System.out.println(dropdown.getFirstSelectedOption().getText());


        driver.findElement(By.id("divpaxinfo")).click();

        int i = 1;
        while(i < 5 ) {
            driver.findElement(By.id("hrefIncAdt")).click();
            i++;

        }
        driver.findElement(By.id("btnclosepaxoption"));


        List<WebElement> list = dropdown.getOptions();

        for (WebElement each : list) {
            System.out.println(each.getText());

        }

        Thread.sleep(3000);
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();

        System.out.println(driver.findElement(By.xpath("//a[starts-with(@value,'P')]")));

        dropdown.getFirstSelectedOption();

        //staticDropdown.findElements(By.xpath("//a[starts-with(@value,'P')]"






    }
}
