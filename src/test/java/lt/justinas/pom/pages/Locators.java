package lt.justinas.pom.pages;

import org.openqa.selenium.By;

public class Locators {
    public class VienasA {
        public static class UserSingUpPage {
            public static By buttonCbutton = By.xpath("//a[@class='c-button']");
            public static By inputUserFirstName = By.xpath("//input[@name='user[first_name]']");
            public static By inputUserLastName = By.xpath("//input[@name='user[last_name]']");
            public static By inputUserEmail = By.xpath("//input[@id='user_email']");
            public static By inputUserPassword = By.xpath("//input[@name='user[password]']");
            public static By inputUserPasswordConfirmation = By.xpath(
                    "//input[@name='user[password_confirmation]']");

            public static By buttonInputSubmit = By.xpath("//input[@type='submit']");
            public static By divUsersConfirmationSucessTitle = By.xpath(
                    "//div[@class='users-confirmation__success-title']");
        }

        public static class UserSingInPage {

            public static By inputSingInUserEmail = By.xpath("//input[@id='user_email']");
            public static By inputSingInUserPassword = By.xpath("//input[@id='user_password']");
            public static By buttonInputSubmit = By.xpath("//input[@type='submit']");

            public static By textUserBlockTitleStrong = By.xpath(
                    "//strong[@class='user-block__title--strong']");
        }

        public static class UserAccountDeletionPage {
            public static By buttonUserBlockLoggegIn = By.xpath(
                    "//div[@class='user-block user-block--logged-in']");
            public static By clickOnDeleteAccountButton = By.xpath("//a[@id='delete-account-button']");
            public static By divMainPageUserBlockTitle = By.xpath("//div[@class='user-block__title']");
        }

        public class AddToCartItemPage {

            public static By inputPlaceholderTextOfAnItem = By.xpath(
                    "//input[@placeholder='Įrašyk, ko ieškai. Pvz., treniruokliai']");
            public static By buttonSnSuggestDocTittleSnIsOnline = By.xpath(
                    "(//div[@class='sn-suggest-doc-title sn-is-oneLine'])[2]");

            public static By buttonAddToCart = By.xpath("//button[@id='add_to_cart_btn']");
            public static By divtittleSuccess = By.xpath("//div[@class='title-success']");
        }

        public class ItemPurchasePage {
            public static By buttonMain = By.xpath("//a[@class='main-button']");
            public static By linkIncQuantity = By.xpath(
                    "//a[@class='detailed-cart-item__inc-quantity']");
            public static By buttonOnDataDisableWithButton = By.xpath(
                    "//input[@data-disable-with='Pradėti pirkimą']");

            public static By radioButtonPickUpPoint = By.xpath("(//span[@class='info'])[3]");

            public static By buttonMainUpcaseFrSmallRadiusCheckoutShippingContinue = By.xpath(
                    "//button[@class='main-button upcase fr " +
                            "small-radius button-min-width checkout-shipping-continue-button']");
        }

        public class AddContactDetailsPage {
            public static By userBlockTitleStrongIcon = By.xpath(
                    "//strong[@class='user-block__title--strong']");
            public static By dataCreateAdress = By.xpath("//a[@data-create-address='true']");
            public static By inputFirstName = By.xpath("//input[@name='address[first_name]']");
            public static By inputLastName = By.xpath("//input[@name='address[last_name]']");
            public static By inputNumber = By.xpath("//input[@name='address[phone_number]']");
            public static By clickOnCitySelection = By.xpath(
                    "//span[@class='select2-selection select2-selection--single']");
            public static By inputCity = By.xpath("//input[@class='select2-search__field']");
            public static By dropDownSlelect2Result = By.xpath("//span[@class='select2-results']");
            public static By inputAdressStreet = By.xpath("//input[@name='address[street]']");
            public static By inputAdressPostalCode = By.xpath("//input[@name='address[postal_code]']");
            public static By buttonValueSave = By.xpath("//input[@value='Saugoti']");
            public static By divFirstNameAndLastNameAfterInfoSave = By.xpath(
                    "//div[@class='profile-address-list__contact-data--bold']");
        }
    }
}
