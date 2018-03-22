package automation;

import core.Options;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

import static core.DriverInit.*;


public class BaseTest {

    @BeforeClass
    public void beforeMethod(){
        driver = initDraver();


    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.manage().deleteAllCookies();
            driver.quit();
        }

    }


}
