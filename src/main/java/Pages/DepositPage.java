package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class DepositPage extends BasePage {

    //@FindBy(xpath = "//div[@class='internet-bank']//input[@type='checkbox']//..")
    //public static List<WebElement> choiceButton;
    @FindBy(xpath = "//span[text()='В отделении банка']//..//..//div[@class='jq-checkbox calculator__check']")
    public static WebElement choiceButton;
    @FindBy(xpath = "//input[@name='amount']")
    public static WebElement amount;
    @FindBy(xpath = "//div[@class='jq-selectbox__select-text']")
    public static WebElement timeChoice;
    @FindBy(xpath = "//select[@id='period']//option")
    public  static List<WebElement> period;
    @FindBy(xpath = "//a[contains(text(),'Общие условия по вкладам')]")
    public static WebElement document;
}
