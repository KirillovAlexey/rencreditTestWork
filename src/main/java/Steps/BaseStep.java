package Steps;

import io.qameta.allure.Attachment;
import io.qameta.allure.Step;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import util.MyProperties;
import util.SetDriver;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import static util.SetDriver.getDriver;

public class BaseStep {

    public Properties properties = MyProperties.getInstance().getProperties();

    @Step("Начало работы")
    public void initilize() {
        WebDriver driver = getDriver();
        driver.manage().window().maximize();
        driver.get(MyProperties.getInstance().getProperty("url"));
        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
    }

    @Step("Проверка инициализации драйвера.")
    public void checkInitilize() {
        Assert.assertNotNull(getDriver(), "Драйвер не загружен");
    }

    @Step("Завершение работы")
    public void closeSession() {
        SetDriver.quitDriver();
    }

    @Attachment(type = "image/png", value = "Screenshot")
    public static byte[] takeScreenshot() {
        return ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.BYTES);
    }
}
