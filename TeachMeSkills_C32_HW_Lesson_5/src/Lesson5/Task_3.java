package Lesson5;

/**
 * Создайте двумерный массив целых чисел. Выведите на консоль сумму
 * всех элементов массива.
 */
public class Task_3 {
    public static void main(String[] args) {
        int[][] array = new int[5][5];
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int)(10*Math.random());
                sum += array[i][j];
                System.out.print("  " + array[i][j]);
            }
            System.out.println();
        }
        System.out.println("\nSum of array: " + sum);
    }
}
