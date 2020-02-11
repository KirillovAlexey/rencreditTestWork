package Steps;

import Pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import util.MyProperties;
import util.SetDriver;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class BaseStep {

    public static Properties properties = MyProperties.getInstance().getProperties();


    public void setUp() {
        WebDriver driver = SetDriver.getDriver();
        driver.manage().window().maximize();
        driver.get(MyProperties.getInstance().getProperty("url"));
        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
    }

    public void tearDown() {
        SetDriver.quitDriver();
    }

/*    private static final ChromeOptions co = new ChromeOptions();
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

    @AfterMethod
    public static void tearDown() {
        getDriver().quit();
    }*/
}
