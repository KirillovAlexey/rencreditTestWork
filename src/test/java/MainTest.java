import Steps.BaseStep;
import org.testng.annotations.*;

public class MainTest {

    private static BaseStep baseStep = new BaseStep();

    @BeforeSuite
    public void setup(){
        baseStep = new BaseStep();
        baseStep.setUp();
    }

    @Factory()
    @Test
    public Object[] getTestClass(){
        Object[] factoryTest = new Object[2];
        factoryTest[0] = new FirstTest();
        factoryTest[1] = new FirstTest();
        return factoryTest;
    }

    @AfterSuite
    public void finish(){
        baseStep.tearDown();
    }
}
