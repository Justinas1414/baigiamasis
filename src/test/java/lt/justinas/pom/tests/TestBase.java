package lt.justinas.pom.tests;

import lt.justinas.pom.pages.Common;
import lt.justinas.pom.utils.TestListner;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;


@Listeners(TestListner.class)
public abstract class TestBase {
    @BeforeMethod
    public abstract void setUp();

    @AfterMethod
    public void tearDown() {
        Common.quitChromeDriver();
    }
}
