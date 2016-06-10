import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

@Category({SlowTests.class, FastTests.class})
public class EmptyUnitTests {

    @Test
    @Ignore("Due to task 2 in task2.docx")
    public void emptyTestShouldBeIgnored(){
    }

}
