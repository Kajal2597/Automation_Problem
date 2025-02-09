package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LocatorsExample {
    @Test
    public void allLocators() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
// Enter the URL of your own created sample web page
        driver.get("C:/Users/prasa/IdeaProjects/Automation-Problem/UN.html");
// Used “id” locator to find USERNAME text box
        WebElement unTB = driver.findElement(By.id("username"));
//Clear the existing value present in the text box
        unTB.clear();
// Enter value into the USERNAME text box
        unTB.sendKeys("kajalg2597@gmail.com");
// Used “name” locator to find Password text box
        WebElement passTB = driver.findElement(By.id("password"));
//Clear the existing value present in the text box
        passTB.clear();
//Halt the program execution for 2 seconds
        Thread.sleep(2000);
// Enter value into the Password text box

        passTB.sendKeys("Kajal@2001");
// Find the address of ActiTIME Link and click
        driver.findElement(By.xpath("/html/body/a")).click();
        Thread.sleep(2000);
        
        driver.close();
    }}

