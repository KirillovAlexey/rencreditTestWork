import Steps.BaseStep;
import Steps.CardStep;
import Steps.MainStep;
import io.qameta.allure.Step;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SecondTest extends BaseStep {

    private static BaseStep baseStep = new BaseStep();
    private static MainStep mainStep;
    private static CardStep cardStep;
    @BeforeTest
    public void setUp(){
        baseStep.setUp();
    }

    @Test
    public void main() {
        mainStep = new MainStep();
        mainStep.clickMenu("Оформить карту");
        //--------------------------
        cardStep = new CardStep();
        cardStep.inputInformation("Кириллов", "Алексей", "(987)517-51-58",
                "rikxela@gmail.com","Пензенская область");
    }

    //@AfterTest
    public void tearDown(){
        baseStep.tearDown();
    }
}
