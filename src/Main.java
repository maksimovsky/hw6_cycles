public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
    }

    public static void task1() {
        System.out.println("Задача 1");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    public static void task2() {
        System.out.println("\nЗадача 2");
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
    }

    public static void task3() {
        System.out.println("\nЗадача 3");
        for (int i = 0; i <= 17; i += 2) {
            System.out.println(i);
        }
    }

    public static void task4() {
        System.out.println("\nЗадача 4");
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }
    }

    public static void task5() {
        System.out.println("\nЗадача 5");
        for (int year = 1904; year <= 2096; year += 4) {
            System.out.println(year + " год является високосным");
        }
    }

    public static void task6() {
        System.out.println("\nЗадача 6");
        for (int i = 7; i <= 98; i += 7) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void task7() {
        System.out.println("\nЗадача 7");
        for (int i = 1; i <= 512; i *= 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void task8() {
        System.out.println("\nЗадача 8");
        int total = 0;
        int payment = 29000;
        for (int i = 1; i <= 12; i++) {
            total += payment;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }
    }

    public static void task9() {
        System.out.println("\nЗадача 9");
        double total = 0;
        int payment = 29000;
        for (int i = 1; i <= 12; i++) {
            total = total + total / 100 + payment;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }
    }

    public static void task10() {
        System.out.println("\nЗадача 10");
        int num = 2;
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + "*" + i + "=" + i * num);
        }
    }
}