package Pages;

import Steps.BaseStep;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DepositPage{

    protected DepositPage() {
        PageFactory.initElements(BaseStep.getDriver(), this);
    }

    @FindBy(xpath = "//div[@class='internet-bank']//input[@type='checkbox']//..")
    public static List<WebElement> ChoiceButton;
    @FindBy(xpath = "//input[@name='amount']")
    public static WebElement amount;
    @FindBy(xpath = "//select[@id='period']//option")
    public static List<WebElement> period;
    @FindBy(xpath = "//a[contains(text(),'Общие условия по вкладам')]")
    public static WebElement document;
}
