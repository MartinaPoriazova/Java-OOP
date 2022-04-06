import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class InstockTest {

    @Test
    public void testContainsShouldReturnTrueWhenProductIsAdded() {
        ProductStock stock = new Instock();

        Product product = new Product("test_product", 9.99, 1);
        assertFalse(stock.contains(product));
        stock.add(product);
        assertTrue(stock.contains(product));
    }

}