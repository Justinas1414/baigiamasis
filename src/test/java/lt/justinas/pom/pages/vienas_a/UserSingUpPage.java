package lt.justinas.pom.pages.vienas_a;

import lt.justinas.pom.pages.Common;
import lt.justinas.pom.pages.Locators;

public class UserSingUpPage {
    public static void open(String url) {
        Common.setUpChrome(8);
        Common.openUrl(url);

    }

    public static void clickOnButtonAccepCokkies() {
        Common.clickOnElement(Locators.VienasA.UserSingUpPage.buttonCbutton);

    }

    public static void inputFirstNameRegistration(String firstname) {
        Common.sendKeysToElement(Locators.VienasA.UserSingUpPage.inputUserFirstName, firstname);

    }

    public static void inputLastNameRegistration(String lastname) {
        Common.sendKeysToElement(Locators.VienasA.UserSingUpPage.inputUserLastName, lastname);

    }

    public static void inputEmailRegistration(String email) {
        Common.sendKeysToElement(Locators.VienasA.UserSingUpPage.inputUserEmail, email);

    }

    public static void inputPasswordRegistration(String password) {
        Common.sendKeysToElement(Locators.VienasA.UserSingUpPage.inputUserPassword, password);

    }

    public static void inputPasswordConfirmationRegistration(String password) {
        Common.sendKeysToElement(Locators.VienasA.UserSingUpPage.inputUserPasswordConfirmation, password);

    }

    public static void clickOnInputButtonSubmit() {
        Common.clickOnElement(Locators.VienasA.UserSingUpPage.buttonInputSubmit);

    }

    public static String readConfirmationTitle() {
        return Common.getTextFromElement(Locators.VienasA.UserSingUpPage.divUsersConfirmationSucessTitle);

    }

}
