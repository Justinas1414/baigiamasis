package lt.justinas.pom.pages.vienas_a;

import lt.justinas.pom.pages.Common;
import lt.justinas.pom.pages.Locators;

public class ItemPurchasePage {

    public static void login(String inputEmail, String inputPassword) {
        UserSingInPage.inputSingInEmail(inputEmail);
        UserSingInPage.inputSingInPassword(inputPassword);
        UserSingInPage.clickOnButtonSubmit();

    }

    public static void addToCart(String inputItemsName) {
        AddToCartItemPage.inputSearchTextItem(inputItemsName);
        AddToCartItemPage.clickOnSelectedItemFromSuggestedList();
        AddToCartItemPage.clickOnAddToCart();

    }

    public static void clickOnButtonGoToCart() {
        Common.clickOnElement(Locators.VienasA.ItemPurchasePage.buttonMain);

    }

    public static void addAdditionalTwoUnitsToCartByDoubleClick() {
        Common.doubleClickOnElementByAction(Locators.VienasA.ItemPurchasePage.linkIncQuantity);

    }

    public static void clickOnStartPurchase() {
        Common.clickOnElement(Locators.VienasA.ItemPurchasePage.buttonOnDataDisableWithButton);

    }

    public static void doubleClickOnRadioButtonShipping() {
        Common.waitElementVisible(Locators.VienasA.ItemPurchasePage.radioButtonPickUpPoint, 5);
        Common.doubleClickOnElementByAction(Locators.VienasA.ItemPurchasePage.radioButtonPickUpPoint);

    }

    public static String readButtonContinue() {
        return Common.getTextFromElement(Locators.VienasA.ItemPurchasePage.buttonMainUpcaseFrSmallRadiusCheckoutShippingContinue);
    }
}
