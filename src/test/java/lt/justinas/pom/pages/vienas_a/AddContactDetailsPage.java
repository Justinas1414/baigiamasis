package lt.justinas.pom.pages.vienas_a;

import lt.justinas.pom.pages.Common;
import lt.justinas.pom.pages.Locators;

public class AddContactDetailsPage {

    public static void login(String inputEmail, String inputPassword) {
        UserSingInPage.inputSingInEmail(inputEmail);
        UserSingInPage.inputSingInPassword(inputPassword);
        UserSingInPage.clickOnButtonSubmit();

    }

    public static void clickOnProfileIcon() {
        Common.clickOnElement(Locators.VienasA.AddContactDetailsPage.userBlockTitleStrongIcon);

    }

    public static void clickOnAddContactInfo() {
        Common.clickOnElement(Locators.VienasA.AddContactDetailsPage.dataCreateAdress);

    }

    public static void inputFirstName(String firstname) {
        Common.sendKeysToElement(Locators.VienasA.AddContactDetailsPage.inputFirstName, firstname);

    }

    public static void inputLastName(String lastname) {
        Common.sendKeysToElement(Locators.VienasA.AddContactDetailsPage.inputLastName, lastname);

    }

    public static void inputNumber(String number) {
        Common.sendKeysToElement(Locators.VienasA.AddContactDetailsPage.inputNumber, number);

    }

    public static void clickOnCityId() {
        Common.waitElementPresent(Locators.VienasA.AddContactDetailsPage.clickOnCitySelection, 5);
        Common.clickOnElement(Locators.VienasA.AddContactDetailsPage.clickOnCitySelection);

    }

    public static void inputCityInformation(String city) {
        Common.sendKeysToElement(Locators.VienasA.AddContactDetailsPage.inputCity, city);

    }

    public static void clickOnCity() {
        Common.clickOnElement(Locators.VienasA.AddContactDetailsPage.dropDownSlelect2Result);

    }

    public static void inputAddress(String address) {
        Common.sendKeysToElement(Locators.VienasA.AddContactDetailsPage.inputAdressStreet, address);

    }

    public static void inputPostalCode(String postcode) {
        Common.sendKeysToElement(Locators.VienasA.AddContactDetailsPage.inputAdressPostalCode, postcode);

    }

    public static void clickOnButtonToSaveInfo() {
        Common.clickOnElement(Locators.VienasA.AddContactDetailsPage.buttonValueSave);

    }

    public static String readUserNameAndLastName() {
        return Common.getTextFromElement(Locators.VienasA.AddContactDetailsPage.
                divFirstNameAndLastNameAfterInfoSave);

    }

}
