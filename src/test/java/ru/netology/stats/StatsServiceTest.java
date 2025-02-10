package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    StatsService service = new StatsService();

    long[] statSales = {8L, 15L, 13L, 15L, 17L, 20L, 19L, 20L, 7L, 14L, 14L, 18L};

    @Test
    public void sumSalesTest() {

        long expectedSales = 180L;

        long actualSales = service.sumSales(statSales);

        Assertions.assertEquals(expectedSales, actualSales);
    }

    @Test
    public void averageSalesTest() {


        long expectedSales = 15L;

        long actualSales = service.averageSales(statSales);

        Assertions.assertEquals(expectedSales, actualSales);
    }

    @Test
    public void maxSalesMonthTest() {

        int expectedValue = 8;

        int actualValue = service.maxSalesMonth(statSales);

        Assertions.assertEquals(expectedValue, actualValue);
    }

    @Test
    public void minSalesMonthTest() {

        int expectedValue = 9;

        int actualValue = service.minSalesMonth(statSales);

        Assertions.assertEquals(expectedValue, actualValue);
    }

    @Test
    public void monthsBelowAverageSales() {

        int expectedValue = 5;

        int actualValue = service.monthsBelowAverageSales(statSales);

        Assertions.assertEquals(expectedValue, actualValue);
    }

    @Test
    public void monthsOverAverageSales() {

        int expectedValue = 7;

        int actualValue = service.monthsOverAverageSales(statSales);

        Assertions.assertEquals(expectedValue, actualValue);
    }

}
