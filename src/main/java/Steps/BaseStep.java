package Steps;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import util.MyProperties;
import util.SetDriver;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class BaseStep {

    public Properties properties = MyProperties.getInstance().getProperties();

    @Step("Начало работы")
    public void initilize() {
        WebDriver driver = SetDriver.getDriver();
        driver.manage().window().maximize();
        driver.get(MyProperties.getInstance().getProperty("url"));
        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
    }

    @Step("Завершение работы")
    public void closeSession() {
        SetDriver.quitDriver();
    }
}
