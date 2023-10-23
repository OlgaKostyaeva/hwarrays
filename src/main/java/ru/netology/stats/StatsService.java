package ru.netology.stats;

public class StatsService {
    public long allSales(long[] sales) {
        long totalSales = 0;
        for (long sale : sales) {
            totalSales += sale;
        }
        return totalSales;
    }

    public long averageSales(long[] sales) {
        return allSales(sales) / sales.length;
    }

    public int maxSalesMonth(long[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int minSalesMonth(long[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int monthsMinSales(long[] sales) {
        int counter = 0;
        for (long sale : sales) {
            if (sale < averageSales(sales)) {
                counter++;
            }
        }
        return counter;
    }

    public int monthsManSales(long[] sales) {
        int counter = 0;
        for (long sale : sales) {
            if (sale > averageSales(sales)) {
                counter++;
            }
        }
        return counter;
    }
}

