import Steps.BaseStep;
import Steps.DepositStep;
import Steps.MainStep;
import io.qameta.allure.Step;
import org.testng.annotations.*;


public class FirstTest {

    private  BaseStep baseStep = new BaseStep();
    private  MainStep mainStep;
    private  DepositStep depositStep;

    @BeforeClass(description = "Инициализация драйвера")
    public void setUp() {
        baseStep.initilize();
    }

    @Test(description = "Первый сценарий")
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

    @AfterClass(description = "Завершение работы драйвера")
    public void tearDown() {
        baseStep.closeSession();
    }
}
