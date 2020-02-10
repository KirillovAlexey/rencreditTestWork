package Steps;

import Pages.MainPage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class MainStep extends MainPage {

    public void clickMenu(String s) {

        for (WebElement e : MainPage.CCD) {
            ((JavascriptExecutor) BaseStep.getDriver()).executeScript("arguments[0].scrollIntoView();", e);
            if (e.getAttribute("text").equals(s)) {
                e.click();
                break;
            }
        }
    }
}
