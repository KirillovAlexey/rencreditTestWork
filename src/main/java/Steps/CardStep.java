package Steps;

import Pages.CardPage;
import io.qameta.allure.Step;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import util.SetDriver;

public class CardStep {

    private final CardPage cardPage = new CardPage();
    private String nameTown;

    @Step("Заполнение информации о держателе карты.")
    public void inputInformation(String lName, String fName, String phone, String eMail, String town) {
        cardPage.fillField(cardPage.clientLastName, lName);
        cardPage.fillField(cardPage.clientName, fName);
        cardPage.scrollAndClick(cardPage.checkBoxSecondNameNull);
        cardPage.fillField(cardPage.phone, phone);
        cardPage.fillField(cardPage.eMail, eMail);
        cardPage.click(cardPage.listTownClick);
        //cardPage.selectMenuItem(cardPage.choiceTown,town);
        for (WebElement element : cardPage.choiceTown) {
            if (element.getText().equals(town)) {
                ((JavascriptExecutor) SetDriver.getDriver()).executeScript("arguments[0].scrollIntoView();", element);
                nameTown = element.getText();
                element.click();
                break;
            }
        }
    }
    @Step("Проверка введенных данных")
    public void checkInput(String lName, String fName, String phone, String eMail, String town){
        Assert.assertEquals(cardPage.clientLastName.getAttribute("value"),lName);
        Assert.assertEquals(cardPage.clientName.getAttribute("value"),fName);
        Assert.assertEquals(cardPage.phone.getAttribute("value"),phone);
        Assert.assertEquals(cardPage.eMail.getAttribute("value"),eMail);
        Assert.assertEquals(nameTown,town);
    }
}
