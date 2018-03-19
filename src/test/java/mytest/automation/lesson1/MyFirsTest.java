package mytest.automation.lesson1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public class MyFirsTest {
    public static void main(String[] args) {
        methodCicleFor();
        methodCicleWhile();
//        initDraver();
    }

    public static void methodCicleFor() {
        int i = 0;
        for (i = 0; i < 100; i++) {
            System.out.println("Cicle for " + i);
        }
    }

    public static void methodCicleWhile() {
        int i = 100;
        while (i > 0) {
            System.out.println("Cicle while " + i);
            i--;
        }
    }

    public static void initDraver() {
        System.setProperty("webdriver.chrome.driver",
                new File(MyFirsTest.class.getResource("/chromedriver.exe").getFile()).getPath());

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
    }
}
