package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RegisterPage {

    WebDriver driver;
    @Test
    public void GivaRegister() {
        driver = new ChromeDriver();
        driver.get("https://www.giva.co/account/register");
driver.findElement(By.name("customer[first_name]")).sendKeys("kiran");

//        driver.findElements(By.name("customer[first_name]")).set(1,customer[first_name]);
driver.findElement(By.name("customer[last_name]")).sendKeys("Kurhade");
driver.findElement(By.name("customer[email]")).sendKeys("kiran12kurhade@gmail.com");
driver.findElement(By.name("customer[password]")).sendKeys("Kiran@2001");
driver.findElement(By.xpath("//button[normalize-space()='Create Account']")).click();

    }

}
