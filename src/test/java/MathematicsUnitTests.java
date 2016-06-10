import static org.junit.Assert.assertEquals;
import org.junit.*;
import org.junit.experimental.categories.Category;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;
import org.junit.runners.MethodSorters;
import java.util.concurrent.TimeUnit;

@FixMethodOrder(NAME_ASCENDING(MethodSorter.NAME_ASCENDING))
@Category(SlowTests.class)
public class MathematicsUnitTests {

    @Rule
    public Timeout globalTimeout = new Timeout(10000);
    @Rule
    public final ExpectedException exception = ExpectedException.none();

    @BeforeClass
    public static void classInitialize() {
        Mathematics testClass = new Mathematics();
        testClass.setResult(0);
    }

    @Before
    public void initialize(){
        Mathematics testClass = new Mathematics();
        testClass.setResult(0);
    }

    @Test
    @Category(FastTests.class)
    public void addMethod(){
        Mathematics testClass = new Mathematics();

        testClass.setResult(0);
        testClass.add(1, 6);
        assertEquals("1 + 6 Should be 7", 7, testClass.getResult());

        testClass.setResult(0);
        testClass.add(1, -5);
        assertEquals("1 + (-5) Should be -4", -4, testClass.getResult());
    }

    @Test

    public void mupltiplyByOneShouldReturnValue(){
        Mathematics testClass = new Mathematics();

        testClass.setResult(0);
        testClass.multiply(5, 1);
        assertEquals("5 * 1 should be 5", 5, testClass.getResult());

        testClass.setResult(0);
        testClass.multiply(-5, 1);
        assertEquals("-5 * 1 should be -5", -5, testClass.getResult());
    }

    @Test
    public void divisionByTwoShouldDivideValueOnEqualParts(){
        Mathematics testClass = new Mathematics();

        testClass.setResult(0);
        testClass.divide(6, 2);
        assertEquals("6 / 2 should be 3", 3, testClass.getResult());
    }

    @Test
    public void subtractOneFromValueShouldDecreaseValueByOne(){
        Mathematics testClass = new Mathematics();

        testClass.setResult(1);
        testClass.deduct(5, 1);

        assertEquals("5 - 1 should be 4", 4, testClass.getResult());
    }

    @Test(expected = ArithmeticException.class)
    public void divisionByZeroShouldBeException(){
        Mathematics testClass = new Mathematics();
        testClass.setResult(0);

        testClass.divide(1, 0);
    }

    @Test(timeout = 10000)
    public void testWithTimeoutShouldFail() throws Exception {
        Mathematics testClass = new Mathematics();
        testClass.setResult(0);

        testClass.divide(1,1);
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
