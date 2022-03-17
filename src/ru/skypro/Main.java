package ru.skypro;

import java.time.Year;

public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1 () {
        int Number = 0;

        while (Number <= 9){
            Number++;
            System.out.println(Number);
            }
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
    }

    public static void task2 () {
        for (int Friday = 1; Friday <= 31; Friday++) {
            if (Friday % 5 == 0) {
                System.out.println("Сегодня пятница " + Friday + " число. Необходимо подготовить отчет.");
                continue;
            }
            System.out.println("тчёт делать не нужно!");
        }

    }

    public static void task3 () {
        for (int Year = 1822; Year <= 2122; Year++) {
            if (Year % 79 == 0) {
                System.out.println(Year);
            }
        }
    }
}
