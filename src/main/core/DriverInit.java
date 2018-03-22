package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class DriverInit implements Options{
    public static WebDriver driver;

    public static WebDriver initDraver() {

        System.setProperty("webdriver.chrome.driver",
        System.getProperty("user.dir") + "/src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();

        return driver;
    }


    @Override
    public WebDriver getOptionsChromeDriver() {
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        return driver;
    }
}
