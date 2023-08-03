package Driver;

import Tests.utilities.ConfigProperties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import java.io.IOException;

public class webDriverHandler {

    private static WebDriver webDriver;

    private static final String chromeDriverPath = "D:/Automation Task/src/main/resources/Drivers/chromedriver.exe";
    private static String chromeDriverType = "webdriver.chrome.driver";

    private static final String edgeDriverPath = "D:/Automation Task/src/main/resources/Drivers/msedgedriver.exe";
    private static String edgeDriverType = "webdriver.edge.driver";

    private static String browserType = "D:/Automation Task/src/main/resources/Config/configBrowser.properties";

    private String driverPath = "driverPath";

    private void getDriverType() throws IOException {
        ConfigProperties configBrowser = new ConfigProperties(browserType);
        driverPath = configBrowser.getProperty(driverPath);

        switch (driverPath) {
            case chromeDriverPath:
                System.setProperty(chromeDriverType, chromeDriverPath);

                ChromeOptions chromeCapabilities = new ChromeOptions();
                webDriver = new ChromeDriver(chromeCapabilities);
                webDriver.manage().window().maximize();
                break;

            case edgeDriverPath:
                System.setProperty(edgeDriverType, edgeDriverPath);

                EdgeOptions edgeCapabilities = new EdgeOptions();
                webDriver = new EdgeDriver(edgeCapabilities);
                webDriver.manage().window().maximize();
                break;
        }
    }





           public static WebDriver getWebDriver() {
        return webDriver;
    }
        }
