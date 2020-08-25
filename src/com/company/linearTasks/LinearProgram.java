package com.company.linearTasks;

import java.util.Scanner;

public class LinearProgram {
    public void select() {
        System.out.print("Выберите задание от 1 до 6: ");

        Scanner input = new Scanner(System.in);
        int select = input.nextInt();
        System.out.println("=======================");
        switch (select) {
            case 1: {
                System.out.println("Найдите значение фунции: z = ( (a - 3) * b / 2) + c");
                System.out.print("Введите значение a: ");
                double a = input.nextDouble();
                System.out.print("\nВведите значение b: ");
                double b = input.nextDouble();
                System.out.print("\nВведите значение c: ");
                double c = input.nextDouble();

                double z = firstTask(a, b, c);

                System.out.println("z = " + z);
            }
            break;
            case 2: {
                System.out.println("Вычислить значения выражения по формуле (b + ..");

                System.out.print("Введите значение a: ");
                double a = input.nextDouble();
                System.out.print("\nВведите значение b: ");
                double b = input.nextDouble();
                System.out.print("\nВведите значение c: ");
                double c = input.nextDouble();

                System.out.println("Результат: " + secondTask(a, b, c));
            }
            break;
            case 3: {
                System.out.println("Вычислить значения выражения по формуле sin(x)+...");

                System.out.print("Введите значение x: ");
                double x = input.nextDouble();
                System.out.print("\nВведите значение y: ");
                double y = input.nextDouble();

                System.out.println("Результат: " + thirdTask(x, y));
            }
            break;
            case 4: {
                double x = 111.222;
                System.out.println("Дано: " + x);
                double y = (x * 1000) % 1000 + (int) x / 1000.0;
                System.out.println("Изменение мест: " + y);
            }
            break;
            case 5: {
                System.out.println("Дано натуральное число Т, " +
                        "которое представляет длительность прошедшего времени в секундах. " +
                        "Вывести значение длительности в часах, минутах и секундах.");

                System.out.print("Сколько секунд прошло?: ");
                int sec = input.nextInt();
                fifthTask(sec);
            }
            break;
            case 6: {
                System.out.print("Введите координату x: ");
                double x = input.nextDouble();
                System.out.print("\nВведите координату y: ");
                double y = input.nextDouble();

                System.out.println(sixthTask(x, y));
            }
            break;
        }
    }

    private double firstTask(double a, double b, double c) {
        return ((a - 3) * b / 2) + c;
    }

    private double secondTask(double a, double b, double c) {
        return ((b + Math.sqrt((Math.pow(b, 2) + 4 * a * c))) / (2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2));
    }

    private double thirdTask(double x, double y) {
        return (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math.tan(x * y);
    }

    private void fifthTask(int sec) {
        int hours = sec / 3600;
        int mins = sec / 60 % 60;
        int secs = sec / 1 % 60;
        System.out.println(hours + ":" + mins + ":" + secs);
    }

    private boolean sixthTask(double x, double y) {
        if ((x >= -2 && x <= 2) == true && (y >= -1 && y <= 4) == true) {
            return true;
        } else if ((x >= -4 && x <= 4) == true && (y <= 0 && y >= -3) == true) {
            return true;
        } else return false;
    }
}