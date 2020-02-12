import Steps.BaseStep;
import Steps.CardStep;
import Steps.MainStep;
import io.qameta.allure.Step;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SecondTest {

    private BaseStep baseStep = new BaseStep();
    private MainStep mainStep;
    private CardStep cardStep;

    @BeforeMethod
    public void setUp() {
        baseStep.setUp();
    }

    @Test
    @Step("Выбор баттона 'Оформление карты'")
    public void main() {
        mainStep = new MainStep();
        mainStep.clickMenu("Оформить карту");
        //--------------------------
        cardStep = new CardStep();
        cardStep.inputInformation("Кириллов", "Алексей", "(987)517-51-58",
                "rikxela@gmail.com", "Пензенская область");
    }

    @AfterMethod
    public void tearDown() {
        baseStep.tearDown();
    }
}
