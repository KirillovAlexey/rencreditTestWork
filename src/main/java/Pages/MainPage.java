package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class MainPage extends BasePage {

    @FindBy(xpath = "//span[contains(text(),'')]//..//..//a[@class='service__title-action']")
    public List<WebElement> CCD;   //Cards,Credit,Deposit
}
