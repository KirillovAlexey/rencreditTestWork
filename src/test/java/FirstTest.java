import Steps.BaseStep;
import Steps.DepositStep;
import Steps.MainStep;
import io.qameta.allure.Step;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class FirstTest {

    private  BaseStep baseStep = new BaseStep();
    private  MainStep mainStep;
    private  DepositStep depositStep;

    @BeforeTest
    public void setUp() {
        baseStep.setUp();
    }

    @Test
    @Step("Выбор баттона 'Открытие вклада'")
    public void main() {
        mainStep = new MainStep();
        mainStep.clickMenu("Открыть вклад");

        //-------------------------------------------------------------
        depositStep = new DepositStep();
        depositStep.ChoiceOpenDeposit();
        depositStep.inputMoney("2 800 000");
        depositStep.choiceTime("12 месяцев");
        depositStep.download();
    }

    @AfterTest
    public void tearDown() {
        baseStep.tearDown();
    }
}
