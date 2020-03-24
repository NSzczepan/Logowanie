import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class EditTest {
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
    public void EditTest() throws InterruptedException {
        driver.get(url);
        driver.findElement(By.id("inputUsername")).sendKeys("admin");
        driver.findElement(By.id("inputPassword")).sendKeys("admin");
        driver.findElement(By.xpath("/html/body/app/div/div/div/div/div[2]/form/button")).click();
        driver.findElement(By.xpath("/html/body/app/div[2]/div[2]/ul/li[2]/a")).click();
       // driver.findElement(By.xpath("/html/body/app/div[3]/div[2]/div[1]/div[2]/div[3]/a")).click();
        //driver.findElement(By.id("username")).clear();
        //driver.findElement(By.id("username")).sendKeys("Ala123");
        //driver.findElement(By.id("profileBio")).clear();
        //driver.findElement(By.id("profileBio")).sendKeys("test123");
       // driver.findElement(By.id("favouritePair")).clear();
        //driver.findElement(By.id("favouritePair")).sendKeys("GASBTC");
        //driver.findElement(By.xpath("/html/body/app/div[3]/div[2]/div/form/div[4]/div[2]/button")).click();

        Thread.sleep(8000);
        driver.quit();
    }
}

