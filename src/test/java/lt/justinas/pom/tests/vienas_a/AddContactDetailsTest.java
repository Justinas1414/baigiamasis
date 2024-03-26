package lt.justinas.pom.tests.vienas_a;

import lt.justinas.pom.pages.Common;
import lt.justinas.pom.pages.vienas_a.AddContactDetailsPage;
import lt.justinas.pom.pages.vienas_a.UserSingInPage;
import lt.justinas.pom.tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AddContactDetailsTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {

        UserSingInPage.open("https://www.1a.lt/users/sign_in");
        UserSingInPage.clickOnButtonAccepCokkies();

    }

    @DataProvider(name = "provideLogInDetailsAndContactDetails")
    public static Object[][] provideLogInDetailsAndContactDetails() {
        return new Object[][]{
                {"sileikajustinas@yahoo.com", "Justas123456789*", "John", "Wick", "69465972", "Vilnius",
                        "Antakalnio g. 59", "10207", "John Wick"}
        };

    }

    @Test(dataProvider = "provideLogInDetailsAndContactDetails")
    public void testContactDetailsTest(String inputEmail, String inputPassword,
                                       String firstname, String lastname,
                                       String number, String city,
                                       String address, String postcode, String expectedResult) {

        String actualResult;

        AddContactDetailsPage.login(inputEmail, inputPassword);
        AddContactDetailsPage.clickOnProfileIcon();
        AddContactDetailsPage.clickOnAddContactInfo();
        AddContactDetailsPage.inputFirstName(firstname);
        AddContactDetailsPage.inputLastName(lastname);
        AddContactDetailsPage.inputNumber(number);
        AddContactDetailsPage.clickOnCityId();
        AddContactDetailsPage.inputCityInformation(city);
        AddContactDetailsPage.clickOnCity();
        AddContactDetailsPage.inputAddress(address);
        AddContactDetailsPage.inputPostalCode(postcode);
        AddContactDetailsPage.clickOnButtonToSaveInfo();

        actualResult = AddContactDetailsPage.readUserNameAndLastName();

        Assert.assertTrue(
                actualResult.contains(expectedResult),
                "\nExpected: %s,\nActual: %s\n".formatted(expectedResult, actualResult)
        );

    }


}
