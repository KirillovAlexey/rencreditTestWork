import Steps.BaseStep;
import Steps.DepositStep;
import Steps.MainStep;
import io.qameta.allure.Step;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class FirstTest {

    private static final BaseStep baseStep = new BaseStep();
    private static final MainStep mainStep = new MainStep();
    private static final DepositStep depositStep = new DepositStep();

    @BeforeTest
    public void setUp() {
        baseStep.setUp();
    }

    @Test(description = "Тестовый сценарий №1")
    @Step("Выбор баттона 'Открытие вклада'")
    public void main() {
        mainStep.clickMenu("Открыть вклад");
        //-------------------------------------------------------
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
