package Steps;

import Pages.CardPage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import util.SetDriver;

public class CardStep {

    CardPage cardPage = new CardPage();
    
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

/*        clientLastName.sendKeys("Кириллов");
        clientName.sendKeys("Алексей");
        //clientSecondName.sendKeys("Игоревич");
        checkBoxSecondNameNull.click();
        phone.click();
        phone.sendKeys("(987)517-51-58");
        eMail.sendKeys("rikxela@gmail.com");
        listTownClick.click();
        for (WebElement element : choiceTown) {
            if (element.getText().equals("Пензенская область")) {
                ((JavascriptExecutor) SetDriver.getDriver()).executeScript("arguments[0].scrollIntoView();", element);
                element.click();
                break;
            }
        }*/
    }
}
