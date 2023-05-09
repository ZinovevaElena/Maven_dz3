package ru.netology.stats;

public class StatsService {
    // сумма всех продаж
    public int sum(int[] sales) {
        int totalSales = 0;
        for (int sale : sales) {
            totalSales += sale;
        }
        return totalSales;
    }

    // средняя сумма продаж
    public int average(int[] sales) {
        int totalSales = 0;
        for (int sale : sales) {
            totalSales += sale;
        }
        int average = totalSales / sales.length;
        return average;
    }

    // Номер месяца с максимальной суммой продаж
    public int getMaxMonth(int[] sales) {
        int maxMohth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMohth]) {
                maxMohth = i;
            }
        }
        return maxMohth + 1;
    }

    // Номер месяца с минимальной суммой продаж
    public int getMinMonth(int[] sales) {
        int minMonth = 0; // месяц с миниимальными продажами
        for (int i = 0; i < sales.length; i++) { //продажи по месяцам
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    // Количество месяцев с продажами ниже срежнего
    public int arrMonthUnderAverageSales(int[] sales) {
        int arrMonthUnder = 0;
        for (int sale : sales) {
            if (sale < average(sales)) { // ниже среднего
                arrMonthUnder++;
            }
        }
        return arrMonthUnder;
    }

    // Количество месяцев с продажами выше срежнего
    public int arrMonthOverAverageSales(int[] sales) {
        int arrMonthOver = 0;
        int averageSales = average(sales);
        for (int sale : sales) {
            if (sale > averageSales) { // ниже среднего
                arrMonthOver++;
            }
        }
        return arrMonthOver;
    }
}

