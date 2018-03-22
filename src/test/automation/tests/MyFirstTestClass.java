package automation.tests;

import automation.BaseTest;
import core.GeneralActions;
import org.testng.annotations.Test;


public class MyFirstTestClass extends BaseTest {
    @Test
    public static void googleTest() {

        GeneralActions.openSite();
        GeneralActions.inputSomeWord();

    }
}
