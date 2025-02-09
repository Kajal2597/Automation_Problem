package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;

public class Keyboard_Mouse_Operations {

    public static void main(String[] args) throws InterruptedException, AWTException {
        //  System.setProperty("webdriver.gecko.driver", ".\\driver\\geckodriver.exe");
//1. Launch the browser
        WebDriver driver = new ChromeDriver();
//2. enter the url -
        driver.navigate().to("https://www.giva.co");
        driver.manage().window().maximize();
//        Thread.sleep(5000);
//Creating an object of Robot Class
        Robot r = new Robot();
//move the mouse by x and y coordinate
        r.mouseMove(300, 500);

////press ALT key from keyboard
//        r.keyPress(KeyEvent.VK_ALT);
//
//        //Release F key from keyboard
        r.keyRelease(KeyEvent.VK_ALT);

//press F key from keyboard
        r.keyPress(KeyEvent.VK_F);


////Release Alt key from keyboard
        r.keyRelease(KeyEvent.VK_ALT);

        Thread.sleep(3000);

//Press Ctrl+Shift+N key from keyboard to open a new private window

        r.keyPress(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_SHIFT);
        r.keyPress(KeyEvent.VK_N);

        // r.keyPress(KeyEvent.VK_W);

////Release W key from keyboard
//        r.keyRelease(KeyEvent.VK_W);

// It will close only the current browser window
        driver.close();
// It will close all the browser windows opened by Selenium
        driver.quit();
    }}
