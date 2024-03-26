package lt.justinas.pom.tests.vienas_a;

import lt.justinas.pom.pages.Common;
import lt.justinas.pom.pages.vienas_a.AddToCartItemPage;
import lt.justinas.pom.pages.vienas_a.UserSingInPage;
import lt.justinas.pom.tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AddToCartItemTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {

        UserSingInPage.open("https://www.1a.lt/users/sign_in");
        UserSingInPage.clickOnButtonAccepCokkies();


    }

    @DataProvider(name = "provideLogInDetailsAndItemPurchaseInfo")
    public static Object[][] provideLogInDetailsAndItemPurchaseInfo() {
        return new Object[][]{
                {"sileikajustinas@yahoo.com", "Justas123456789*", "irklai",
                        "Prekė sėkmingai įdėta į pirkinių krepšelį"}
        };

    }

    @Test(dataProvider = "provideLogInDetailsAndItemPurchaseInfo")
    public void testVienas_AItemAddToCart(String inputEmail, String inputPassword,
                                          String inputItemsName, String expectedResult) {

        String actualResult;

        AddToCartItemPage.login(inputEmail, inputPassword);
        AddToCartItemPage.inputSearchTextItem(inputItemsName);
        AddToCartItemPage.clickOnSelectedItemFromSuggestedList();
        AddToCartItemPage.clickOnAddToCart();
        actualResult = AddToCartItemPage.getConfirmationText();

        Assert.assertTrue(
                actualResult.contains(expectedResult),
                "\nExpected: %s,\nActual: %s\n".formatted(expectedResult, actualResult)
        );

    }


}
