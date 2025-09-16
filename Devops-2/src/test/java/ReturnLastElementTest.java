import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ReturnLastElementTest {

   @Test
   public void findLast() {
	   int num = 588;
	   assertEquals(8,ReturnLastElement.returnLast(num),"The last element should be 8");
   }
}
