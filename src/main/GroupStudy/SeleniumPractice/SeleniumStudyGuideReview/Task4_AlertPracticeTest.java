package SeleniumPractice.SeleniumStudyGuideReview;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task4_AlertPracticeTest  {

    // JavaScript alerts are pop up that show up after you click on button
    // in certain pages , and there are 3 types of pop-up
    // regular(ok),  only click on ok
    // confirm(ok and cancel)
    // prompt(enter text) and select ok and cancel
    @Test
    public void testJavaScriptAlert(){

        WebDriverManager.chromiumdriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://practice.cybertekschool.com/javascript_alerts");

        // Alert interface from Selenium is used to deal with alters
        // your driver object can switchTo the alert and take action on it

        driver.findElement(By.xpath("//button[.='Click for JS Alert']")).click();
        // driver first need to switch to the alert box since it's not part of html
        // using switchTo() method followed by alert() method
        // .alert() method return a type Alert from Selenium
        // and it has 4 methods :
        // - accept()   -->> click on ok button
        // - dismiss()  -->> click on cancel button
        // - sendKey(yourText) ---> Enter text into prompt
        // - getText()   --->> get the text of the alert box

        System.out.println("getting the text of alert" + driver.switchTo().alert().getText()   );
        driver.switchTo().alert().accept();
//        Alert alertObj =  driver.switchTo().alert() ;
//        alertObj.accept();

        driver.findElement(By.xpath("//button[.='Click for JS Confirm']")).click();

        //driver.switchTo().alert().dismiss(); // this will click on dismiss button on the confirmation box
        driver.switchTo().alert().accept(); // this will click on dismiss button on the confirmation box

        driver.findElement(By.xpath("//button[.='Click for JS Prompt']")).click();

        driver.switchTo().alert().sendKeys("Hello"); // this is how we can enter text into prompt
        driver.switchTo().alert().accept(); // click ok



        System.out.println("THE END");

    }


}