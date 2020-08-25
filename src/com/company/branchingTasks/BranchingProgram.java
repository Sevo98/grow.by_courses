package com.company.branchingTasks;

import java.util.Scanner;

public class BranchingProgram {
    public void select() {
        System.out.print("Выберите задание от 1 до 5: ");

        Scanner input = new Scanner(System.in);
        int select = input.nextInt();
        System.out.println("=======================");

        switch (select) {
            case 1: {
                System.out.println("Даны два угла треугольника (в градусах). Определить," +
                        "существует ли такой треугольник, и если да, то будет ли он прямоугольным.");
                System.out.print("Введите значения первого угла: ");
                double x = input.nextDouble();
                System.out.print("Введите значения второго угла: ");
                double y = input.nextDouble();
                firstTask(x, y);
            }
            break;
            case 2: {
                System.out.println("Найти max[min(a, b), min(c,d)]");
                System.out.print("Введите значения a: ");
                double a = input.nextDouble();
                System.out.print("Введите значения b: ");
                double b = input.nextDouble();
                System.out.print("Введите значения c: ");
                double c = input.nextDouble();
                System.out.print("Введите значения d: ");
                double d = input.nextDouble();

                System.out.println("Максимальное из минимальных это " + Math.max(Math.min(a, b), Math.min(c, d)));
            }
            break;
            case 3: {
                System.out.println("Даны три точки: A(x1, y1), B(x2, y2), C(x3, y3)." +
                        "Определить, будут ли они расположены на одной прямой");
                System.out.print("Введите значения точки A координаты x1: ");
                double x1 = input.nextDouble();
                System.out.print("Введите значения точки A координаты y1: ");
                double y1 = input.nextDouble();
                System.out.print("Введите значения точки B координаты x2: ");
                double x2 = input.nextDouble();
                System.out.print("Введите значения точки B координаты y2: ");
                double y2 = input.nextDouble();
                System.out.print("Введите значения точки C координаты x3: ");
                double x3 = input.nextDouble();
                System.out.print("Введите значения точки c координаты y3: ");
                double y3 = input.nextDouble();

                System.out.println(thirdTask(x1, y1, x2, y2, x3, y3));
            }
            break;
            case 4: {
                System.out.println("Заданы размеры А, В прямоугольного отверстия и размеры x, y, z кирпича. " +
                        "Определить, пройдет ли кирпич через отверстие.");
                System.out.print("Введите значение A: ");
                double A = input.nextDouble();
                System.out.print("Введите значение B: ");
                double B = input.nextDouble();
                System.out.print("Введите значение x: ");
                double x = input.nextDouble();
                System.out.print("Введите значение y: ");
                double y = input.nextDouble();
                System.out.print("Введите значение z: ");
                double z = input.nextDouble();
            }
            break;
            case 5: {
                System.out.println("Вычислить значение функции:\n-если x<= 3, то x^2 - 3x + 9.\n" +
                        "-если x > 3, то 1/(3^3 + 6)");
                System.out.print("Введите значение x: ");
                double x = input.nextDouble();
                if (x <= 3) {
                    System.out.println(Math.pow(x, 2) - 3 * x + 9);
                }
                if (x > 3) {
                    System.out.println(1 / (Math.pow(x, 3) + 6));
                }
            }
            break;
        }
    }

    private void firstTask(double x, double y) {
        boolean existence = false, rectangular = false;
        if ((x + y) < 180) {
            existence = true;
        }
        if ((180 - (x + y)) == 90) {
            rectangular = true;
        }
        if (existence) {
            System.out.print("Треугольник существует, ");
            if (rectangular) {
                System.out.println("он прямоугольный.");
            } else System.out.println("он не прямоугольный.");
        } else System.out.println("Треугольник не существует");
    }

    private boolean thirdTask(double x1, double y1, double x2, double y2, double x3, double y3) {
        if (x1 == x2 && x2 == x3) {
            return true;
        } else if (y1 == y2 && y2 == y3) {
            return true;
        } else return false;
    }

    private boolean fourthTask(double A, double B, double x, double y, double z) {
        if (A < x && B < y || A < x && B < z || A < z && B < y) {
            return true;
        }
        return false;
    }

}
