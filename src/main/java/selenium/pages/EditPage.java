package selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import selenium.base.TestCommons;

public class EditPage extends TestCommons {
    @FindBy( id = "inputUsername")
    public WebElement usernameInput;

    @FindBy( id = "inputPassword")
    public WebElement passwordInput;

    @FindBy(xpath = "/html/body/app/div/div/div/div/div[2]/form/button")
    public WebElement submitButton;

    @FindBy( xpath = "/html/body/app/div[2]/div[2]/ul/li[2]/a")
    public WebElement profileButton;

    @FindBy( xpath = "/html/body/app/div[3]/div[2]/div[1]/div[2]/div[3]/a")
    public WebElement editButton;

   @FindBy(id = "username")
   public WebElement editUsername;

    @FindBy(id = "profileBio")
   public WebElement editBio;

    @FindBy(id = "favouritePair")
    public WebElement editFavourite;

    @FindBy(xpath= "/html/body/app/div[3]/div[2]/div/form/div[4]/div[2]/button")
    public WebElement changesButton;

    public EditPage(WebDriver driver) {
        //PageFactory.initElements (driver, this);
        initElements(driver);
    }

    public void sendKeysToUsernameInput(String text) {
    }

    public void sendKeysToPasswordInput(String text) {
    }

    public void clickSubmitButton() {clickElement(submitButton);}

    public void clickProfileButton () {clickElement(profileButton);}

    public void clickEditButton () {clickElement(editButton);}

    public void sendKeysToUsername(String text) {}

   public void sendKeysToBio(String text) {}

    public void sendKeysToFavourite(String text) {}

   public void clickChangesButton () {clickElement(changesButton);}

    public void edit (String text) {
        sendKeysToUsernameInput(text);
        sendKeysToPasswordInput(text);
        clickSubmitButton();
        clickProfileButton();
        clickEditButton();
        sendKeysToUsername(text);
        sendKeysToBio(text);
        sendKeysToFavourite(text);
        clickChangesButton();
    }
}



