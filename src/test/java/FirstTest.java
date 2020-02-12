import Steps.BaseStep;
import Steps.DepositStep;
import Steps.MainStep;
import io.qameta.allure.Step;
import org.testng.annotations.*;


public class FirstTest {

    //private static BaseStep baseStep = new BaseStep();
    private static MainStep mainStep;
    private static DepositStep depositStep;

/*    @BeforeMethod
    public void setUp(){

        baseStep.setUp();
    }*/

    @Test(description = "Выполнение первого тестового сценария.")
    @DataProvider(name="MainStep",parallel = true)
    @Step("Выбор баттона 'Открытие вклада'")
    public Object[] main() {
        mainStep = new MainStep();
        mainStep.clickMenu("Открыть вклад");

        //-------------------------------------------------------------
        depositStep = new DepositStep();
        depositStep.ChoiceOpenDeposit();
        depositStep.inputMoney("2 800 000");
        depositStep.choiceTime("12 месяцев");
        depositStep.download();
        return new Object[0];
    }

    /*@AfterMethod
    public void tearDown(){
        baseStep.tearDown();
    }*/
}
