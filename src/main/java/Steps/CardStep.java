package Steps;

import Pages.CardPage;
import io.qameta.allure.Step;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import util.SetDriver;

public class CardStep {

    private final CardPage cardPage = new CardPage();

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
                element.click();
                break;
            }
        }
    }
}
