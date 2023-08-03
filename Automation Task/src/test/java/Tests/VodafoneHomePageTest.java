package Tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.VodafoneHomePage;
import pages.VodafoneHomePage;

import java.time.Duration;

public class VodafoneHomePageTest extends BaseTest{
    WebDriver driver;
    VodafoneHomePage vodafoneHomePage;

    @Test
    public void getVodafoneWebSiteHomePage()
    {
        vodafoneHomePage.navigateToHomePage();
        vodafoneHomePage.Scrolldown();
        vodafoneHomePage.ClickOnCareersButton();
    }



}
