import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        int[] warehouse1 = new int[3];
        warehouse1 [0] = 1;
        warehouse1 [1] = 2;
        warehouse1 [2] = 3;
        for (int i = 0; i < warehouse1.length; i++) {
            System.out.println(warehouse1[i]);
        }
        System.out.println();
        double[] warehouse2 = {1.57, 7.654, 9.986};
        for (int i = 0; i < warehouse2.length; i++) {
            System.out.println(warehouse2[i]);
        }
        System.out.println();
        int[] warehouse3 = {15, 1, 3, 4, 5, 5, 222};
        for (int i = 0; i < warehouse3.length; i++) {
            System.out.println(warehouse3[i]);
        }
        System.out.println();
    }


    public static void task2 () {
        System.out.println("Задача 2");
        int[] warehouse1 = new int[3];
        warehouse1 [0] = 1;
        warehouse1 [1] = 2;
        warehouse1 [2] = 3;
        System.out.print(warehouse1[0]);
        for (int i = 1; i < warehouse1.length; i++) {
            System.out.print(", " + warehouse1[i]);
        }
        System.out.println();
        double[] warehouse2 = {1.57, 7.654, 9.986};
        System.out.print(warehouse2[0]);
        for (int i = 1; i < warehouse2.length; i++) {
            System.out.print(", " + warehouse2[i]);
        }
        System.out.println();
        int[] warehouse3 = {15, 1, 3, 4, 5, 5, 222};
        System.out.print(warehouse3[0]);
        for (int i = 1; i < warehouse3.length; i++) {
            System.out.print(", " + warehouse3[i]);
        }
        System.out.println();
        System.out.println();
    }
    public static void task3 () {
        System.out.println("Задача 3");
        int[] warehouse1 = new int[3];
        warehouse1 [0] = 1;
        warehouse1 [1] = 2;
        warehouse1 [2] = 3;
        System.out.print(warehouse1[warehouse1.length - 1]);
        for (int i = (warehouse1.length - 2); i >= 0; i--) {
            System.out.print(", " + warehouse1[i]);
        }
        System.out.println();
        double[] warehouse2 = {1.57, 7.654, 9.986};
        System.out.print(warehouse2[warehouse2.length - 1]);
        for (int i = (warehouse2.length - 2); i >= 0; i--) {
            System.out.print(", " + warehouse2[i]);
        }
        System.out.println();
        int[] warehouse3 = {15, 1, 3, 4, 5, 5, 222};
        System.out.print(warehouse3[warehouse3.length - 1]);
        for (int i = (warehouse3.length - 2); i >= 0; i--) {
            System.out.print(", " + warehouse3[i]);
        }
        System.out.println();
        System.out.println();
    }
    public static void task4 () {
        System.out.println("Задача 4");
        int[] warehouse1 = new int[5];
        warehouse1[0] = 1;
        warehouse1[1] = 2;
        warehouse1[2] = 3;
        warehouse1[3] = 4;
        warehouse1[4] = 5;
        System.out.println("Массив изначальный: " + Arrays.toString(warehouse1));
        for (int i = 0; i < warehouse1.length; i++) {
            if (warehouse1[i] % 2 == 1) {
                warehouse1[i] += 1;
            }
        }
        System.out.println("Массив новый: " + Arrays.toString(warehouse1));
    }
}