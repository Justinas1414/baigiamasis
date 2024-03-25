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


    public static void clickOnFirstAgreementCheckBox() {
        Common.waitElementPresent(Locators.VienasA.ItemPurchasePage.checkBoxBillingTOS, 8);
        Common.clickOnElement(Locators.VienasA.ItemPurchasePage.checkBoxBillingTOS);

    }


    public static void clickOnButtonContinue() {
        Common.clickOnElement(Locators.VienasA.ItemPurchasePage.buttonMainButtonUpscale);

    }

    public static void clickOnRadioButton() {
        Common.clickOnElement(Locators.VienasA.ItemPurchasePage.radioButtonCheckedNameShippingUnused);

    }

    public static void clickOnRadioButtonPickUpPoint() {
        Common.clickOnElement(Locators.VienasA.ItemPurchasePage.radioButtonPickUpPoint);

    }


    public static String readBuyMessageButton() {
        return Common.getTextFromElement(Locators.VienasA.ItemPurchasePage.readButtonMessage);

    }

}
