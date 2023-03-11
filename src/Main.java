public class Main {
    public static void main(String[] args) {
        task1();
        task2();
    }
    // генерируем случайные значения
    // для этого вызываем метод generateRandomArray():
    // значения от 100000 до 200000
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void task1() {
        System.out.println("Задача 1");
        int[] arr = generateRandomArray(); // вызвали метод со случайными значениями от 100 до 200 тыс
        //Бухгалтеры попросили посчитать сумму всех выплат за месяц.
        //Напишите программу, которая решит эту задачу, и выведите в консоль результат в формате:
        //«Сумма трат за месяц составила … рублей».
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
    }

    public static void task2() {
        System.out.println("Задача 2");
        int[] arr = generateRandomArray();
        //Также бухгалтерия попросила найти минимальную и максимальную трату за день
        //Напишите программу, которая решит эту задачу, и выведите в консоль результат в формате:
        //«Минимальная сумма трат за день составила … рублей. Максимальная сумма трат за день составила … рублей».
        int minExpense = arr[0];
        int maxExpense = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minExpense) {
                minExpense = arr[i];
            }
            if (arr[i] > maxExpense) {
                maxExpense = arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minExpense + " рублей. " +
                "Максимальная сумма трат за день составила " + maxExpense + " рублей»");
    }
}