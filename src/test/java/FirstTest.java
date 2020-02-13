import Steps.BaseStep;
import Steps.DepositStep;
import Steps.MainStep;
import io.qameta.allure.Step;
import org.testng.annotations.*;


public class FirstTest {

    private final BaseStep baseStep = new BaseStep();

    @BeforeClass(description = "Инициализация драйвера")
    public void setUp() {
        baseStep.initilize();
        baseStep.checkInitilize();
    }

    @Test(description = "Первый сценарий")
    @Step("Выбор баттона 'Открытие вклада'")
    public void main() {
        MainStep mainStep = new MainStep();
        DepositStep depositStep = new DepositStep();
        mainStep.clickMenu("Открыть вклад");
        mainStep.checkClickMenu("Вклады");
        //-------------------------------------------------------------

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
