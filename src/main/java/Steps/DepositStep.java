package Steps;

import Pages.DepositPage;

public class DepositStep{

    private DepositPage depositPage = new DepositPage();

    public void ChoiceOpenDeposit() {
        depositPage.scrollAndClick(depositPage.choiceButton);
    }

    public void inputMoney(String s) {
        depositPage.selectInput(depositPage.amount,s);
    }

    public void choiceTime(String s) {
        depositPage.selectMenuItem(depositPage.period,s);
    }

    public void download() {
        depositPage.click(depositPage.document);
    }
}
