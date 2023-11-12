package ru.yandex.praktikum.sprint3.Webinar;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class ProductTest extends TestCase {
    private final Product product;
    private final int expectedResult;

    public ProductTest(int price, int discount, int expectedResult) {
        this.expectedResult = expectedResult;
        this.product = new Product(price, discount);
    }

    @Parameterized.Parameters(name = "{index} - price {0}, discount {1}, expectedResult {2}")
    public static Object[][] data() {
        return new Object[][]{
                {200, 51, 200},
                {200, 50, 100},
                {200, 0, 200},
                {200, -1, 200},
        };
    }

    @Test
    public void testGetFinalPrice() {
        int actualResult = product.getFinalPrice();
        Assert.assertEquals(expectedResult, actualResult);
    }

    public void testGetPrice() {
        Product product = new Product(50,0);
        Assert.assertEquals(100,product.getPrice());
    }
}