import Pages.BasePage;
import Pages.DepositPage;
import Steps.BaseStep;
import Steps.DepositStep;
import Steps.MainStep;
import org.testng.annotations.Test;


public class FirstTest extends BaseStep {

    @Test
    public void main() {
        //BaseStep baseStep = new BaseStep();

        MainStep mainStep = new MainStep();
        mainStep.clickMenu("Открыть вклад");
        DepositStep depositStep = new DepositStep();
        depositStep.ChoiceOpenDeposit();
        depositStep.inputMoney();
        depositStep.choiceTime();
        depositStep.download();
    }
}
