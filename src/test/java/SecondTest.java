import Steps.BaseStep;
import Steps.CardStep;
import Steps.MainStep;
import io.qameta.allure.Step;
import org.testng.annotations.*;

public class SecondTest {

    private static final BaseStep baseStep = new BaseStep();
    private static final MainStep mainStep = new MainStep();
    private static final CardStep cardStep = new CardStep();

    @BeforeTest
    public void setUp() {
        baseStep.setUp();
    }

    @Test(description = "Тестовый сценарий №2")
    @Step("Выбор баттона 'Оформление карты'")
    public void main() {
        mainStep.clickMenu("Оформить карту");
        //-------------------------------------------------------
        cardStep.inputInformation("Кириллов", "Алексей", "(987)517-51-58",
                "rikxela@gmail.com", "Пензенская область");
    }

    @AfterTest
    public void tearDown() {
        baseStep.tearDown();
    }
}
