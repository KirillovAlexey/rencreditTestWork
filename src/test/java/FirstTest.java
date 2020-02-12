import Pages.BasePage;
import Steps.BaseStep;
import Steps.DepositStep;
import Steps.MainStep;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class FirstTest {

    private static BaseStep baseStep = new BaseStep();
    private static MainStep mainStep;
    private static DepositStep depositStep;

    @BeforeTest
    public void setUp(){

        baseStep.setUp();
    }

    @Test
    public void main() {
        mainStep = new MainStep();
        mainStep.clickMenu("Открыть вклад");
        //mainStep.selectMenuItem(mainStep.CCD,"Открыть вклад");
        //-------------------------------------------------------------
        depositStep = new DepositStep();
        depositStep.ChoiceOpenDeposit();
        depositStep.inputMoney("2 800 000");
        depositStep.choiceTime("12 месяцев");
        depositStep.download();
    }

    @AfterTest
    public void tearDown(){
        baseStep.tearDown();
    }
}
