package Steps;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import util.MyProperties;
import util.SetDriver;

import java.util.concurrent.TimeUnit;

public class BaseStep {

    @Step("Начало работы")
    public void setUp() {
        WebDriver driver = SetDriver.getDriver();
        driver.manage().window().maximize();
        driver.get(MyProperties.getInstance().getProperty("url"));
        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
    }

    @Step("Завершение работы")
    public void tearDown() {
        SetDriver.quitDriver();
    }
}
