package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.JavascriptExecutor;

public class VodafoneHomePage {


    WebDriver driver;
    String url ="https://web.vodafone.com.eg/ ";
    private By Careersbutton = By.linkText("Careers");


    //Constructor
    public VodafoneHomePage(WebDriver driver)
    {
        this.driver=driver;
    }

    public void Scrolldown() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

    }
    public void navigateToHomePage()
    {
        driver.get(url);
    }

    public CareersPage ClickOnCareersButton()
    {
        driver.findElement(Careersbutton).click();
        return new CareersPage(driver);
    }





}
