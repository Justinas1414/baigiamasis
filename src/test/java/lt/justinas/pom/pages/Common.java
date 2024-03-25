package lt.justinas.pom.pages;

import lt.justinas.pom.utils.Driver;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Common {

    public static void setUpChrome(int waitSeconds) {
        Driver.setUpChrome();
        Driver.getChromeDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(waitSeconds));
    }

    public static void openUrl(String url) {
        Driver.getChromeDriver().get(url);
    }

    public static void quitChromeDriver() {
        Driver.quitChromeDriver();
    }

    private static WebElement getElement(By locator) {
        return Driver.getChromeDriver().findElement(locator);
    }


    public static void sendKeysToElement(By locator, String text) {
        getElement(locator).sendKeys(text);
    }

    public static void clickOnElement(By locator) {
        getElement(locator).click();
    }

    public static String getTextFromElement(By locator) {
        return getElement(locator).getText();
    }

    public static boolean waitElementVisible(By locator, int seconds) {
        try {
            WebDriverWait wait = new WebDriverWait(Driver.getChromeDriver(), Duration.ofSeconds(seconds));
            wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        } catch (TimeoutException e) {
            return false;
        }
        return true;
    }


    public static void doubleClickOnElementByAction(By locator) {
        Actions actions = new Actions(Driver.getChromeDriver());
        actions
                .moveToElement(getElement(locator))
                .doubleClick()
                .perform();
    }

    public static boolean waitElementPresent(By locator, int seconds) {
        try {
            WebDriverWait wait = new WebDriverWait(Driver.getChromeDriver(), Duration.ofSeconds(seconds));
            wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        } catch (TimeoutException e) {
            return false;
        }

        return true;
    }

    private static Alert getAlert() {
        return Driver.getChromeDriver().switchTo().alert();
    }

    public static void acceptAlert() {
        getAlert().accept();

    }

    public static boolean waitAlertPresent(int seconds) {
        try {
            WebDriverWait wait = new WebDriverWait(Driver.getChromeDriver(), Duration.ofSeconds(seconds));
            wait.until(ExpectedConditions.alertIsPresent());
        } catch (TimeoutException e) {
            return false;
        }

        return true;
    }

    public static void sendKeysToAlert(String input) {
        getAlert().sendKeys(input);
    }

}


