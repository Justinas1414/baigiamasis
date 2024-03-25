package lt.justinas.pom.tests.vienas_a;

import lt.justinas.pom.pages.Common;
import lt.justinas.pom.pages.vienas_a.UserAccountDeletionPage;
import lt.justinas.pom.pages.vienas_a.UserSingInPage;
import lt.justinas.pom.tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class UserAccountDeletionTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        UserSingInPage.open("https://www.1a.lt/users/sign_in");
        UserSingInPage.clickOnButtonAccepCokkies();
    }

    @DataProvider(name = "provideLogInAndDeleteAccountDetails")
    public static Object[][] provideLogInAndDeleteAccountDetails() {
        return new Object[][]{
                {"sileikajustinas@yahoo.com", "Justas123456789*", "Registruotis"}
        };

    }

    @Test(dataProvider = "provideLogInAndDeleteAccountDetails")
    public void testVienas_AAcountDeletion(String inputEmail, String inputPassword, String expectedResult)
    {

        String actualResult;

        UserAccountDeletionPage.login(inputEmail, inputPassword);
        UserAccountDeletionPage.clickOnUserBlockLoggegIn();
        UserAccountDeletionPage.ClickOnDeleteAccountButton();
        UserAccountDeletionPage.clickOkOnAlert();
        UserAccountDeletionPage.writeTextToAlert(inputEmail);
        UserAccountDeletionPage.clickOkOnAlert();

        actualResult = UserAccountDeletionPage.getTextFromMainPageToLogIn();

        Assert.assertTrue(
                actualResult.contains(expectedResult),
                "\nExpected: %s,\nActual: %s\n".formatted(expectedResult, actualResult)
        );

    }

    @AfterMethod
    public void tearDown() {
        Common.quitChromeDriver();
    }

}
