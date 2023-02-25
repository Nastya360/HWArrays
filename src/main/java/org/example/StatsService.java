package org.example;

public class StatsService {

    public int sumOfSales(int[] sales) {
        int sum = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        return sum;
    }

    public int averageAmount(int[] sales) {
        int averageSum = 0;
        for (int i = 0; i < sales.length; i++) {
            averageSum = sumOfSales(sales) / 12;
        }
        return averageSum;
    }
    public int maxSales(int[] sales) {
        int maxMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                maxMonth = i; // запомним его как минимальный
            }
        }

        return maxMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }
    public int minSales(int[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }
    public int quantityMonsMinSales(int[] sales) {
       int month = 0; // номер месяца с минимальными продажами среди просмотренных ранее

       for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averageAmount(sales)) { // значит, в рассматриваемом i-м месяце продаж меньше
               month= month+1;
               // запомним его как минимальный
            }
        }

        return month ; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }
    public int quantityMonsMaxSales(int[] sales) {
        int month = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > averageAmount(sales)) { // значит, в рассматриваемом i-м месяце продаж меньше
                month= month+1;
                // запомним его как минимальный
            }
        }

        return month ;

}}
