package ru.netology.stats;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        StatsService service = new StatsService();
        int[] arr = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        System.out.println(Arrays.toString(arr)); // массив

        // сумма всех продаж
        int totalSales = service.sum(arr);
        System.out.println("Сумма всех продаж составляет   " + totalSales);

        // Средняя сумма продаж
        int length = arr.length; // количество единиц в массиве
        int averageSales = totalSales / length; // средняя сумма продаж
        System.out.println("Средняя сумма продаж за   " + length + "  месяцев составляет    " + averageSales);

        // Номер месяца с максимальной суммой продаж
        int maxMonthSales = service.getMaxMonth(arr);
        System.out.println("Максимум продаж был в  " + maxMonthSales + "  месяце");

        // Номер месяца с минимальной суммой продаж
        int minMonthSales = service.getMinMonth(arr); // минимальные продажи
        System.out.println("Минимум продаж был в  " + minMonthSales + "  месяце");

        // количество месяцев с продажей ниже среднего
        int arrMonthUnder = service.arrMonthUnderAverageSales(arr);
        System.out.println("Количество месяцев с продажами ниже среднего   " + arrMonthUnder);

        // количество месяцев с продажей выше среднего
        int arrMonthOver = service.arrMonthOverAverageSales(arr);
        System.out.println("Количество месяцев с продажами выше среднего   " + arrMonthOver);
    }
}

