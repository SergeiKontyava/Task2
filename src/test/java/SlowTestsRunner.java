import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Categories.class)
@Categories.ExcludeCategory(FastTests.class)
@Suite.SuiteClasses({MathematicsUnitTests.class, EmptyUnitTests.class})
public class SlowTestsRunner {
}
