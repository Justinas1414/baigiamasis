package lt.justinas.pom.pages.vienas_a;

import lt.justinas.pom.pages.Common;
import lt.justinas.pom.pages.Locators;

public class AddToCartItemPage {

    public static void inputSearchTextItem(String item) {
        Common.sendKeysToElement(Locators.VienasA.AddToCartItemPage.inputPlaceholderTextOfAnItem, item);

    }

    public static void clickOnSelectedItemFromSuggestedList() {
        Common.waitElementVisible(Locators.VienasA.AddToCartItemPage.buttonSnSuggestDocTittleSnIsOnline, 5);
        Common.clickOnElement(Locators.VienasA.AddToCartItemPage.buttonSnSuggestDocTittleSnIsOnline);

    }

    public static void clickOnAddToCart() {
        Common.clickOnElement(Locators.VienasA.AddToCartItemPage.buttonAddToCart);

    }

    public static String getConfirmationText() {
        return Common.getTextFromElement(Locators.VienasA.AddToCartItemPage.divtittleSuccess);

    }

    public static void login(String inputEmail, String inputPassword) {
        UserSingInPage.inputSingInEmail(inputEmail);
        UserSingInPage.inputSingInPassword(inputPassword);
        UserSingInPage.clickOnButtonSubmit();

    }

}
