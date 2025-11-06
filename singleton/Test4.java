import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Test4 {

    @Test
    public void test() {

        Double valueOne = Double.valueOf(1.0);
        Double valueTwo = Double.valueOf(2.0);
        
        int hashCode1 = valueOne.hashCode();
        int hashCode2 = valueTwo.hashCode();

        assertEquals(hashCode1,hashCode2);

    }

}
