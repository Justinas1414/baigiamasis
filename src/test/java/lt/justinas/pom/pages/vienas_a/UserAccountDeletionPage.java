package lt.justinas.pom.pages.vienas_a;

import lt.justinas.pom.pages.Common;
import lt.justinas.pom.pages.Locators;

public class UserAccountDeletionPage {
    public static void login(String email, String password) {
        UserSingInPage.inputSingInEmail(email);
        UserSingInPage.inputSingInPassword(password);
        UserSingInPage.clickOnButtonSubmit();

    }

    public static void clickOnUserBlockLoggegIn() {
        Common.clickOnElement(Locators.VienasA.UserAccountDeletionPage.buttonUserBlockLoggegIn);

    }

    public static void ClickOnDeleteAccountButton() {
        Common.clickOnElement(Locators.VienasA.UserAccountDeletionPage.clickOnDeleteAccountButton);

    }

    public static void clickOkOnAlert() {
        if (Common.waitAlertPresent(5)) ;
        Common.acceptAlert();

    }

    public static void writeTextToAlert(String email) {
        if (Common.waitAlertPresent(5)) {
            Common.sendKeysToAlert(email);
        }

    }

    public static String getTextFromMainPageToLogIn() {
        return Common.getTextFromElement(Locators.VienasA.UserAccountDeletionPage.divMainPageUserBlockTitle);

    }

}
