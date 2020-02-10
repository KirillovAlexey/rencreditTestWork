package Pages;

import Steps.BaseStep;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    //public WebDriver driver = BaseStep.getDriver();

    protected BasePage() {
        PageFactory.initElements(BaseStep.getDriver(), this);
    }

}
