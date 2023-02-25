import org.example.StatsService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void shouldFindSum() {
        StatsService service = new StatsService();

        int[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedSum = 180;
        int actualSum = service.sumOfSales(sales);
        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void shouldFindAverageAmount() {
        StatsService service = new StatsService();
        int[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedAverageAmount = 15;
        int actualAverageAmount = service.averageAmount(sales);
        Assertions.assertEquals(expectedAverageAmount, actualAverageAmount);

    }

    @Test
    public void shouldFindMaxSales() {
        StatsService service = new StatsService();
        int[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMaxSales = 8;
        int actualMaxSales = service.maxSales(sales);
        Assertions.assertEquals(expectedMaxSales, actualMaxSales);


    }

    @Test
    public void shouldFindMinSales() {
        StatsService service = new StatsService();
        int[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMinSales = 9;
        int actualMinSales = service.minSales(sales);
        Assertions.assertEquals(expectedMinSales, actualMinSales);


    }

    @Test
    public void shouldFindQuantityMonsMinSales() {
        StatsService service = new StatsService();
        int[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedQuantityMonsMinSales = 5;
        int actualQuantityMonsMinSales = service.quantityMonsMinSales(sales);
        Assertions.assertEquals(expectedQuantityMonsMinSales, actualQuantityMonsMinSales);


    }

    @Test
    public void shouldFindQuantityMonsMaxSales() {
        StatsService service = new StatsService();
        int[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedQuantityMonsMaxSales = 5;
        int actualQuantityMonsMaxSales = service.quantityMonsMaxSales(sales);
        Assertions.assertEquals(expectedQuantityMonsMaxSales, actualQuantityMonsMaxSales);
    }

}
