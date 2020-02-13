package Steps;

import Pages.MainPage;
import io.qameta.allure.Step;
import org.testng.Assert;

public class MainStep {
    private final MainPage mainPage = new MainPage();

    @Step("Выбор интересующего меню.")
    public void clickMenu(String s) {
        mainPage.selectMenuItem(mainPage.CCD, s);
    }

    @Step("Проверка перехода в меню оформления услуги")
    public void checkClickMenu(String s){
        Assert.assertEquals(mainPage.optionButton.getText(),s,"Выбранна не та категория оформления услуги");
    }
}
