import Selenium.pages.EditPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class EditTest {
    private WebDriver driver;

    EditPage ep;

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

    public  void testEditPage(){
        ep = new EditPage(driver);

        ep.signIn("admin","admin");
        ep.clickSignIn();
        ep.clickProfile();
       ep.clickEdit();
        ep.editProfile("ala123", "test no2", "GASBTC");
        ep.clickChanges();


    }



}

