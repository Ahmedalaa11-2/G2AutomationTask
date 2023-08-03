package Tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.CareersPage;


public class CareersPageTest extends BaseTest{

    WebDriver driver;
    CareersPage careersPage;

    @Test
    public void getCarersPageTest()
    {
        careersPage.ClickOnApplyMenu();
        careersPage.ClickOnGoToApply();
    }



}
