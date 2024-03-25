package lt.justinas.pom.tests.vienas_a;

import lt.justinas.pom.pages.Common;
import lt.justinas.pom.pages.vienas_a.ItemPurchasePage;
import lt.justinas.pom.pages.vienas_a.UserSingInPage;
import lt.justinas.pom.tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ItemPurchaseTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {

        UserSingInPage.open("https://www.1a.lt/users/sign_in");
        UserSingInPage.clickOnButtonAccepCokkies();

    }

    @DataProvider(name = "provideLogInDetailsAndItemName")
    public static Object[][] provideLogInDetailsAndItemName() {
        return new Object[][]{
                {"sileikajustinas@yahoo.com", "Justas123456789*", "irklai", "PIRKTI"
                }
        };
    }

    @Test(dataProvider = "provideLogInDetailsAndItemName")
    public void testVienas_AItemPurchase(String inputEmail, String inputPassword,
                                         String inputItemsName, String expectedResult)
    {
        String actualResult;

        ItemPurchasePage.login(inputEmail, inputPassword);
        ItemPurchasePage.addToCart(inputItemsName);
        ItemPurchasePage.clickOnButtonGoToCart();
        ItemPurchasePage.addAdditionalTwoUnitsToCartByDoubleClick();
        ItemPurchasePage.clickOnStartPurchase();
        ItemPurchasePage.clickOnRadioButton();
        ItemPurchasePage.clickOnRadioButtonPickUpPoint();
        ItemPurchasePage.clickOnButtonContinue();
        ItemPurchasePage.clickOnFirstAgreementCheckBox();

        actualResult = ItemPurchasePage.readBuyMessageButton();

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
