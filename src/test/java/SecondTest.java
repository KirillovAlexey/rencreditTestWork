import Steps.BaseStep;
import Steps.CardStep;
import Steps.MainStep;
import org.testng.annotations.Test;

public class SecondTest extends BaseStep {

    @Test
    public void main() {
        MainStep mainStep = new MainStep();
        mainStep.clickMenu("Оформить карту");

        CardStep cardStep = new CardStep();
        cardStep.inputInformation();
    }
}
