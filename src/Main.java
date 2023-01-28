import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Задача 1");
    }

    public static void task2() {
        System.out.println("Задача 2");
        int[] num1 = new int[3];
        num1[0] = 1;
        num1[1] = 2;
        num1[2] = 3;
        System.out.println(num1[0] + ", " + num1[1] + ", " + num1[2]);

        double[] num2 = {1.57, 7.654, 9.986};
        for (int i = 0; i < num2.length; i++) {
            System.out.print(num2[i]);
            if (i != num2.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("");
        int[] num3 = {10, 20, 30, 40};
        for (int i = 0; i < num3.length; i++) {
            System.out.print(num3[i]);
            if (i != num3.length - 1) {
                System.out.print(", ");
            }
        }
    }

    public static void task3() {
        System.out.println("");
        System.out.println("Задача 3");
        System.out.println("Массив №1");
        int[] num1 = new int[3];
        {
            for (int i = num1.length - 1; i >= 0; i--) {
                num1[i] = i + 1;
                System.out.print(num1[i]);
                if (i > 0) {
                    System.out.print(", ");
                }
            }
        }
        System.out.println();
        System.out.println("Массив №2");
        double[] num2 = {1.57, 7.654, 9.986};
        for (int i = num2.length - 1; i >= 0; i--) {
            System.out.print(num2[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println("Массив №3");
        int[] num3 = {10, 20, 30, 40};
        for (int i = num3.length - 1; i >= 0; i--) {
            System.out.print(num3[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
    }

    public static void task4() {
        System.out.println();
        System.out.println("Задача 4");
        int[] num = {1, 2, 3};
        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 != 0) {
                num[i] += 1;
            }
        }
                System.out.println(Arrays.toString(num));
            }
        }






