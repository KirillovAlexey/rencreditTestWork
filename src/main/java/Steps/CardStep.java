package Steps;

import Pages.CardPage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class CardStep extends CardPage {
    public void inputInformation(){
        clientLastName.sendKeys("Кириллов");
        clientName.sendKeys("Алексей");
        //clientSecondName.sendKeys("Игоревич");
        checkBoxSecondNameNull.click();
        phone.click();
        phone.sendKeys("(987)517-51-58");
        eMail.sendKeys("rikxela@gmail.com");
        listTownClick.click();
        for (WebElement element: choiceTown) {
            if(element.getText().equals("Пензенская область")) {
                ((JavascriptExecutor)BaseStep.getDriver()).executeScript("arguments[0].scrollIntoView();",element);
                element.click();
                break;
            }
        }
    }
}
