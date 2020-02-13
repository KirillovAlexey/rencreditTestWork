import Steps.BaseStep;
import Steps.CardStep;
import Steps.MainStep;
import io.qameta.allure.Step;
import org.testng.annotations.*;

public class SecondTest {

    private BaseStep baseStep = new BaseStep();
    private MainStep mainStep;
    private CardStep cardStep;

    @BeforeClass(description = "Инициализация драйвера")
    public void setUp() {
        baseStep.initilize();
        baseStep.checkInitilize();
    }

    @Test(description = "Второй сценарий")
    @Step("Выбор баттона 'Оформление карты'")
    public void main() {
        mainStep = new MainStep();
        mainStep.clickMenu("Оформить карту");
        //--------------------------
        cardStep = new CardStep();
        cardStep.inputInformation("Кириллов", "Алексей", "  (987)517-51-58",
                "rikxela@gmail.com", "г. Москва");
        cardStep.checkInput("Кириллов", "Алексей", "+7 (987) 517-51-58",
                "rikxela@gmail.com", "г. Москва");
    }

    @AfterClass(description = "Завершение работы драйвера")
    public void tearDown() {
        baseStep.closeSession();
    }
}
