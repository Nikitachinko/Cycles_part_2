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
    }

    public static void task1() {
        System.out.println("Задача 1!");
        int monthNumber = 1;
        int sum = 0;
        while (sum < 2_459_000) {
            sum += 15_000;
            System.out.println("Месяц " + monthNumber++ + " сумма накоплений равна " + sum + " рублей");
        }
    }

    public static void task2() {
        int i = 1;
        while (i <= 10) {
            if (i == 10) {
                System.out.println(i);
                break;
            }
            System.out.print(i + " ");
            i++;
        }
        for (i = 10; i > 0; i--) {
            if (i == 1) {
                System.out.println(i);
                break;
            }
            System.out.print(i + " ");
        }
    }

    public static void task3() {
        System.out.println("Задача 3!");
        int population = 12_000_000;
        int birthRate = 17 * population / 1000;
        int deathRate = 8 * population / 1000;
        for (int i = 1; i <= 10; i++) {
            population = population + birthRate;
            population = population - deathRate;
            System.out.println("Год " + i + " численность населения составляет " + population);
        }
    }

    public static void task4() {
        System.out.println("Задача 4!");
        int sum = 15_000;
        int monthNum = 1;
        while (sum <= 12_000_000) {
            sum *= 1.07;
            System.out.println(monthNum++ + " Месяц " + sum + " сумма ");
        }
    }
    public static void task5() {
        System.out.println("Задача 5!");
        int sum = 15_000;
        int monthNum = 1;
        while (sum <= 12_000_000) {
            sum *= 1.07;
            if (monthNum % 6 == 0) {
                System.out.println( monthNum + " Месяц " + sum + " сумма ");
            }
            monthNum++;
        }
    }
    public static void task6() {
        System.out.println("Задача 6!");
        int sum = 15000;
        for (int i = 1; i<9*12; i= i+6){
            int sumBefore = sum;
            sum *=1+0.07*6;
            System.out.println("Месяц "+ i + " сумма " + (sum-sumBefore));
        }
    }
    public static void task7() {
        System.out.println("Задача 7!");
        int firstFriday=6;
        for(int currentFriday = firstFriday; currentFriday<=31; currentFriday+= 7){
            System.out.println(" Сегодня пятница " + currentFriday + " -ое число. " + " Необходимо подготовить отчет. ");
        }
    }
    public static void task8() {
        System.out.println("Задача 8!");
        int currentYear = 2022;
        int beginning = currentYear - 200;
        int ending = currentYear+100;
        for(int i = beginning; i<ending; ++i){
            if(i%79==0){
                System.out.println(i);
            }
        }
    }
}