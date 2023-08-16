import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CoffeeTest {
    private Coffee emptyCoffee;
    private Coffee actualCoffee;

    private double deltaValue = 0.000001;

    @Before
    public void setup() {
        actualCoffee = new Coffee ("The Bean-inator", "Espresso", 19.99);
    }

    @Test
    public void testCoffeeConstructor() {
        actualCoffee = new Coffee();

        //assert that emptyCoffee is null
        assertNull(emptyCoffee);

        //asser that actualCoffee is NOT null
        assertNotNull(actualCoffee);
    }

    @Test
    public void testCoffeeThreeArgConstructor () {
        actualCoffee = new Coffee ("The Bean-inator", "Espresso", 19.99);

        assertNotNull(actualCoffee);

    }


    @Test
    public void testCoffeeGetters() {
        assertEquals(actualCoffee.getName(), "The Bean-inator");
        assertEquals(actualCoffee.getRoast(), "Espresso");
        assertEquals(actualCoffee.getPrice(), 19.99, deltaValue);
    }

    @Test
    public void testCoffeeSetters() {
        actualCoffee.setName("The Bean-inator 2");
        assertEquals(actualCoffee.getName(), "The Bean-inator 2");

        actualCoffee.setRoast("dark");
        assertEquals(actualCoffee.getRoast(), "dark");

        actualCoffee.setPrice(6.49);
        assertEquals(actualCoffee.getPrice(), 6.49, deltaValue);


    }





}
