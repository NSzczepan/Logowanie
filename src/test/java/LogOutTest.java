import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LogOutTest {
    private WebDriver driver;
    private final String url = "https://dev-patronage-btb.azurewebsites.net";

    @BeforeClass
    private void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Windows\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");

        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
    }

    @Test
    public void LogOutTest() throws InterruptedException {
        driver.get(url);
        driver.findElement(By.id("inputUsername")).sendKeys("admin");
        driver.findElement(By.id("inputPassword")).sendKeys("admin");
        driver.findElement(By.xpath("/html/body/app/div/div/div/div/div[2]/form/button")).click();
        driver.findElement(By.xpath("/html/body/app/div[3]/div[1]/button")).click();
        Thread.sleep(8000);
        driver.quit();
    }
}


