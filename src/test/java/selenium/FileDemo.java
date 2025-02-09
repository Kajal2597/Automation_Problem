package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.awt.*;
import java.io.IOException;
import java.util.HashMap;

public class FileDemo {

    WebDriver driver = new ChromeDriver();

    @Test
    public void fileUpload() throws InterruptedException, AWTException {

        driver.get("http://nervgh.github.io/pages/angular-file-upload/examples/simple");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@multiple='']")).sendKeys("C:/Users/prasa/IdeaProjects/Automation-Problem/Selenium Notes.pdf");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@ng-click=\"item.upload()\"]")).click();
        Thread.sleep(2000);
        driver.close();
       }

    @Test
    public void fileUpload1() throws InterruptedException, IOException {
        // Navigate to the file upload page
        driver.get("https://smallpdf.com/pdf-converter");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//span[@class='sc-8s01yt-4 dNifye']")).click();
        Thread.sleep(5000);
        Runtime.getRuntime().exec("\"C:\\Users\\prasa\\IdeaProjects\\Automation-Problem\\fileUpload.exe\"");
        Thread.sleep(5000);
    }
    @Test
    public void fileDownload() throws InterruptedException
    {
        System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
//Create Hashmap object and assign the profile settings 
        HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
        chromePrefs.put("profile.default_content_settings.popups", 0);
        chromePrefs.put("download.default_directory", "D:\\");
//Assign this chromePrefs object with ChromeOptions object  
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs", chromePrefs);
//Create Capability object and assign the option object 
        DesiredCapabilities cap = DesiredCapabilities.chrome();
        cap.setCapability(ChromeOptions.CAPABILITY, options);
        WebDriver driver = new ChromeDriver(cap);
        driver.get("http://www.seleniumhq.org/download/");
        Thread.sleep(3000);
        String xp = "//td[.='Java']/following-sibling::td/a[.='Download']";
        driver.findElement(By.xpath(xp)).click();
    }

    
    }
