package Steps;

import Pages.MainPage;
import org.testng.annotations.DataProvider;

public class MainStep {
    MainPage mainPage = new MainPage();

    @DataProvider
    public Object[] clickMenu(String s) {
        mainPage.selectMenuItem(mainPage.CCD,s);
        return new Object[0];
    }
}
