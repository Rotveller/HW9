public class Main {
    public static void main(String[] args) {
        task1();
        task2();
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
        int maxNumbers = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxNumbers) {
                maxNumbers = arr[i];
            }
        }
        System.out.println(maxNumbers);
    }
}
