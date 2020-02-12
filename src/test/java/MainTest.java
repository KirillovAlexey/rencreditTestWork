import Steps.BaseStep;
import org.testng.annotations.*;

public class MainTest {

    @Factory
    @BeforeGroups
    public Object[] getTestClass() {
        Object[] factoryTest = new Object[2];
        factoryTest[0] = new FirstTest();
        factoryTest[1] = new SecondTest();
        return factoryTest;
    }
}
