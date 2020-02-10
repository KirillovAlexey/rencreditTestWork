package Pages;

import Steps.BaseStep;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CardPage{

    public CardPage() {
        PageFactory.initElements(BaseStep.getDriver(), this);
    }

    @FindBy(xpath = "//input[@name='ClientLastName']")
    protected static WebElement clientLastName;
    @FindBy(xpath = "//input[@name='ClientName']")
    protected static WebElement clientName;
    /*@FindBy(xpath = "//input[@name='ClientSecondName']")
    protected static WebElement clientSecondName;*/
    @FindBy(xpath = "//div[@class='form-check-row form-check-row_text_large']//div[@class='jq-checkbox js-validation-ignore-checkbox']")
    protected static WebElement checkBoxSecondNameNull;
    @FindBy(xpath = "//input[@name='ClientMobilePhone']")
    protected static WebElement phone;
    @FindBy(xpath = "//input[@name='AdditionalEmail']")
    protected static WebElement eMail;
    @FindBy(xpath = "//label[@for='CreditRegion']//..//div[@class='jq-selectbox__trigger']")
    protected static WebElement listTownClick;
    @FindBy(xpath = "//div[@id='s2-styler']//ul//li[@style]")
    protected static List<WebElement> choiceTown;
}
