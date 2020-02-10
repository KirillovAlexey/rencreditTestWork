package Pages;

import Steps.BaseStep;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class MainPage extends BasePage {


    public MainPage(){
        PageFactory.initElements(BaseStep.getDriver(), this);
    }

    @FindBy(xpath = "//a[@class='service__title-action']")
    public static List<WebElement> CCD;   //Cards,Credit,Deposit
}
