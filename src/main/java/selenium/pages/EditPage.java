package Selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EditPage {
    private WebDriver driver;

    private By login = By.id("inputUsername");
    private By password = By.id("inputPassword");
    private By submitButton = By.xpath("/html/body/app/div/div/div/div/div[2]/form/button");
    private By profileButton = By.xpath("/html/body/app/div[2]/div[2]/ul/li[2]/a");
    private By editButton = By.xpath("/html/body/app/div[3]/div[2]/div[1]/div[2]/div[3]/a");
     private By editUsername = By.id("username");
    private By editBio = By.id("profileBio");
    private By editFavourite = By.id("favouritePair");
    private By changesButton =By.cssSelector("body > app > div.main > div.content.px-4 > div.container > form > div.justify-content-around.row > div:nth-child(2) > button");


    public EditPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setLogin(String strLogin) {

        driver.findElement(login).clear();
        driver.findElement(login).sendKeys(strLogin);
    }

    public void setPassword(String strPassword) {
        driver.findElement(password).clear();
        driver.findElement(password).sendKeys(strPassword);
    }

    public void clickSignIn() {
        driver.findElement(submitButton).click();
    }

    public void clickProfile() {
        driver.findElement(profileButton).click();
    }

    public void clickEdit() {
        driver.findElement(editButton).click();
    }
     public void setEditUsername(String strUsername){

     driver.findElement(editUsername).clear();
    driver.findElement(editUsername).sendKeys(strUsername);
    }
    public void setEditBio(String strBio) {

        driver.findElement(editBio).clear();
         driver.findElement(editBio).sendKeys(strBio);
    }


    public void setEditFavourite(String strFavourite){

    driver.findElement(editFavourite).clear();
    driver.findElement(editFavourite).sendKeys(strFavourite);
     }

    public void clickChanges() {
    driver.findElement(changesButton).click();
    }

    public void signIn(String strLogin, String strPassword) {
        this.setLogin(strLogin);
        this.setPassword(strPassword);
        this.clickSignIn();

    }

    public void editProfile(String strUsername, String strBio, String strFavourite) {

        this.setEditUsername(strUsername);
        this.setEditBio(strBio);
        this.setEditFavourite(strFavourite);
        this.clickChanges();
    }
}



