import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MaxElementTest88 {

    @Test
    public void testMaxElement() {
        int[] arr = {1, 5, 3, 9, 2};
        int result = MaxElement.maxElement(arr);
        assertEquals(9, result, "The max element should be 9");
    }

    @Test
    public void testNegativeNumbers() {
        int[] arr = {-10, -3, -50, -1};
        int result = MaxElement.maxElement(arr);
        assertEquals(-1, result, "The max element should be -1");
    }
}