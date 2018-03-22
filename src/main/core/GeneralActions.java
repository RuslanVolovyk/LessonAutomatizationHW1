package core;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.LoginPage;

import static core.DriverInit.driver;

public class GeneralActions {
    static WebDriverWait wait = new WebDriverWait(driver, 5);

    public static void openSite() {
        driver.get(Utils.getURL());
    }
    public static void inputSomeWord() {
        driver.findElement(LoginPage.getInputValue()).sendKeys("fdf");
        driver.findElement(LoginPage.getInputValue()).submit();


    }
}
