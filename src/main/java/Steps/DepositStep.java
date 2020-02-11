package Steps;

import Pages.DepositPage;
import Pages.MainPage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Locatable;
import org.openqa.selenium.support.PageFactory;

public class DepositStep extends DepositPage{

    public static void ChoiceOpenDeposit() {

        for (WebElement e : choiceButton) {
            ((Locatable) e).getCoordinates().inViewPort();
            if(!e.isDisplayed()){
                e.click();
            }
/*            if (e.getAttribute("class").equals("jq-checkbox calculator__check")) {
                e.click();
                return;
            }*/
        }
    }

    public void inputMoney() {
        ((Locatable) DepositPage.amount).getCoordinates().inViewPort();
        DepositPage.amount.sendKeys("2 800 000", Keys.ENTER);
    }

    public void choiceTime() {
        ((Locatable) DepositPage.document).getCoordinates().inViewPort();
        for (WebElement e : DepositPage.period) {
            if (e.getText().equals("12 месяцев")) {
                e.click();
                break;
            }
        }
    }

    public void download() {
        ((Locatable) DepositPage.document).getCoordinates().inViewPort();
        DepositPage.document.click();
    }
}
