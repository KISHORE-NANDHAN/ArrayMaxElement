import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MaxElementTest80 {

    @Test
    public void testMaxElement() {
        int[] arr = {1, 5, 3, 9, 2,88,123,12};
        int result = MaxElement.maxElement(arr);
        assertEquals(123, result, "The max element should be 123");
    }

    @Test
    public void testNegativeNumbers() {
        int[] arr = {-10, -3, -50, -1,-34,-22};
        int result = MaxElement.maxElement(arr);
        assertEquals(-1, result, "The max element should be -1");
    }
}