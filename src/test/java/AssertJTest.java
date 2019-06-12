import org.junit.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class AssertJTest {

    @Test
    public void testStringIsEqualWithAnotherString() {
        System.out.println("testing assertj <isEqualTo>");
        String test = "abcd";

        assertThat(test).isEqualTo("abcd");

    }

    @Test
    public void testMultipleConditionsForAnArray() {
        System.out.println("testing assertj multipleConditions");
        String[] string = {"abcd", "efgh", "hijk"};
        assertThat(string)
                .hasSize(3)
                .contains("abcd")
                .doesNotContain("y");
    }
}
