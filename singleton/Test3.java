import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Test3 {

    @Test
    public void test() {

        Double valueOne = Double.valueOf(1.0012);
        Double valueTwo = Double.valueOf(1.0012);
        
        int hashCode1 = valueOne.hashCode();
        int hashCode2 = valueTwo.hashCode();

        assertEquals(hashCode1,hashCode2);

    }

}
