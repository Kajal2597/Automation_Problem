package selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.thread.IThreadWorkerFactory;

public class HandlingPopUp {
    WebDriver driver = new ChromeDriver();
    @Test
    public void alertPopUp () throws InterruptedException {
//        System.setProperty("webdriver.gecko.driver", ".\\driver\\geckodriver.exe");

        //Enter the url
         driver.get("http://www.tizag.com/javascriptT/javascriptprompt.php");
        // find this button : "Say my name"
         driver.findElement(By.xpath("//input[@value='Say my name!']")).click();
        Thread.sleep(2000); //Switch to alert pop up
        Alert alert = driver.switchTo().alert();
         Thread.sleep(2000);
        // print the text present on the alert pop up
        System.out.println(alert.getText());
         Thread.sleep(2000);
        // enter your name in the text box present on the alert pop up
         alert.sendKeys("ajit");
         Thread.sleep(2000);
        // click on OK button
        alert.accept();
         Thread.sleep(2000);
        // print the text present on the second alert pop up
        System.out.println(alert.getText());
        // click on Cancel button
        alert.dismiss();
         }
@Test
public void alert() throws InterruptedException{
             driver.get("https://demoqa.com/alerts");

             WebElement element =driver.findElement(By.id("alertButton"));
             element.click();
            // Thread.sleep(2000);
             Alert alert = driver.switchTo().alert();
             // print the text present on the alert pop up
             System.out.println(alert.getText());
             alert.accept();

         }

    @Test
    public void alertWithSeconds() throws InterruptedException{
        driver.get("https://demoqa.com/alerts");

        WebElement element =driver.findElement(By.id("timerAlertButton"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        Thread.sleep(1000);
        element.click();
        Thread.sleep(6000);
        Alert alert = driver.switchTo().alert();
        // print the text present on the alert pop up
        System.out.println(alert.getText());
        alert.accept();

    }
    @Test
    public void alertWithConfirmBox() throws InterruptedException{
        driver.get("https://demoqa.com/alerts");

        WebElement element =driver.findElement(By.id("confirmButton"));
       ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
//        Thread.sleep(1000);
        element.click();
//        Thread.sleep(6000);
        Alert alert = driver.switchTo().alert();
        // print the text present on the alert pop up
        System.out.println(alert.getText());
       // alert.accept();
        alert.dismiss();
    }

    @Test
    public void alertWithPrompt() throws InterruptedException{
        driver.get("https://demoqa.com/alerts");

        WebElement element =driver.findElement(By.id("promtButton"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
//        Thread.sleep(1000);
        element.click();
         Thread.sleep(6000);
         Alert alert = driver.switchTo().alert();
        // print the text present on the alert pop up
        System.out.println(alert.getText());
        alert.sendKeys("Kajal ");
        Thread.sleep(15000);
        alert.accept();

    }

}
