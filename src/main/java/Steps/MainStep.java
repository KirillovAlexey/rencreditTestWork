package Steps;

import Pages.MainPage;
import io.qameta.allure.Step;

public class MainStep {
    private MainPage mainPage = new MainPage();

    @Step("Выбор интересующего меню.")
    public void clickMenu(String s) {
        mainPage.selectMenuItem(mainPage.CCD, s);
    }
}
