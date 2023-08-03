package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class GoToApplyPage {
    WebDriver driver;
    private By AcceptCookiesButton = By.id("onetrust-accept-btn-handler");
    private By UploadResumeButton =By.id(" upload-resume-button");
    public GoToApplyPage(WebDriver driver)
    {
        this.driver=driver;
    }

    public void ClickOnAcceptCookiesButton ()
    {
        driver.findElement(AcceptCookiesButton).click();
    }
    public void ScrollDown ()
    {
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,250)");
    }
    public void ClickOnUploadResumeButton ()
    {
        driver.findElement(UploadResumeButton).click();
    }


}
