import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.util.List;

public class ListTests {
    @Test
    public void filterTest() {
        List<String> input1 = new ArrayList<>();
        input1.add("Hello");
        input1.add("My");
        input1.add("Name");
        List<String> expected = new ArrayList<>();
        expected.add("Hello");

        assertArrayEquals(expected.toArray(), ListExamples.filter(input1, new IsHello()).toArray());

    }

}
