package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CardPage extends BasePage {


    @FindBy(xpath = "//input[@name='ClientLastName']")
    public  WebElement clientLastName;
    @FindBy(xpath = "//input[@name='ClientName']")
    public  WebElement clientName;
    /*@FindBy(xpath = "//input[@name='ClientSecondName']")
    protected static WebElement clientSecondName;*/
    @FindBy(xpath = "//div[@class='form-check-row form-check-row_text_large']//div[@class='jq-checkbox js-validation-ignore-checkbox']")
    public WebElement checkBoxSecondNameNull;
    @FindBy(xpath = "//input[@name='ClientMobilePhone']")
    public WebElement phone;
    @FindBy(xpath = "//input[@name='AdditionalEmail']")
    public WebElement eMail;
    @FindBy(xpath = "//label[@for='CreditRegion']//..//div[@class='jq-selectbox__trigger']")
    public WebElement listTownClick;
    @FindBy(xpath = "//div[@id='s2-styler']//ul//li")
    public List<WebElement> choiceTown;
}
