import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService;

public class StatsServiceTest {
    @Test // Сумма всех продаж
    public void SumTotalSales() {
        StatsService service = new StatsService();
        int[] arr = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actualSum = service.sum(arr);
        int expectedSum = 180;
        Assertions.assertEquals(actualSum, expectedSum);
    }

    @Test // Средняя сумма продаж
    public void AverageSales() {
        int[] arr = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int actualAverage = service.average(arr);
        int expectedAverage = 15;
        Assertions.assertEquals(actualAverage, expectedAverage);
    }

    @Test // Номер месяца с максимальной суммой продаж
    public void getMaxSales() {
        int[] arr = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int actualMaxSales = service.getMaxMonth(arr);
        int expectedMaxSales = 8;
        Assertions.assertEquals(actualMaxSales, expectedMaxSales);
    }

    @Test // Номер месяца с минимальной суммой продаж
    public void getMinSales() {
        int[] arr = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int actualMinSales = service.getMinMonth(arr);
        int expectedMinSales = 9;
        Assertions.assertEquals(actualMinSales, expectedMinSales);
    }

    @Test // количество месяцев с продажей ниже среднего
    public void arrMonthUnderAverageSales() {
        int[] arr = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int actualunderAverage = service.arrMonthUnderAverageSales(arr);
        int expectedUnderAvarege = 5;
        Assertions.assertEquals(actualunderAverage, expectedUnderAvarege);
    }

    @Test // количество месяцев с продажей выше среднего
    public void arrMonthOverAverageSales() {
        int[] arr = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int actualOverAverage = service.arrMonthOverAverageSales(arr);
        int expectedOverAvarege = 5;
        Assertions.assertEquals(actualOverAverage, expectedOverAvarege);
    }
}
