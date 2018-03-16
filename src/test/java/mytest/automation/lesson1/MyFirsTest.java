package mytest.automation.lesson1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public class MyFirsTest {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver",
                new File(MyFirsTest.class.getResource("/chromedriver.exe").getFile()).getPath());

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
    }
}
