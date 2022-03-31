import by.itstep.tiknyus.examproject.model.entity.Basket;
import by.itstep.tiknyus.examproject.model.entity.Bread;
import by.itstep.tiknyus.examproject.model.entity.Milk;
import by.itstep.tiknyus.examproject.model.entity.Orange;
import by.itstep.tiknyus.examproject.model.logic.ShopAssistance;
import org.junit.Test;
import static org.junit.Assert.*;

public class ShopAssistanceTest {
    @Test
    public void testTotalPricePositive(){
        Milk milk = new Milk(1000, 3.5, 2.5);
        Orange orange = new Orange(200, 2000, 4.0);
        Bread bread = new Bread("Black", "Middle", 2.5);

        Basket basket = new Basket();
        basket.add(milk);
        basket.add(orange);
        basket.add(bread);

        double expected = 9.0;

        double actual = ShopAssistance.calculateTotalPrice(basket);

        assertEquals(expected, actual, 0);

    }
}
