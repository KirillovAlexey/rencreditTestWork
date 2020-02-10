package Steps;

import Pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import util.MyProperties;

import java.util.HashMap;
import java.util.Map;

public class BaseStep extends BasePage {

    private static final ChromeOptions co = new ChromeOptions();
    private static WebDriver driver;

    public static WebDriver getDriver() {
        return driver;
    }

    @BeforeMethod
    public static void setUp() {
        System.setProperty("webdriver.chrome.driver", MyProperties.getInstance().getProperty("path.chrome"));
        Map<String, Object> prefs = new HashMap<>();
        prefs.put("plugins.always_open_pdf_externally", true);
        co.setExperimentalOption("prefs", prefs);
        driver = new ChromeDriver(co);
        driver.manage().window().maximize();
        driver.get(MyProperties.getInstance().getProperty("url"));
    }

    //@AfterMethod
    public static void tearDown() {
        getDriver().quit();
    }
}
