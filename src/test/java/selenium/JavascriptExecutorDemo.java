package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JavascriptExecutorDemo {
    @Test
    public void enteringText(){
        WebDriver driver = new ChromeDriver();
//        driver.get("file:///D:\\BridgeLab\\ApiTesting/DisabledTextBox_prog3.html");
        driver.get("C:/Users/prasa/IdeaProjects/Automation-Problem/DisabledTextBox.html");
        //Typecast the driver object to JavascriptExecutor interface type JavascriptExecutor
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js = (JavascriptExecutor) driver;

        // enter "admin" in first textbox using javascript
         js.executeScript("document.getElementById('t1').value='admin'");
        // Thread.sleep(2000); //clear the value in second textbox using javascript
         js.executeScript("document.getElementById('t2').value=''");
        // enter "manager" in second textbox using javascript
         js.executeScript("document.getElementById('t2').value='manager'");
        // change the second text box to button type using Javascript
         js.executeScript("document.getElementById('t2').type='button'");
    }
    @Test
    public  void scrollUpDown() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://giva.co/");
        //typecasting driver object to JavascriptExecutor interface type
        JavascriptExecutor js = (JavascriptExecutor) driver;

        for (int i = 1; i < 5; i++) {
            // scroll down on the webpage
            js.executeScript("window.scrollBy(0, 1000)");
            Thread.sleep(1000);

        }
        for (int i = 1; i < 5; i++) {
            // scroll up on the webpage
            js.executeScript("window.scrollBy(0, -1000)");
            Thread.sleep(1000);
        }
    }
    @Test
    public void scrollDownToSpecificElement() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("http://seleniumhq.org/download");
        //click on the close icon  of the yellow color background pop up
        // driver.findElement(By.id("close")).click();
        // find the Applitools element on the webpage
         WebElement ele = driver.findElement(By.xpath("//i[@class='fab fa-youtube']"));

        // get the X-coordinate and store in a variable
         int x = ele.getLocation().getX();
        // get the Y-coordinate and store in a variable
        int y = ele.getLocation().getY();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        // Scroll to Applitools element’s  x and y coordinate
        js.executeScript("window.scrollBy("+x+", "+y+")");

        Thread.sleep(3000);
        ele.click();
        driver.quit();
    }

    @Test
    public void scrollDownToTheBottomOFPage() throws  InterruptedException{
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.seleniumhq.org/download/");
      //  driver.findElement(By.id("close")).click();
        //select an element which is present at the bottom of the page
        WebElement element = driver.findElement(By.xpath("//i[@class='fab fa-twitter']"));
         int x = element.getLocation().getX(); int y = element.getLocation().getY();
        System.out.println("X coordinate is :"+x + " and Y coordinate is :"+ y);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy("+x+","+y+")");
        Thread.sleep(3000);
        element.click();
        driver.quit();
    }


}
