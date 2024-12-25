package ru.netology.stats;

public class StatsService {

    public long sumSales(long[] statSales) {

        long sum = 0L;

        for (long sales : statSales) {

            sum += sales;
        }
        return sum;
    }

    public long averageSales(long[] statSales) {

        return sumSales(statSales) / statSales.length;
    }

    public int maxSalesMonth(long[] statSales) {

        int maxMonth = 0;

        for (int i = 1; i < statSales.length; i++) {

            if (statSales[maxMonth] == statSales[i]) {

                maxMonth = i;
                continue;
            }
            maxMonth = (statSales[maxMonth] > statSales[i]) ? maxMonth : i;
        }
        return maxMonth + 1;
    }

    public int minSalesMonth(long[] statSales) {

        int minMonth = 0;

        for (int i = 1; i < statSales.length; i++) {

            if (statSales[minMonth] == statSales[i]) {

                minMonth = i;
                continue;
            }
            minMonth = (statSales[minMonth] < statSales[i]) ? minMonth : i;
        }
        return minMonth + 1;
    }

    public int monthsBelowAverageSales(long[] statSales) {

        int months = 0;

        for (long sales : statSales) {

            months += (sales < averageSales(statSales)) ? 1 : 0;
        }
        return months;
    }

    public int monthsOverAverageSales(long[] statSales) {

        int months = 0;

        for (long sales : statSales) {

            months += (sales >= averageSales(statSales)) ? 1 : 0;
        }
        return months;
    }
}
