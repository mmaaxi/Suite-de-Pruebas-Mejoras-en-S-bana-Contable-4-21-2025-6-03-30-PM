package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_007Page {

    WebDriver driver;

    By loginPageLink = By.id("loginPage");
    By usernameField = By.id("username");
    By passwordField = By.id("password");
    By loginButton = By.id("loginButton");
    By errorMessageBox = By.id("error");

    public tc_007Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToLoginPage() {
        driver.findElement(loginPageLink).click();
    }

    public void loginWithValidCredentials() {
        driver.findElement(usernameField).sendKeys("validUser");
        driver.findElement(passwordField).sendKeys("validPass");
        driver.findElement(loginButton).click();
    }

    public void loginWithInvalidCredentials() {
        driver.findElement(usernameField).sendKeys("invalidUser");
        driver.findElement(passwordField).sendKeys("invalidPass");
        driver.findElement(loginButton).click();
    }

    public void verifyAccessToProtectedContent() {
        // Logic to verify that protected content is accessible
    }

    public void verifyAuthenticationError() {
        if (driver.findElement(errorMessageBox).isDisplayed()) {
            System.out.println("Authentication Error message is displayed.");
        }
    }

    public void tryAccessRestrictedFunctions() {
        // Logic to attempt access to restricted functions
    }

    public void verifyAccessDeniedForRestrictedFunctions() {
        // Logic to verify access is denied to restricted functions
    }
}