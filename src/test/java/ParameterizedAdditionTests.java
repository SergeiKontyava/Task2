import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;


@RunWith(Parameterized.class)
@Category(SlowTests.class)
public class ParameterizedAdditionTests {
    private int FirstNumber;
    private int SecondNumber;
    private int Result;

    public ParameterizedAdditionTests(int firstNumber, int secondNumber, int result){
        this.FirstNumber = firstNumber;
        this.SecondNumber = secondNumber;
        this.Result = result;
    }

    @Test
    public void additionSetShouldBeCorrectTest(){
        Mathematics testClass = new Mathematics();
        testClass.setResult(0);
        testClass.add(FirstNumber, SecondNumber);
        assertEquals(Result, testClass.getResult());
        System.out.println("Test with: " + FirstNumber + " and " + SecondNumber  + " should be "+ Result);
    }

    @Parameterized.Parameters
    public static Collection<Object[]> numbersForAddition(){
        return Arrays.asList(new Object[][]{
                {1, 1, 2},
                {2, 3, 5},
                {3, 5, 8},
                {5, 8, 13}
        });
    }
}



