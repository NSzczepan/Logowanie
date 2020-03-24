package selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import selenium.base.TestCommons;

public class LoginPage extends TestCommons {
    @FindBy( xpath = "//*[@id=\"inputUsername\"]")
    public WebElement usernameInput;

    @FindBy( xpath = "//*[@id=\"inputPassword\"]")
    public WebElement passwordInput;

    @FindBy(xpath = "/html/body/app/div/div/div/div/div[2]/form/button")
    public WebElement submitButton;

    public LoginPage (WebDriver driver) {
        //PageFactory.initElements (driver, this);
        initElements(driver);
    }

    public void sendKeysToUsernameInput(String text) {
    }

    public void sendKeysToPasswordInput(String text) {
    }

    public void clickSubmitButton() {clickElement(submitButton);}

    public void login (String text) {
        sendKeysToUsernameInput(text);
        sendKeysToPasswordInput(text);
        clickSubmitButton();
    }
}

