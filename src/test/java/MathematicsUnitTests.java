import org.junit.*;
import org.junit.experimental.categories.Category;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import static org.junit.Assert.assertEquals;
import org.junit.runners.MethodSorters;

@FixMethodOrder(NAME_ASCENDING(MethodSorter.NAME_ASCENDING))
@Category(SlowTests.class)
public class MathematicsUnitTests {

    private Mathematics TestClass = new Mathematics();
    @Rule
    public Timeout globalTimeout = new Timeout(10000);
    @Rule
    public final ExpectedException exception = ExpectedException.none();

    @Before
    public void initialize(){
        TestClass = new Mathematics();
        TestClass.setResult(0);
        System.out.println();
    }

    @Test
    @Category(FastTests.class)
    public void addMethod(){
        TestClass.setResult(0);
        TestClass.add(1, -5);
        String message =  String.format("%d + (%d) Should be %d", 1,-5,4);
        assertEquals(message, -4, TestClass.getResult());
    }

    @Test
    public void mupltiplyByOneShouldReturnValue(){
        TestClass.multiply(-5, 1);
        String message =  String.format("%d + (%d) Should be %d", -5, 1,-5);
        assertEquals(message, -5, TestClass.getResult());
    }

    @Test
    public void divisionByTwoShouldDivideValueOnEqualParts(){
        TestClass.divide(6, 2);
        String message =  String.format("%d + (%d) Should be %d", 6, 2, 3);
        assertEquals(message, 3, TestClass.getResult());
    }

    @Test
    public void subtractOneFromValueShouldDecreaseValueByOne(){
        TestClass.setResult(1);
        TestClass.deduct(5, 1);
        String message =  String.format("%d + (%d) Should be %d", 5, 1, 4);
        assertEquals(message, 4, TestClass.getResult());
    }

    @Test(expected = ArithmeticException.class)
    public void divisionByZeroShouldBeException(){
        TestClass.divide(1, 0);
    }

    @Test(timeout = 10000)
    public void testWithTimeoutShouldFail() throws Exception {
        TestClass.divide(1,1);
        TimeUnit.SECONDS.sleep(11);
        exception.expect(Exception.class);
    }

    @After
    public void Cleanup(){
        Mathematics testClass = new Mathematics();
        testClass.setResult(0);
    }

    @AfterClass
    public static void  classCleanup(){
        Mathematics testClass = new Mathematics();
        testClass.setResult(0);
    }
}
