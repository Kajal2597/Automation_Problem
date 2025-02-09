package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;

public class ActionClass {
    @Test
    public void clickUsingActionClass () throws AWTException , InterruptedException {


        WebDriver driver = new ChromeDriver();
        // enter the url
        driver.get("C:\\Users\\prasa\\IdeaProjects\\Automation-Problem\\actionClick.html");
        // find the ActiTIME Inc.
        WebElement link = driver.findElement(By.linkText("actiTIME Inc."));
        // right click (context click) on actitime link
        Actions actions = new Actions(driver);
        actions.contextClick(link).perform();
        Thread.sleep(3000);
        // press 'w' from the keyboard for opening in a new window
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_W);
        r.keyRelease(KeyEvent.VK_W); //quit()
        //method closes all the browsers opened by Selenium
       // driver.quit();
    }

    @Test
    public void dropDownMenuAndMouseHover(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        //find the menu "About Company"
         String xp = "//a[@aria-label='About Us']";
         WebElement menu = driver.findElement(By.xpath(xp));
        // mouse hover on "About Company" menu
         Actions actions = new Actions(driver);
         actions.moveToElement(menu).perform();
        // click on submenu "Basic Facts"
         WebElement submenu = driver.findElement(By.linkText("Advertise"));
         submenu.click();

    }
}
