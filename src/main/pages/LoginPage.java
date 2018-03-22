package pages;

import core.GeneralActions;
import org.openqa.selenium.By;

import static core.DriverInit.driver;


public class LoginPage extends GeneralActions {
    private static By inputValue = By.xpath("//*[@id=\"lst-ib\"]");
    private static By searchInGoogleButton = By.xpath("//input[@name=\"btnK\"]");

    public static By getInputValue() {
        return inputValue;
    }

    public static By getSearchInGoogleButton() {
        return searchInGoogleButton;
    }
}
