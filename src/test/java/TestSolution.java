import com.sazakimaeda.Solution;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

public class TestSolution {
    private Solution solutionTest;

    @BeforeEach
    public void setup() {
        solutionTest = new Solution();
    }

    @org.junit.jupiter.api.Test
    public void solutionTest() {
        String test1 = "()";
        Assertions.assertThat(solutionTest.isValid(test1)).isTrue();
        String test2 = "(())";
        Assertions.assertThat(solutionTest.isValid(test2)).isTrue();
        String test3 = "()[]{}";
        Assertions.assertThat(solutionTest.isValid(test3)).isTrue();
        String test4 = "(]";
        Assertions.assertThat(solutionTest.isValid(test4)).isFalse();
        String test5 = "([])";
        Assertions.assertThat(solutionTest.isValid(test5)).isTrue();
        String test6 = "([)]";
        Assertions.assertThat(solutionTest.isValid(test6)).isFalse();
    }
}
