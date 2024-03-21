package lt.justinas.pom.pages;

import org.openqa.selenium.By;

public class Locators {
    public class VienasA {
        public static class SingUp {
            public static By buttonCbutton = By.xpath("//a[@class='c-button']");
            public static By inputFirstName = By.xpath("//input[@name='user[first_name]']");
            public static By inputLastName = By.xpath("//input[@name='user[last_name]']");
            public static By inputEmail = By.xpath("//input[@id='user_email']");
            public static By inputPassword = By.xpath("//input[@name='user[password]']");
            public static By inputPasswordConfirmation = By.xpath("//input[@name='user[password_confirmation]']");

            public static By inputSubmit = By.xpath("//input[@type='submit']");
            public static By readTitleConfirmation = By.xpath("//div[@class='users-confirmation__success-title']");
        }

        public static class SingIn {

            public static By inputSingInUserEmail = By.xpath("//input[@id='user_email']");
            public static By inputSingInUserPassword = By.xpath("//input[@id='user_password']");
            public static By buttonSubmit= By.xpath("//input[@type='submit']");

            public static By readUserNameAfterLogIn = By.xpath("//strong[@class='user-block__title--strong']");
        }
    }
}
