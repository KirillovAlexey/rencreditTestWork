package Steps;

import Pages.DepositPage;
import io.qameta.allure.Step;
import org.testng.Assert;

public class DepositStep {

    private DepositPage depositPage = new DepositPage();

    @Step("Выбор чекбокса \"Открыть вклад в отделении банка.\" ")
    public void ChoiceOpenDeposit() {
        depositPage.scrollAndClick(DepositPage.choiceButton);
    }

    @Step("Ввод суммы вклада.")
    public void inputMoney(String s) {
        DepositPage.selectInput(DepositPage.amount, s);
        Assert.assertEquals(DepositPage.amount.getAttribute("value"),"1 800 000");
    }

    @Step("Выбор срока вклада")
    public void choiceTime(String s) {
        depositPage.selectMenuItem(DepositPage.period, s);

    }

    @Step("Скачивание документа: \"Общие условия по вкладам.\"")
    public void download() {
        depositPage.click(DepositPage.document);
    }

    //#############################################В процессе#######################################

    //Дописать проверку загрузки файла.
    //https://github.com/AutomatedOwl/selenium-download-kpi.git
    //#############################################дописать#######################################
}
