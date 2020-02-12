package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.SetDriver;

import java.util.List;

public class BasePage {

    protected BasePage() {
        PageFactory.initElements(SetDriver.getDriver(), this);
    }

    WebDriverWait wait = new WebDriverWait(SetDriver.getDriver(), 2);

    public void fillField(WebElement field, String value) {
        field.clear();
        field.sendKeys(value, Keys.ENTER);
    }

    public void click(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element)).click();
    }

    public void selectMenuItem(List<WebElement> menuItems, String itemName) {
        for (WebElement item : menuItems) {
            if (item.getAttribute("text").equals(itemName)) {
                scrollAndClick(item);
                return;
            }
        }
    }

    public void selectInput(WebElement element, String value) {
        element.click();
        element.sendKeys(value,Keys.ENTER);
    }

    public void scrollAndClick(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) SetDriver.getDriver();
        js.executeScript("return arguments[0].scrollIntoView(false);", element);
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
    }

}
