package Steps;

import Pages.MainPage;

public class MainStep {
    public MainPage mainPage = new MainPage();

    public void clickMenu(String s) {
        mainPage.selectMenuItem(mainPage.CCD,s);
    }
}
