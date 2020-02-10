package Steps;

import Pages.DepositPage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Locatable;

public class DepositStep extends DepositPage {
    public void ChoiceOpenDeposit() {

        for (WebElement e : DepositPage.ChoiceButton) {
            ((Locatable) e).getCoordinates().inViewPort();
            if (e.getAttribute("class").equals("jq-checkbox calculator__check")) {
                e.click();
                break;
            }
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
