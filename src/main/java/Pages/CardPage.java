package Pages;

import Steps.BaseStep;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CardPage extends BaseStep {
    @FindBy(xpath = "//input[@name='ClientLastName']")
    WebElement clientLastName;
    @FindBy(xpath = "//input[@name='ClientName']")
    WebElement clientName;
    @FindBy(xpath = "//input[@name='ClientSecondName']")
    WebElement clientSecondName;
    @FindBy(xpath = "//div[@class='form-check-row form-check-row_text_large']//div[@class='jq-checkbox js-validation-ignore-checkbox']")
    WebElement checkBoxSecondNameNull;
    @FindBy(xpath = "//input[@name='ClientMobilePhone']")
    WebElement phone;
    @FindBy(xpath = "//input[@name='AdditionalEmail']")
    WebElement eMail;
    @FindBy(xpath = "//div[@id='s2-styler']//li")
    WebElement choiceTown;
}
