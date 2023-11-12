package ru.yandex.praktikum.sprint3.Webinar;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class ProductTest2 extends TestCase {
    @Parameterized.Parameter(0)
   public  int price;
    @Parameterized.Parameter(1)
    public  int discount;
    @Parameterized.Parameter(2)
    public  int expectedResult;




    @Parameterized.Parameters
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
        Product product = new Product(price, discount);
        int actualResult = product.getFinalPrice();
        Assert.assertEquals(expectedResult, actualResult);
    }

    public void testGetPrice() {
    }
}