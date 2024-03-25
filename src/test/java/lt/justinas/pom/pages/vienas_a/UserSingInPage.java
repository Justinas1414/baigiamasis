package lt.justinas.pom.pages.vienas_a;

import lt.justinas.pom.pages.Common;
import lt.justinas.pom.pages.Locators;

public class UserSingInPage {
    public static void open(String url) {
        Common.setUpChrome(8);
        Common.openUrl(url);

    }

    public static void clickOnButtonAccepCokkies() {
        Common.clickOnElement(Locators.VienasA.UserSingUpPage.buttonCbutton);

    }

    public static void inputSingInEmail(String email) {
        Common.sendKeysToElement(Locators.VienasA.UserSingInPage.inputSingInUserEmail, email);

    }

    public static void inputSingInPassword(String password) {
        Common.sendKeysToElement(Locators.VienasA.UserSingInPage.inputSingInUserPassword, password);

    }

    public static void clickOnButtonSubmit() {
        Common.clickOnElement(Locators.VienasA.UserSingInPage.buttonInputSubmit);

    }

    public static String readUserNameAfterLogIn() {
        return Common.getTextFromElement(Locators.VienasA.UserSingInPage.textUserBlockTitleStrong);

    }

}
