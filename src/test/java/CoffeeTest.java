import org.junit.Test;
import static org.junit.Assert.*;

public class CoffeeTest {
    private Coffee emptyCoffee;
    private Coffee actualCoffee;

    @Test
    public void testCoffeeConstructor() {
        actualCoffee = new Coffee();

        //assert that emptyCoffee is null
        assertNull(emptyCoffee);

        //asser that actualCoffee is NOT null
        assertNull(actualCoffee);
    }





}
