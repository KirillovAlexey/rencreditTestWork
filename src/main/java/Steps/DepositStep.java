package Steps;

import Pages.BasePage;
import Pages.DepositPage;
import com.sun.applet2.preloader.event.DownloadEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Locatable;

import javax.swing.*;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;

public class DepositStep extends DepositPage {
    public void ChoiceOpenDeposit() {

        for (WebElement e : DepositPage.ChoiceButton) {
            ((Locatable) e).getCoordinates().inViewPort();
            //e.getAttribute("class")
            ////div[@class='internet-bank']//input[@type='checkbox']
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

    public void choiceTime(){
        ((Locatable) DepositPage.document).getCoordinates().inViewPort();
        for (WebElement e: DepositPage.period) {
            if(e.getText().equals("12 мес€цев")){
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
