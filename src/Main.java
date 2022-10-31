public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 6.1.1.");
        for (int i  = 0; i <= 10; i ++) {
            System.out.println(i);
        }

        System.out.println("Задание 6.1.2.");
        for (int a  = 10; a >= 0; a --) {
            System.out.println(a);
        }

        System.out.println("Задание 6.1.3.");
        for (int b  = 0; b <= 17; b = b + 2) {
            System.out.println(b);
        }

        System.out.println("Задание 6.1.4.");
        for (int c  = 10; c <= 10 & c >= -10; c --) {
            System.out.println(c);

        }
        System.out.println("Задание 6.2.1.");
        for (int d  = 1904; d <= 2096; d = d + 4) {
            System.out.println(d + " год является високосным.");
        }

        System.out.println("Задание 6.2.2.");
        for (int e  = 7; e <= 98; e = e + 7) {
            System.out.println(e);
        }

        System.out.println("Задание 6.2.3.");
        for (int f  = 1; f <= 512; f = f * 2) {
            System.out.println(f);
        }

        System.out.println("Задание 6.3.1.");
        int savingsInMonth = 29000;
        int totalSavingsInYear = 0;
        for (int g = 1; g <= 12; g ++) {
            totalSavingsInYear = totalSavingsInYear + savingsInMonth;
            System.out.println("Месяц " + g + ", сумма накоплений равна " + totalSavingsInYear + " рублей.");
        }

        System.out.println("Задание 6.3.2.");
        int savingsInMonth1 = 29000;
        int totalSavingsInYear1 = 0;
        for (int h = 1; h <= 12; h ++) {
            totalSavingsInYear1 = totalSavingsInYear1 + savingsInMonth1;
            totalSavingsInYear1 = totalSavingsInYear1 + (totalSavingsInYear1 / 100);
            System.out.println("Месяц " + h + ", сумма накоплений равна " + totalSavingsInYear1 + " рублей.");
        }
    }
}