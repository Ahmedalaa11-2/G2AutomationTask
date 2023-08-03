package Tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import pages.CareersPage;

public class BaseTest {

    WebDriver driver;
    @BeforeClass
    public void setUP()
    {
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();

    }
}
