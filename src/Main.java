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
        System.out.println("Task1");
        int[] arr = generateRandomArray();
        System.out.println(Arrays.toString(arr));
        int sum = 0;
        for (int i : arr) {
            sum = sum + i;
        }
        System.out.println(sum);
        System.out.println();

    }

    public static void task2() {
        System.out.println("Task2");
        int[] arr = generateRandomArray();
        int maxNumber = arr[0];
        int minNumber = arr[0];
        System.out.println(Arrays.toString(arr));
        for (int j : arr) {
            if (j > maxNumber) {
                maxNumber = j;
            }
        }
        System.out.println("Максимальное значение = " + maxNumber);
        System.out.println("Минимальное значение = " + minNumber);
    }

    public static void task3() {
        System.out.println("Task3");
        int[] arr = generateRandomArray();
        int sum = 0;
        System.out.println(Arrays.toString(arr));
        for (int i : arr) {
            sum = sum + i;
        }
        System.out.println("Среднее значение = " + (double) sum / arr.length + " рублей");
    }

    public static void task4() {
        System.out.println("Task4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}

