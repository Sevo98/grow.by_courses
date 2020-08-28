package com.company.cyclesTasks;

import java.math.BigInteger;
import java.util.Scanner;

public class CyclesProgram {
    public void select() {
        System.out.print("Выберите задание от 1 до 8: ");

        Scanner input = new Scanner(System.in);
        int select = input.nextInt();
        System.out.println("=======================");
        switch (select) {
            case 1: {
                System.out.print("Введите целое положительное число: ");
                int number = input.nextInt();
                int result = 0;
                for (int i = 1; i <= number; i++) {
                    result = i + result;
                }
                System.out.println("Сумма всех чисел от 1 до " + number + " равна " + result);
            }
            break;
            case 2: {
                System.out.println("Вычислить значение фунации на отрезке [a, b] с шагом h. " +
                        "y = x при x > 2 и y = - x при x <= 2");
                System.out.println("Введите а: ");
                int a = input.nextInt();
                System.out.println("Введите b: ");
                int b = input.nextInt();
                System.out.println("Введите шаг h: ");
                int h = input.nextInt();

                int y = 0;
                int x = a;

                while (x <= b) {
                    if (x > 2) {
                        y = x;
                    } else {
                        y = -x;
                    }
                    System.out.println("y = " + y);
                    x = x + h;
                }
            }
            break;

            case 3: {
                double result = 0;
                for (int i = 1; i <= 100; i++) {
                    result = result + Math.pow(i, 2);
                }
                System.out.println("Сумма квадратов первых ста чисел - " + result);
            }
            break;
            case 4: {
                BigInteger result = new BigInteger(String.valueOf(1));
                for (int i = 1; i < 200; i++) {
                    result = result.multiply(BigInteger.valueOf((long) Math.pow(i, 2)));
                }
                System.out.println("Произведение квадратов первых двухсот чисел - " + result);
            }
            break;
            case 5: {
                System.out.println("Дан числовой ряд и некоторое число e. Найти сумму тех членов ряда, " +
                        "модуль которых больше или равен заданному e. Общий член ряда имеет вид...");
                System.out.print("Введите некоторое число e: ");
                double e = input.nextDouble();
                int n = 1;
                double an = 1;
                int z = 1; //Знак
                double p = 1; // 1/n^n

                while (Math.abs(z * p) >= e) {
                    n = n + 1;
                    z = -z;
                    p = 1;
                    for (int i = 0; i < n; i++) {
                        p = p / n;
                        an = an + z * p;
                    }
                }
                System.out.println("an = " + an);
            }
            break;
            case 6: {
                System.out.print("Введите символ: ");
                input.nextLine();
                String symbols = input.nextLine();
                char symbolChar;
                int asciiCode;
                for (int i = 0; i < symbols.length(); i++) {
                    symbolChar = symbols.charAt(i);
                    asciiCode = (int) symbolChar;
                    System.out.println("Код символа " + symbolChar + " в таблице ASCI: " + asciiCode);
                }
            }
            break;
            case 7: {
                System.out.println("Для каждого натурального числа в промежутке от m до n вывести все делители," +
                        " кроме единицы и самого числа. m и n вводятся с клавиатуры.");
                System.out.print("Введите m: ");
                int m = input.nextInt();
                System.out.print("Введите n: ");
                int n = input.nextInt();

                for (int i = m; i < n; i++) {
                    System.out.print(i + ": ");
                    for (int j = 2; j < i / 2; j++) {
                        if ((i % j) == 0) {
                            System.out.print(j + " ");
                        }
                    }
                    System.out.println();
                }
            }
            break;
            case 8: {
                System.out.print("Введите первое число: ");
                int a = input.nextInt();
                System.out.print("Введите второе число: ");
                int b = input.nextInt();
                double d;
                int c;
                while (a > 0) {
                    d = a % 10;
                    a = a / 10;
                    c = b;
                    while (c > 0) {
                        if ((c % 10) == d) {
                            System.out.print(d + " ");
                            break;
                        }
                        c = c / 10;
                    }
                }
            }
            break;
        }
    }
}
