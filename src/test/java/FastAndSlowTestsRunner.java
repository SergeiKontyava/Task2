import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Categories.class)
@Suite.SuiteClasses({MathematicsUnitTests.class, EmptyUnitTests.class})
public class FastAndSlowTestsRunner {

}
