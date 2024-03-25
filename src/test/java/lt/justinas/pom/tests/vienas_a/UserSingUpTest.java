package lt.justinas.pom.tests.vienas_a;

import lt.justinas.pom.pages.Common;
import lt.justinas.pom.pages.vienas_a.UserSingUpPage;
import lt.justinas.pom.tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class UserSingUpTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        UserSingUpPage.open("https://www.1a.lt/users/sign_up");
        UserSingUpPage.clickOnButtonAccepCokkies();
    }

    @DataProvider
    public static Object[][] provideRegistrationDetails() {
        return new Object[][]{
                {"John", "Wick", "sileikajustinas@yahoo.com", "Justas123456789*", "Netrukus el.paštu gausi " +
                        "paskyros aktyvavimo nuorodą. Sek instrukcijas el.pašte ir aktyvuok savo SMART NET paskyrą."}
        };

    }


    @Test(dataProvider = "provideRegistrationDetails")
    public void testVienas_ARegistration(String firstname, String lastname, String email, String password,
                                         String expectedResult)
    {

        String actualResult;

        UserSingUpPage.inputFirstNameRegistration(firstname);
        UserSingUpPage.inputLastNameRegistration(lastname);
        UserSingUpPage.inputEmailRegistration(email);
        UserSingUpPage.inputPasswordRegistration(password);
        UserSingUpPage.inputPasswordConfirmationRegistration(password);
        UserSingUpPage.clickOnInputButtonSubmit();

        actualResult = UserSingUpPage.readConfirmationTitle();

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

