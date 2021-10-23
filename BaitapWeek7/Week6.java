package Team2;

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

public class Week6 {

    public static String baseUrl= "http://demo.guru99.com/test/newtours/index.php";
    public static String driverPart = "D:\\\\geckodriver.exe";
    public static WebDriver driver;
    public static String expected = null;
    public static String actual = null;
    @BeforeTest
    public void lauchBrower() {
        System.out.println("launching Firefox brower");
        System.setProperty("webdriver.f.driver", driverPart);
        driver = new FirefoxDriver();
        driver.get(baseUrl);
    }
    @BeforeMethod
    public void HomepageTitle() {
        String expectedTitle = "Welcome: Mercury Tours";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
    }
    @Test(priority = 0)
    public void register() {
        driver.findElement(By.linkText("REGISTER")).click();
        expected = "Register: Mercury Tours";
        actual = driver.getTitle();
        Assert.assertEquals(actual, expected);
    }
    @Test(priority = 1)
    public void support() {
        driver.findElement(By.linkText("SUPPORT")).click();
        expected = "Under Construction: Mercury Tours";
        actual = driver.getTitle();
        Assert.assertEquals(actual, expected);
    }
    @AfterMethod
    public void goBackToHomepage() {
        driver.findElement(By.linkText("Home")).click();
    }
    @AfterTest
    public void terminatoBrowser() {
        driver.close();
    }
}
