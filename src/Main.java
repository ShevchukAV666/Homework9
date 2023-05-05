import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();


    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
        System.out.println();
    }


    public static void task2() {
        int[] arr = generateRandomArray();
        int maxSalary = 0;
        int minSalary = 200_000;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minSalary) {
                minSalary = arr[i];
            } else if (arr[i] > maxSalary) {
                maxSalary = arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minSalary + " рублей. Максимальная сумма трат за день составила " + maxSalary + " рублей");
        System.out.println();
    }
    public static void task3() {
        int[] arr = generateRandomArray();
        double summ = 0; // общая сумма трат
        double average = 0;// средняя з/п
        for (int i = 0; i < arr.length; i++) {
            summ = summ + arr[i];
            average = summ / 30;
        }
        System.out.println("Средняя сумма трат за месяц составила " +average+ " рублей.");
        System.out.println();
        }
    public static void task4() {
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >=0 ; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
    }

















