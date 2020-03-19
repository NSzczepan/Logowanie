import Selenium.pages.EditPage;
import Selenium.pages.LogOutPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LogOutTest {
    private WebDriver driver;

    LogOutPage lop;

    @BeforeTest

    public void setup() {
        System.setProperty("webdriver.chrome.driver","C:\\Windows\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        driver = new ChromeDriver(options);
        driver.get("https://dev-patronage-btb.azurewebsites.net/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

    }



    @Test(priority = 0)

    public  void testLogOutPage(){
        lop = new LogOutPage(driver);

        lop.signIn("test123","test123");
        lop.clickSignIn();
        lop.clickProfile();
        lop.clickEdit();
        lop.editProfile("ala123", "test no2", "GASBTC");
        lop.clickChanges();
        lop.clickLogout();

    }



}