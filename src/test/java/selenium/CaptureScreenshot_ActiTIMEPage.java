package selenium;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


import java.io.File;
import java.io.IOException;
import java.sql.Driver;
import java.util.Date;

public class CaptureScreenshot_ActiTIMEPage  {

    public static void main(String[] args) throws IOException {
//Creating an object of Date class
        Date d = new Date();
//Printing the actual date
        String date1 = d.toString();
        System.out.println(date1);
//replacing the colon present in the date timestamp format to "_" using replaceAll()
//method of String class
        String date2 = date1.replaceAll(":", "_");
        System.out.println(date2);

//Enter the url
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.giva.co");
//Typecasting the driver object to TakesScreenshot interface type.
        TakesScreenshot ts = (TakesScreenshot) driver;
//getting the source file using getScreenshotAs() method and storing in a file
        File srcFile = ts.getScreenshotAs(OutputType.FILE);
/*Created a folder called "screenshot" in the project directory
Created another file by concatenating the date value which has "_" in it
(Underscore is the accepted character while creating a file in the project )*/
        // Ensure the 'screenshot' folder exists
        File screenshotDir = new File("C:\\Users\\prasa\\OneDrive\\Desktop\\screenshort");
        if (!screenshotDir.exists()) {
            screenshotDir.mkdir(); // Create the directory if it doesn't exist
        }
        // Specify the destination file path
        File destFile = new File(screenshotDir, date2 + "__actiTIMELoginPage.png");
        // Copying the screenshot to the destination location
        FileHandler.copy(srcFile, destFile);
        System.out.println("Screenshot saved at: " + destFile.getAbsolutePath());
        // Closing the browser
        driver.close();
    }}
