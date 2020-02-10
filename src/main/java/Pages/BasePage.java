package Pages;

import Steps.BaseStep;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    protected BasePage() {
        PageFactory.initElements(BaseStep.getDriver(), this);
    }

}
