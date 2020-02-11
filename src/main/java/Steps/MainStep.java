package Steps;

import Pages.MainPage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import util.SetDriver;

public class MainStep {
    MainPage mainPage = new MainPage();

    public void clickMenu(String s) {
        mainPage.selectMenuItem(mainPage.CCD,s);
    }
}
