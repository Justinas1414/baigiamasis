package lt.justinas.pom.tests;

import lt.justinas.pom.pages.Common;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class TestBase {
    @BeforeMethod
    public abstract void setUp ();

    @AfterMethod
    public void tearDown(){
        Common.quitChromeDriver();
    }
}
