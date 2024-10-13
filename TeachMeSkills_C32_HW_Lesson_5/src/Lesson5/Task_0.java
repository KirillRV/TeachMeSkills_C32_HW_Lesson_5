package Lesson5;

import java.util.Arrays;
import java.util.Scanner;
/**
 * 0. Создать трехмерный массив из целых чисел.
 * С помощью циклов "пройти" по всему массиву и увеличить каждый
 * элемент на заданное число. Пусть число, на которое будет
 * увеличиваться каждый элемент, задается из консоли.
 */
public class Task_0 {
    public static void main(String[] args) {
        System.out.print("Enter value to multiple your array: ");
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();

        int[][][] Array = {{{1, 2, 3},
                          {4, 5, 6}},
                          {{7, 8, 9}}};
        for(int[][] array1: Array) {
            for(int[] array2: array1) {
                for(int item: array2) {
                    System.out.print(item*value + " ");
                }
                System.out.println();
            }
        }
    }
}
