package Steps;

import Pages.DepositPage;
import io.qameta.allure.Step;

public class DepositStep {

    private final DepositPage depositPage = new DepositPage();

    @Step("Выбор чекбокса \"Открыть вклад в отделении банка.\" ")
    public void ChoiceOpenDeposit() {
        depositPage.scrollAndClick(depositPage.choiceButton);
    }

    @Step("Ввод суммы вклада.")
    public void inputMoney(String s) {
        depositPage.selectInput(depositPage.amount, s);
    }

    @Step("Выбор срока вклада")
    public void choiceTime(String s) {
        depositPage.selectMenuItem(depositPage.period, s);
    }

    @Step("Скачивание документа: \"Общие условия по вкладам.\"")
    public void download() {
        depositPage.click(depositPage.document);
    }

    //#############################################В процессе#######################################
    //Дописать проверки

    //Дописать проверку загрузки файла.
    //https://github.com/AutomatedOwl/selenium-download-kpi.git
    //#############################################дописать#######################################
}
