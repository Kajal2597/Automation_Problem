package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginPage {

WebDriver driver;
@Test
public void Giva()
{
    driver=new ChromeDriver();
    driver.get("https://www.giva.co/account/login");
    driver.manage().window().maximize();
    driver.findElement(By.id("CustomerEmail")).sendKeys("kajalg2597@gmail.com");
    driver.findElement(By.id("CustomerPassword")).sendKeys("Kajal@2001");
    driver.findElement(By.id("customer_login")).click();

//    String title=driver.getTitle();
//   String source=driver.getPageSource();
//    String url=driver.getCurrentUrl();
//String winhandle=driver.getWindowHandle();
//    System.out.println(winhandle);
//    System.out.println("--------------------------------------------");
//    System.out.println(source);
//    System.out.println("--------------------------------------------");
//    System.out.println(url);
//    System.out.println("--------------------------------------------");

}

}
