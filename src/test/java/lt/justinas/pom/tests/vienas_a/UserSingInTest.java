package lt.justinas.pom.tests.vienas_a;

import lt.justinas.pom.pages.Common;
import lt.justinas.pom.pages.vienas_a.UserSingInPage;
import lt.justinas.pom.tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class UserSingInTest extends TestBase {

    @BeforeMethod
    @Override
    public void setUp() {

        UserSingInPage.open("https://www.1a.lt/users/sign_in");
        UserSingInPage.clickOnButtonAccepCokkies();

    }

    @DataProvider(name = "provideLogInDetails")
    public static Object[][] provideLogInDetails() {
        return new Object[][]{
                {"sileikajustinas@yahoo.com", "Justas123456789*", "John"}
        };

    }

    @Test(dataProvider = "provideLogInDetails")
    public void testVienas_ALogIn(String email, String password, String expectedResult) {

        String actualResult;

        UserSingInPage.inputSingInEmail(email);
        UserSingInPage.inputSingInPassword(password);
        UserSingInPage.clickOnButtonSubmit();
        actualResult = UserSingInPage.readUserNameAfterLogIn();

        Assert.assertTrue(
                actualResult.contains(expectedResult),
                "\nExpected: %s,\nActual: %s\n".formatted(expectedResult, actualResult)
        );

    }

}

