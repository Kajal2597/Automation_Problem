package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CssSelectorLocator {
    @Test
    public void cssSelector() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");

        // Login using CSS selectors
        driver.findElement(By.cssSelector("#email")).sendKeys("919763354826");
        driver.findElement(By.cssSelector("#pass")).sendKeys("Sunanda@13");
        driver.findElement(By.cssSelector("button[name='login']")).click();



        //driver.quit();
    }
}
