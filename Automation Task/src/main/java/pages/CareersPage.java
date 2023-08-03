package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CareersPage {
    WebDriver driver;
    private By ApplyMenu = By.xpath("/html/body/div[2]/div/div/div[1]/nav/div[1]/ul/li[5]/a/span");
    private By GoToApplyButton = By.xpath("/html/body/div[2]/div/div/div[1]/nav/div[1]/ul/li[5]/div/ul/li[1]/a/span/strong");
    public CareersPage(WebDriver driver) {
        this.driver=driver; }

        public void ClickOnApplyMenu()
        {
            driver.findElement(ApplyMenu).click();
        }

public GoToApplyPage ClickOnGoToApply(){

            driver.findElement(GoToApplyButton).click();
            return new GoToApplyPage(driver);

    }
}
