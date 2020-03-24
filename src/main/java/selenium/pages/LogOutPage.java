package selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import selenium.base.TestCommons;

public class LogOutPage extends TestCommons {
    @FindBy( id = "inputUsername")
    public WebElement usernameInput;

    @FindBy( id = "inputPassword")
    public WebElement passwordInput;

    @FindBy(xpath = "/html/body/app/div/div/div/div/div[2]/form/button")
    public WebElement submitButton;

    @FindBy(xpath = "/html/body/app/div[3]/div[1]/button")
    public WebElement logoutButton;

    public LogOutPage(WebDriver driver) {
        //PageFactory.initElements (driver, this);
        initElements(driver);
    }

    public void sendKeysToUsernameInput(String text) {
    }

    public void sendKeysToPasswordInput(String text) {
    }

    public void clickSubmitButton() {clickElement(submitButton);}

    public void clickLogoutButton() {clickElement(logoutButton);}


    public void logout (String text) {
        sendKeysToUsernameInput(text);
        sendKeysToPasswordInput(text);
        clickSubmitButton();
        clickLogoutButton();
    }
}
