package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import util.SetDriver;

import java.util.List;

public class BasePage {

    protected BasePage() {
        PageFactory.initElements(SetDriver.getDriver(), this);
    }

    WebDriverWait wait = new WebDriverWait(SetDriver.getDriver(), 2);

    public void fillField(WebElement field, String value) {
        JavascriptExecutor js = (JavascriptExecutor) SetDriver.getDriver();
        js.executeScript("return arguments[0].style.border='1px solid magenta';", field);
        field.clear();
        field.sendKeys(value);
        js.executeScript("return arguments[0].style.border='1px solid black';", field);
    }

    public void click(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element)).click();
    }

    public void selectMenuItem(List<WebElement> menuItems, String itemName) {
        for (WebElement item : menuItems) {
            if (item.getAttribute("text").equalsIgnoreCase(itemName)) {
                scrollAndClick(item);
                return;
            }
        }
        Assert.fail("Не найден элмент коллеции - " + itemName);
    }

    public void selectInput(WebElement element, String value) {
        element.click();
        element.findElement(By.xpath(".//div[contains(@class,'choices__item')][contains(text(),'" + value + "')]")).click();
    }

    public void selectCheckBox(List<WebElement> element){

    }

    public void scrollAndClick(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) SetDriver.getDriver();
        js.executeScript("return arguments[0].scrollIntoView(false);", element);
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
    }

}
