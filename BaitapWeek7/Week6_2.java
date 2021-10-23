package Team2;

import java.util.List;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.BeforeMethod;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

@Listeners(Team2.ListenerTest.class)

public class Week6_2 extends Week6 {
    @Test
    public static void VerifyRegister() {
        WebElement w = driver.findElement(By.xpath("//*[@style= 'margin-left:20px;']/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a"));
        w.click();

        List<WebElement> childElements = driver.findElements(By.xpath("//*[@style='font-family:Arial, Helvetica;font-size:13px;color:#000;padding:5px;']/input"));
        for(int i = 0; i<childElements.size();i++) {
            childElements.get(0).sendKeys("Neko");
            childElements.get(1).sendKeys("Sama");
            childElements.get(2).sendKeys("1234456789");
            childElements.get(3).sendKeys("Nekosama@gmail.com");

            childElements.get(4).sendKeys("21 Le Hong Phong");
            childElements.get(5).sendKeys("TP HCM");
            childElements.get(6).sendKeys("Phuong 10");
            childElements.get(7).sendKeys("132132135135");

            childElements.get(8).sendKeys("Neko123");
            childElements.get(9).sendKeys("Neko123");
            childElements.get(10).sendKeys("Neko123");
            break;
        }

        WebElement submit = driver.findElement(By.xpath("//*[@name='submit']"));
        submit.click();

        System.out.print("Tao thanh cong!");
    }
}
